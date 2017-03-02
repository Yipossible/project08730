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
import formbean.Page21Form;
import model.Model;
import model.RespondentDAO;
import model.ResponseDAO;

public class Page21Action extends Action {
	private FormBeanFactory<Page21Form> formBeanFactory = FormBeanFactory.getInstance(Page21Form.class);
	private ResponseDAO responseDAO;
	private RespondentDAO respondentDAO;
	
	public Page21Action (Model model) {
		responseDAO = model.getResponseDAO();
		respondentDAO = model.getRespondentDAO();
	}
	
	@Override
	public String getName() {
		return "page21.do";
	}

	@Override
	public String perform(HttpServletRequest request) {
		List<String> errors = new ArrayList<String>();
		HttpSession session = request.getSession();
		session.setAttribute("nextPage", "page22.do");
		try {
			Page21Form form = formBeanFactory.create(request);
			
			if (!form.isPresent()) {
				return "Page21.jsp";
			}
			

			errors.addAll(form.getValidationErrors());
			System.out.println(errors);
			session.setAttribute("errors", errors);
			if (errors.size() > 0) {
				return "Page21.jsp";
			}
			
			 String unique_id = (String) session.getAttribute("unique_id"); // store in session
	            RespondentBean respondentBean = respondentDAO.read(unique_id);
	            
	            if (respondentBean != null) {
			
			ResponseBean r = new ResponseBean();
			r.setQuestion_id(21);
			r.setRespondent_id(respondentBean.getRespondent_id());
			r.setResponse(form.getPrice());
			responseDAO.create(r);
			
	            } else {
	            	return "Page21.jsp";
	            }
			
			return "page22.do";
		} catch (RollbackException e) {
			errors.add(e.getMessage());
			return "Page21.jsp";
		} catch (FormBeanException e) {
			errors.add(e.getMessage());
			return "Page21.jsp";
		}
		
	}
}