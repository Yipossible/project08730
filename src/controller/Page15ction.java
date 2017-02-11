package controller;

import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.genericdao.RollbackException;
import org.mybeans.form.FormBeanException;
import org.mybeans.form.FormBeanFactory;


import databeans.ResponseBean;
import formbean.Page15Form;

import model.Model;
import model.ResponseDAO;

public class Page15ction extends Action{
	private FormBeanFactory<Page15Form> formBeanFactory = FormBeanFactory.getInstance(Page15Form.class);
	private ResponseDAO responseDAO;
	
	public Page15ction(Model model) {
		responseDAO = model.getResponseDAO();
	}
	
	@Override
	public String getName() {
		return "page15.do";
	}
	
	@Override
	public String perform(HttpServletRequest request) {
		List<String> errors = new ArrayList<String>();
		HttpSession session = request.getSession();
		
		
		try {
			
			
			Page15Form form = formBeanFactory.create(request);
			
			if (!form.isPresent()) {
				return "Page15.jsp";
			}
			
		
			errors.addAll(form.getValidationErrors());
			session.setAttribute("errors", errors);
			if (errors.size() > 0) {
				return "Page15.jsp";
			}
			
			
		
			double sumTotal = 
					form.getValueasDouble(form.getPage_15_1_guessall())
				+ form.getValueasDouble(form.getPage_15_2_guessall())
				+ form.getValueasDouble(form.getPage_15_3_guessall())
				+ form.getValueasDouble(form.getPage_15_4_guessall())
				+ form.getValueasDouble(form.getPage_15_5_guessall())
				+ form.getValueasDouble(form.getPage_15_6_guessall())
				+ form.getValueasDouble(form.getPage_15_7_guessall())
				+ form.getValueasDouble(form.getPage_15_8_guessall())
				+ form.getValueasDouble(form.getPage_15_9_guessall());
				
				
			double sumBad = 
					form.getValueasDouble(form.getPage_15_1_guessbad())
				+ form.getValueasDouble(form.getPage_15_2_guessbad())
				+ form.getValueasDouble(form.getPage_15_3_guessbad())
				+ form.getValueasDouble(form.getPage_15_4_guessbad())
				+ form.getValueasDouble(form.getPage_15_5_guessbad())
				+ form.getValueasDouble(form.getPage_15_6_guessbad())
				+ form.getValueasDouble(form.getPage_15_7_guessbad())
				+ form.getValueasDouble(form.getPage_15_8_guessbad())
				+ form.getValueasDouble(form.getPage_15_9_guessbad());
			
			
			ResponseBean r= new ResponseBean();
			r.setQuestion_id(15);
			r.setRespondent_id(1);//get session id);
			r.setResponse("{" 
					+ sumTotal
					+ ","
					+ sumBad
					+ "}");
			responseDAO.create(r);
			
			
			return "Page15.jsp";
		} catch (RollbackException e) {
			errors.add(e.getMessage());
			return "Page15.jsp";
		} catch (FormBeanException e) {
			errors.add(e.getMessage());
			return "Page15.jsp";
		}
	}
}
