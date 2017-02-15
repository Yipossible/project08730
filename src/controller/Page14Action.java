package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.genericdao.RollbackException;
import org.mybeans.form.FormBeanException;
import org.mybeans.form.FormBeanFactory;

import databeans.ResponseBean;
import formbean.Page14Form;
import model.Model;
import model.ResponseDAO;


public class Page14Action extends Action{
	private FormBeanFactory<Page14Form> formBeanFactory = FormBeanFactory.getInstance(Page14Form.class);
	private ResponseDAO responseDAO;
	
	public Page14Action(Model model) {
		responseDAO = model.getResponseDAO();
	}
	
	@Override
	public String getName() {
		return "page14.do";
	}
	
	@Override
	 public String perform(HttpServletRequest request) {
		List<String> errors = new ArrayList<String>();
		HttpSession session = request.getSession();
		
		
		try {
			
			
			Page14Form form = formBeanFactory.create(request);
			
			if (!form.isPresent()) {
				return "Page14.jsp";
			}
			
		
			errors.addAll(form.getValidationErrors());
			session.setAttribute("errors", errors);
			if (errors.size() > 0) {
				return "Page14.jsp";
			}
			
			ResponseBean r = new ResponseBean();
			r.setQuestion_id(14);
			r.setRespondent_id(1);
			r.setResponse("{"
					+ form.getText()
					+ "}");
			responseDAO.create(null);
			
			return "Page15.jsp";
			
		} catch (RollbackException e) {
				errors.add(e.getMessage());
				return "Page14.jsp";
			} catch (FormBeanException e) {
				errors.add(e.getMessage());
				return "Page14.jsp";
			}
}
}
