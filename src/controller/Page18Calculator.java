package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.mybeans.form.FormBeanException;
import org.mybeans.form.FormBeanFactory;

import formbean.Page18Form;

public class Page18Calculator extends Action{
	private FormBeanFactory<Page18Form> formBeanFactory = FormBeanFactory.getInstance(Page18Form.class);

	@Override
	public String getName() {
		return "page18Caculator.do";
	}
	
	public String perform(HttpServletRequest request) {
		List<String> errors = new ArrayList<String>();
		request.getSession(false).setAttribute("errors", errors);
		
		try {
			Page18Form form = formBeanFactory.create(request);
			
			if (!form.isPresent()) {
				return "Page18.jsp";
			}
			
			errors.addAll(form.getValidationErrors());
			if (errors.size() > 0) {
				return "Page18.jsp";
			}
			
			double TotalGuess = form.getValueasDouble(form.getPage_18_1_guessall())
					+ form.getValueasDouble(form.getPage_18_2_guessall())
					+ form.getValueasDouble(form.getPage_18_3_guessall())
					+ form.getValueasDouble(form.getPage_18_4_guessall())
					+ form.getValueasDouble(form.getPage_18_5_guessall())
					+ form.getValueasDouble(form.getPage_18_6_guessall())
					+ form.getValueasDouble(form.getPage_18_7_guessall())
					+ form.getValueasDouble(form.getPage_18_8_guessall())
					+ form.getValueasDouble(form.getPage_18_9_guessall());
			
			double TotalGuessBad = form.getValueasDouble(form.getPage_18_1_guessbad())
					+ form.getValueasDouble(form.getPage_18_2_guessbad())
					+ form.getValueasDouble(form.getPage_18_3_guessbad())
					+ form.getValueasDouble(form.getPage_18_4_guessbad())
					+ form.getValueasDouble(form.getPage_18_5_guessbad())
					+ form.getValueasDouble(form.getPage_18_6_guessbad())
					+ form.getValueasDouble(form.getPage_18_7_guessbad())
					+ form.getValueasDouble(form.getPage_18_8_guessbad())
					+ form.getValueasDouble(form.getPage_18_9_guessbad());
			
			request.setAttribute("totalGuess", TotalGuess);
			request.setAttribute("totalGuessBad", TotalGuessBad);
			
			
			return "Page18.jsp";
		} catch (FormBeanException e) {
			errors.add(e.getMessage());
			return "errors.jsp";
		}
	}
}
