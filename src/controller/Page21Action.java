package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.genericdao.RollbackException;
import org.mybeans.form.FormBeanException;
import org.mybeans.form.FormBeanFactory;

import databeans.ResponseBean;
import formbean.Page21Form;
import model.Model;
import model.ResponseDAO;

public class Page21Action extends Action {
	private FormBeanFactory<Page21Form> formBeanFactory = FormBeanFactory.getInstance(Page21Form.class);
	private ResponseDAO responseDAO;
	
	public Page21Action (Model model) {
		responseDAO = model.getResponseDAO();
	}
	
	@Override
	public String getName() {
		return "page21.do";
	}

	@Override
	public String perform(HttpServletRequest request) {
		List<String> errors = new ArrayList<String>();
		HttpSession session = request.getSession();
		
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
			
			ResponseBean r = new ResponseBean();
			r.setQuestion_id(21);
			r.setRespondent_id(1);
			r.setResponse( "{"
					+ form.getPage_21_1() + "'"
					+ form.getPage_21_2() + "'"
					+ form.getPage_21_3() + "'"
					+ form.getPage_21_4() + "'"
					+ form.getPage_21_5() + "'"
					+ form.getPage_21_6() + "'"
					+ form.getPage_21_7() + "'"
					+ form.getPage_21_8() + "'"
					+ form.getPage_21_9() + "'"
					+ form.getPage_21_10() + "'"
					+ form.getPage_21_11() + "'"
					+ "}");
			responseDAO.create(r);
			
			return "Page22.jsp";
		} catch (RollbackException e) {
			errors.add(e.getMessage());
			return "Page21jsp";
		} catch (FormBeanException e) {
			errors.add(e.getMessage());
			return "Page21.jsp";
		}
		
	}
}