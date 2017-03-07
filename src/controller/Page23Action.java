package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.genericdao.RollbackException;
import org.mybeans.form.FormBeanException;
import org.mybeans.form.FormBeanFactory;

import databeans.RespondentBean;
import databeans.ResponseBean;
import formbean.Page23Form;
import model.Model;
import model.RespondentDAO;
import model.ResponseDAO;

public class Page23Action extends Action {
	private FormBeanFactory<Page23Form> formBeanFactory = FormBeanFactory.getInstance(Page23Form.class);
	
	private ResponseDAO responseDAO;
    private RespondentDAO respondentDAO;

    public Page23Action(Model model) {
        responseDAO = model.getResponseDAO();
        respondentDAO = model.getRespondentDAO();
    }

    @Override
    public String getName() {
        return "page23.do";
    }

    @Override
    public String perform(HttpServletRequest request) {
        List<String> errors = new ArrayList<String>();
        List<String> successMessage = new ArrayList<String>();
        HttpSession session = request.getSession();
        session.setAttribute("successMessage", successMessage);
        session.setAttribute("errors", errors);
        session.setAttribute("nextPage", "page24.do");
        try {
            Page23Form form = formBeanFactory.create(request);
            System.out.println(!form.isPresent());
            if (!form.isPresent()) {
                System.out.println(form);
                return "Page23.jsp";
            }

//            errors.addAll(form.getValidationErrors());
//            if (errors.size() != 0) {
//                return "Page23.jsp";
//            }
            String unique_id = (String) session.getAttribute("unique_id"); // store in session
            RespondentBean r = respondentDAO.read(unique_id);
            if (!r.isFull_payment()) {
                return "NotEligible.jsp";
            }
            System.out.println(r);
            
            if (r != null) {
                // store question 1~3 to the response table
                ResponseBean t = new ResponseBean(); 
            	t.setQuestion_id(23);
            	t.setResponse(form.getRace());
            	t.setRespondent_id(r.getRespondent_id());
            	responseDAO.create(t);
                
                t = new ResponseBean(); 
                t.setQuestion_id(24);
                t.setResponse(form.getIncome());
                t.setRespondent_id(r.getRespondent_id());
                responseDAO.create(t);
                
                t = new ResponseBean(); 
                t.setQuestion_id(25);
                t.setResponse(form.getPayer()+','+form.getEstimate_kWh()+"kWh,"+form.getEstimate_amps()+"amps");
                t.setRespondent_id(r.getRespondent_id());
                responseDAO.create(t);
            }
            else {
            	
                return "Page23.jsp";
            }
            return "page24.do";
        } catch (RollbackException e) {
            errors.add(e.toString());
            return "error.jsp";
        } catch (FormBeanException e) {
            errors.add(e.toString());
            return "Page23.jsp";
        }
    }

}
