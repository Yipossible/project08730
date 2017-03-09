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
import formbean.Page03Form;
import model.Model;
import model.RespondentDAO;
import model.ResponseDAO;

public class Page03Action extends Action {
	private FormBeanFactory<Page03Form> formBeanFactory = FormBeanFactory.getInstance(Page03Form.class);
	
	private ResponseDAO responseDAO;
    private RespondentDAO respondentDAO;

    public Page03Action(Model model) {
        responseDAO = model.getResponseDAO();
        respondentDAO = model.getRespondentDAO();
    }

    @Override
    public String getName() {
        return "page03.do";
    }

    @Override
    public String perform(HttpServletRequest request) {
        List<String> errors = new ArrayList<String>();
        List<String> successMessage = new ArrayList<String>();
        HttpSession session = request.getSession();
        session.setAttribute("successMessage", successMessage);
        session.setAttribute("errors", errors);
        session.setAttribute("nextPage", "page04.do");
        try {
            Page03Form form = formBeanFactory.create(request);
            System.out.println(!form.isPresent());
            if (!form.isPresent()) {
                return "Page03.jsp";
            }

            errors.addAll(form.getValidationErrors());
            if (errors.size() != 0) {
                System.out.println("errors" + errors);
                return "Page03.jsp";
            }
            String unique_id = (String) session.getAttribute("unique_id"); // store in session
            RespondentBean r = respondentDAO.read(unique_id);
            if (!r.isFull_payment()) {
                return "NotEligible.jsp";
            }
            System.out.println("full" + r.isFull_payment());
            if (r != null) {
                // store question 1~3 to the response table
            	System.out.println("enter page 3 answer");
                ResponseBean t = new ResponseBean(); 
            	t.setQuestion_id(1);
            	t.setResponse(form.getZipcode() +',' + form.getCityLiveTime() + "years");
            	t.setRespondent_id(r.getRespondent_id());
            	responseDAO.create(t);
            	r.setZipcode(form.getZipcode());
            	
                t = new ResponseBean(); 
                t.setQuestion_id(2);
                t.setResponse(form.getAge() +  "years old");
                t.setRespondent_id(r.getRespondent_id());
                responseDAO.create(t);
                
                
                t = new ResponseBean(); 
                t.setQuestion_id(3);
                t.setResponse(form.getPreschool()+','+form.getK12()+','+form.getUnder30()+','+form.getFrom30to65()+','+form.getOver65()
                + "," + form.getAddress());
                r.setGeo_info(form.getAddress());
                t.setRespondent_id(r.getRespondent_id());
                int adults = Integer.parseInt(form.getUnder30())+Integer.parseInt(form.getFrom30to65())+Integer.parseInt(form.getOver65());
                responseDAO.create(t);
                System.out.println(adults);
                System.out.println("response: " + t.getResponse());
                if (Integer.parseInt(form.getCityLiveTime()) < 3 || Integer.parseInt(form.getAge()) < 18 || adults < 2){
                    r.setFull_payment(false);
                    return "NotEligible.jsp";
                }
                r.setAge(Integer.parseInt(form.getAge()));
            }
            else {
                return "Page03.jsp";
            }
            return "page04.do";
        } catch (RollbackException e) {
            errors.add(e.toString());
            return "error.jsp";
        } catch (FormBeanException e) {
            errors.add(e.toString());
            return "error.jsp";
        }
    }

}
