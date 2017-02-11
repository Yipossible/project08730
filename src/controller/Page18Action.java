package controller;

import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.genericdao.RollbackException;
import org.mybeans.form.FormBeanException;
import org.mybeans.form.FormBeanFactory;


import databeans.ResponseBean;
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
			
			
		
			double sumTotal = 
					form.getValueasDouble(form.getPage_18_1_guessall())
				+ form.getValueasDouble(form.getPage_18_2_guessall())
				+ form.getValueasDouble(form.getPage_18_3_guessall())
				+ form.getValueasDouble(form.getPage_18_4_guessall())
				+ form.getValueasDouble(form.getPage_18_5_guessall())
				+ form.getValueasDouble(form.getPage_18_6_guessall())
				+ form.getValueasDouble(form.getPage_18_7_guessall())
				+ form.getValueasDouble(form.getPage_18_8_guessall())
				+ form.getValueasDouble(form.getPage_18_9_guessall());
				
				
			double sumBad = 
					form.getValueasDouble(form.getPage_18_1_guessbad())
				+ form.getValueasDouble(form.getPage_18_2_guessbad())
				+ form.getValueasDouble(form.getPage_18_3_guessbad())
				+ form.getValueasDouble(form.getPage_18_4_guessbad())
				+ form.getValueasDouble(form.getPage_18_5_guessbad())
				+ form.getValueasDouble(form.getPage_18_6_guessbad())
				+ form.getValueasDouble(form.getPage_18_7_guessbad())
				+ form.getValueasDouble(form.getPage_18_8_guessbad())
				+ form.getValueasDouble(form.getPage_18_9_guessbad());
			
			
			ResponseBean r= new ResponseBean();
			r.setQuestion_id(18);
			r.setRespondent_id(1);//get session id);
			r.setResponse("{" 
					+ sumTotal
					+ ","
					+ sumBad
					+ "}");
			responseDAO.create(r);
			
			
			return "Page18.jsp";
		} catch (RollbackException e) {
			errors.add(e.getMessage());
			return "Page18.jsp";
		} catch (FormBeanException e) {
			errors.add(e.getMessage());
			return "Page18.jsp";
		}
	}
}
