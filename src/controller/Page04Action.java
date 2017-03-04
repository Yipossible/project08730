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
import formbean.Page04Form;
import model.Model;
import model.RespondentDAO;
import model.ResponseDAO;

public class Page04Action extends Action {
	private FormBeanFactory<Page04Form> formBeanFactory = FormBeanFactory.getInstance(Page04Form.class);
	
	private ResponseDAO responseDAO;
    private RespondentDAO respondentDAO;

    public Page04Action(Model model) {
        responseDAO = model.getResponseDAO();
        respondentDAO = model.getRespondentDAO();
    }

    @Override
    public String getName() {
        return "page04.do";
    }

    @Override
    public String perform(HttpServletRequest request) {
        List<String> errors = new ArrayList<String>();
        List<String> successMessage = new ArrayList<String>();
        HttpSession session = request.getSession();
        session.setAttribute("successMessage", successMessage);
        session.setAttribute("errors", errors);
        session.setAttribute("nextPage", "page05.do");
        try {
            Page04Form form = formBeanFactory.create(request);
            System.out.println(!form.isPresent());
            if (!form.isPresent()) {
                return "Page04.jsp";
            }

            errors.addAll(form.getValidationErrors());
            if (errors.size() != 0) {
                System.out.println(errors);
                return "Page04.jsp";
            }
            String unique_id = (String) session.getAttribute("unique_id"); // store in session
            RespondentBean r = respondentDAO.read(unique_id);
            if (!r.isFull_payment()) {
                return "NotEligible.jsp";
            }
            System.out.println(r);
            if (r != null) {
                // store question 4~5 to the response table
                ResponseBean t = new ResponseBean(); 
                t.setQuestion_id(4);
                t.setResponse(form.getWorkFromHome() +',' + form.getWorkFromHomeExplain());
                t.setRespondent_id(r.getRespondent_id());
                responseDAO.create(t);
                
                t.setQuestion_id(5);
            	t.setResponse(form.getDevice() +',' + form.getDeviceExplain());
            	t.setRespondent_id(r.getRespondent_id());
            	responseDAO.create(t);

                t = new ResponseBean(); 
                t.setQuestion_id(6);
                t.setResponse(form.getHouseType() + ',' + form.getHouseLiveTime());
                t.setRespondent_id(r.getRespondent_id());
                responseDAO.create(t);
            }
            else {
                return "Page04.jsp";
            }
            return "page05.do";
        } catch (RollbackException e) {
            errors.add(e.toString());
            return "error.jsp";
        } catch (FormBeanException e) {
            errors.add(e.toString());
            return "error.jsp";
        }
    }

}
