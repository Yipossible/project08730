package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.mybeans.form.FormBeanException;
import org.mybeans.form.FormBeanFactory;

import formbean.Page18Form;
import model.Model;
import model.ResponseDAO;

public class Page18Action extends Action{

	private FormBeanFactory<Page18Form> formBeanFactory = FormBeanFactory.getInstance(Page18Form.class); 
	private ResponseDAO responseDAO;
	
	
	public Page18Action(Model model) {
		responseDAO = model.getResponseDAO();
	}
	@Override
	public String getName() {
			return "page18.do";
	}
		
	@Override
	public String perform(HttpServletRequest request) {
		List<String> errors = new ArrayList<String>();
		HttpSession session = request.getSession();
		
		try {
			Page18Form form = formBeanFactory.create(request);
			
			if (!form.isPresent()) {
				return "Page18.jsp";
			}
			
			errors.addAll(form.getValidationErrors());
			session.setAttribute("errors", errors);
			if (errors.size() > 0) {
				return "Page18.jsp";
			}
			
			return "Page18.jsp";
			
		} catch (FormBeanException e) {
			errors.add(e.getMessage());
			return "Page18.jsp";
		}
			
		}
}
