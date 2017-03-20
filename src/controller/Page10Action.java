package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.genericdao.RollbackException;
import org.mybeans.form.FormBeanException;
import org.mybeans.form.FormBeanFactory;

import databeans.RespondentBean;
import formbean.Page10Form;
import model.Model;
import model.RespondentDAO;
import model.ResponseDAO;

public class Page10Action extends Action{

	private FormBeanFactory<Page10Form> formBeanFactory = FormBeanFactory.getInstance(Page10Form.class); 
	private ResponseDAO responseDAO;
	 private RespondentDAO respondentDAO;
	
	public Page10Action(Model model) {
		responseDAO = model.getResponseDAO();
		respondentDAO = model.getRespondentDAO();
	}
	@Override
	public String getName() {
			return "page10.do";
	}
		
	@Override
	public String perform(HttpServletRequest request) {
		List<String> errors = new ArrayList<String>();
		HttpSession session = request.getSession();
		session.setAttribute("nextPage", "page11.do");
		try {
		    String unique_id = (String) session.getAttribute("unique_id"); // store in session
            RespondentBean p = respondentDAO.read(unique_id);
            if (!p.isFull_payment()) {
                return "NotEligible.jsp";
            }
			Page10Form form = formBeanFactory.create(request);
			
			if (!form.isPresent()) {
				return "Page10.jsp";
			}
			
			errors.addAll(form.getValidationErrors());
			session.setAttribute("errors", errors);
			if (errors.size() > 0) {
				return "Page10.jsp";
			}
			
			return "page11.do";
			
		} catch (RollbackException e) {
            System.out.println("in transaction");
//          errors.add(e.getMessage());
            return "Page10.jsp";
		} catch (FormBeanException e) {
			errors.add(e.getMessage());
			return "Page10.jsp";
		}
		
			
		}
}
