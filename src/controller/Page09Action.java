package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.genericdao.RollbackException;
import org.mybeans.form.FormBeanException;
import org.mybeans.form.FormBeanFactory;

import databeans.ResponseBean;
import formbean.Page09Form;
import model.Model;
import model.ResponseDAO;

public class Page09Action extends Action {
	private FormBeanFactory<Page09Form> formBeanFactory = FormBeanFactory.getInstance(Page09Form.class);
	private ResponseDAO responseDAO;
	
	public Page09Action (Model model) {
		responseDAO = model.getResponseDAO();
	}
	
	@Override
	public String getName() {
		return "page09.do";
	}

	@Override
	public String perform(HttpServletRequest request) {
		List<String> errors = new ArrayList<String>();
		HttpSession session = request.getSession();
		
		try {
			Page09Form form = formBeanFactory.create(request);
			
			if (!form.isPresent()) {
				return "Page09.jsp";
			}
			

			errors.addAll(form.getValidationErrors());
			System.out.println(errors);
			session.setAttribute("errors", errors);
			if (errors.size() > 0) {
				return "Page18.jsp";
			}
			
			ResponseBean r = new ResponseBean();
			r.setQuestion_id(9);
			r.setRespondent_id(1);
			r.setResponse( "{"
					+ form.getPage_09_1() + "'"
					+ form.getPage_09_2() + "'"
					+ form.getPage_09_3() + "'"
					+ form.getPage_09_4() + "'"
					+ form.getPage_09_5() + "'"
					+ form.getPage_09_6() + "'"
					+ form.getPage_09_7() + "'"
					+ form.getPage_09_8() + "'"
					+ form.getPage_09_9() + "'"
					+ form.getPage_09_10() + "'"
					+ form.getPage_09_11() + "'"
					+ "}");
			responseDAO.create(r);
			
			return "Page09.jsp";
		} catch (RollbackException e) {
			errors.add(e.getMessage());
			return "Page09jsp";
		} catch (FormBeanException e) {
			errors.add(e.getMessage());
			return "Page09.jsp";
		}
		
	}
}
