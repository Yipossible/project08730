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
import formbean.Page24Form;
import model.Model;
import model.RespondentDAO;
import model.ResponseDAO;

public class Page24Action extends Action {
	private FormBeanFactory<Page24Form> formBeanFactory = FormBeanFactory.getInstance(Page24Form.class);
	
	private ResponseDAO responseDAO;
    private RespondentDAO respondentDAO;

    public Page24Action(Model model) {
        responseDAO = model.getResponseDAO();
        respondentDAO = model.getRespondentDAO();
    }

    @Override
    public String getName() {
        return "page24.do";
    }

    @Override
    public String perform(HttpServletRequest request) {
        List<String> errors = new ArrayList<String>();
        List<String> successMessage = new ArrayList<String>();
        HttpSession session = request.getSession();
        session.setAttribute("successMessage", successMessage);
        session.setAttribute("errors", errors);
        try {
            Page24Form form = formBeanFactory.create(request);
            System.out.println(!form.isPresent());
            if (!form.isPresent()) {
                System.out.println(form);
                return "Page24.jsp";
            }

//            errors.addAll(form.getValidationErrors());
//            if (errors.size() != 0) {
//                return "Page24.jsp";
//            }
            String unique_id = (String) session.getAttribute("unique_id"); // store in session
            RespondentBean r = respondentDAO.read(unique_id);
            System.out.println(r);
            if (r != null) {
                // store question 1~3 to the response table
                ResponseBean t = new ResponseBean(); 
            	t.setQuestion_id(27);
            	t.setResponse(form.getExperience());
            	t.setRespondent_id(r.getRespondent_id());
            	responseDAO.create(t);
                
                t = new ResponseBean(); 
                t.setQuestion_id(28);
                t.setResponse(form.getAvailable_1() + "," +form.getAvailable_2() + "," +form.getAvailable_3() + "," +form.getAvailable_4() + "," +form.getAvailable_5() + "," +form.getAvailable_6() + "," +form.getAvailable_7() + "," +form.getAvailable_8() + "," +form.getAvailable_9());
                t.setRespondent_id(r.getRespondent_id());
                responseDAO.create(t);
            }
            else {
            	
                return "Page24.jsp";
            }
            return "page25.do";
        } catch (RollbackException e) {
            errors.add(e.toString());
            return "error.jsp";
        } catch (FormBeanException e) {
            errors.add(e.toString());
            return "error.jsp";
        }
    }

}
