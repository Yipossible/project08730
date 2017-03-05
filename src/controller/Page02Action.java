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
import formbean.Page02Form;
import model.Model;
import model.RespondentDAO;
import model.ResponseDAO;

public class Page02Action extends Action {
	private FormBeanFactory<Page02Form> formBeanFactory = FormBeanFactory.getInstance(Page02Form.class);
	
	private ResponseDAO responseDAO;
    private RespondentDAO respondentDAO;

    public Page02Action(Model model) {
        responseDAO = model.getResponseDAO();
        respondentDAO = model.getRespondentDAO();
    }

    @Override
    public String getName() {
        return "page02.do";
    }

    @Override
    public String perform(HttpServletRequest request) {
        List<String> errors = new ArrayList<String>();
        List<String> successMessage = new ArrayList<String>();
        HttpSession session = request.getSession();
        session.setAttribute("successMessage", successMessage);
        session.setAttribute("nextPage", "page03.do");
        session.setAttribute("errors", errors);
        try {
            Page02Form form = formBeanFactory.create(request);
            System.out.println(!form.isPresent());
            if (!form.isPresent()) {
                return "Page02.jsp";
            }

            errors.addAll(form.getValidationErrors());
            if (errors.size() != 0) {
                System.out.println(errors);
                return "Page02.jsp";
            }
            String unique_id = (String) session.getAttribute("unique_id"); // store in session
            RespondentBean r = respondentDAO.read(unique_id);
            if (!r.isFull_payment()) {
                return "NotEligible.jsp";
            }
            
            System.out.print("test");
            System.out.println(form.getOver18().equals("Yes") == true);
            System.out.println(form.getOver18().toString());
            System.out.println(r);
            if (r != null) {
                ResponseBean t = new ResponseBean(); 
                t.setQuestion_id(0);
                t.setResponse(form.getOver18() +',' + form.getLivedOver3()+',' + form.getOver2adult()+',' + form.getUnderstand()+',' + form.getParticipate()+',' + form.getEmail());
                t.setRespondent_id(r.getRespondent_id());
                responseDAO.create(t);
                r.setEmail(form.getEmail());
                
                if (form.getOver18().equals("Yes") == false || form.getLivedOver3().equals("Yes") == false || form.getOver2adult().equals("Yes") == false || form.getUnderstand().equals("Yes") == false || form.getParticipate().equals("Yes") == false) {
                    r.setFull_payment(false);
                    return "NotEligible.jsp";
                }
            }
            else {
                return "Page02.jsp";
            }
            return "page03.do";
        } catch (RollbackException e) {
            errors.add(e.toString());
            return "error.jsp";
        } catch (FormBeanException e) {
            errors.add(e.toString());
            return "error.jsp";
        }
    }

}
