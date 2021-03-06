package controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.genericdao.RollbackException;
import org.mybeans.form.FormBeanException;
import org.mybeans.form.FormBeanFactory;

import databeans.RespondentBean;
import databeans.ResponseBean;
import formbean.Page03Form;
import formbean.PaymentForm;
import model.Model;
import model.RespondentDAO;
import model.ResponseDAO;

public class PaymentAction extends Action {
	private FormBeanFactory<PaymentForm> formBeanFactory = FormBeanFactory.getInstance(PaymentForm.class);
	
	private ResponseDAO responseDAO;
    private RespondentDAO respondentDAO;

    public PaymentAction(Model model) {
        responseDAO = model.getResponseDAO();
        respondentDAO = model.getRespondentDAO();
    }

    @Override
    public String getName() {
        return "payment.do";
    }

    @Override
    public String perform(HttpServletRequest request) {
        List<String> errors = new ArrayList<String>();
        List<String> successMessage = new ArrayList<String>();
        HttpSession session = request.getSession();
        session.setAttribute("successMessage", successMessage);
        session.setAttribute("errors", errors);
        try {
            PaymentForm form = formBeanFactory.create(request);
            System.out.println(!form.isPresent());
            if (!form.isPresent()) {
                return "Payment.jsp";
            }

            errors.addAll(form.getValidationErrors());
            if (errors.size() != 0) {
                System.out.println("errors" + errors);
                return "Payment.jsp";
            }
            String unique_id = (String) session.getAttribute("unique_id"); // store in session
            RespondentBean r = respondentDAO.read(unique_id);
            System.out.println(r);
            if (r != null) {
                ResponseBean t = new ResponseBean(); 
            	t.setQuestion_id(30);
            	t.setResponse(form.getAmazonAccount());
            	t.setRespondent_id(r.getRespondent_id());
            	responseDAO.create(t);
            	
            	ResponseBean t2 = new ResponseBean(); 
                t2.setQuestion_id(31);
                t2.setResponse("Submitted at:" + LocalDateTime.now().toString());
                t2.setRespondent_id(r.getRespondent_id());
                responseDAO.create(t2);
            }
            else {
                return "Payment.jsp";
            }
            successMessage.add("Successfully recorded!");
            r.setPayment_account(form.getAmazonAccount());
            respondentDAO.update(r);
            return "Success.jsp";
        } catch (RollbackException e) {
            errors.add(e.toString());
            return "error.jsp";
        } catch (FormBeanException e) {
            errors.add(e.toString());
            return "error.jsp";
        }
    }

}
