package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.genericdao.RollbackException;
import org.mybeans.form.FormBeanException;
import org.mybeans.form.FormBeanFactory;

import databeans.ResponseBean;
import formbean.Page16Form;
import model.Model;
import model.ResponseDAO;

public class Page16Action extends Action {
	private FormBeanFactory<Page16Form> formBeanFactory = FormBeanFactory.getInstance(Page16Form.class);
	private ResponseDAO responseDAO;
	
	public Page16Action (Model model) {
		responseDAO = model.getResponseDAO();
	}
	
	@Override
	public String getName() {
		return "page16.do";
	}

	@Override
	public String perform(HttpServletRequest request) {
		List<String> errors = new ArrayList<String>();
		HttpSession session = request.getSession();
		
		try {
			Page16Form form = formBeanFactory.create(request);
			
			if (!form.isPresent()) {
				return "Page16.jsp";
			}
			

			errors.addAll(form.getValidationErrors());
			System.out.println(errors);
			session.setAttribute("errors", errors);
			if (errors.size() > 0) {
				return "Page16.jsp";
			}
			
			ResponseBean r = new ResponseBean();
			r.setQuestion_id(16);
			r.setRespondent_id(1);
			r.setResponse( "{"
					+ form.getPage_16_1() + "'"
					+ form.getPage_16_2() + "'"
					+ form.getPage_16_3() + "'"
					+ form.getPage_16_4() + "'"
					+ form.getPage_16_5() + "'"
					+ form.getPage_16_6() + "'"
					+ form.getPage_16_7() + "'"
					+ form.getPage_16_8() + "'"
					+ form.getPage_16_9() + "'"
					+ form.getPage_16_10() + "'"
					+ form.getPage_16_11() + "'"
					+ "}");
			responseDAO.create(r);
			
			return "Page16.jsp";
		} catch (RollbackException e) {
			errors.add(e.getMessage());
			return "Page16jsp";
		} catch (FormBeanException e) {
			errors.add(e.getMessage());
			return "Page16.jsp";
		}
		
	}
}