package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.genericdao.RollbackException;
import org.mybeans.form.FormBeanException;
import org.mybeans.form.FormBeanFactory;

import databeans.ResponseBean;
import formbean.Page19Form;
import model.Model;
import model.ResponseDAO;

public class Page19Action extends Action {
	private FormBeanFactory<Page19Form> formBeanFactory = FormBeanFactory.getInstance(Page19Form.class);
	private ResponseDAO responseDAO;
	
	public Page19Action (Model model) {
		responseDAO = model.getResponseDAO();
	}
	
	@Override
	public String getName() {
		return "page19.do";
	}

	@Override
	public String perform(HttpServletRequest request) {
		List<String> errors = new ArrayList<String>();
		HttpSession session = request.getSession();
		
		try {
			Page19Form form = formBeanFactory.create(request);
			
			if (!form.isPresent()) {
				return "Page19.jsp";
			}
			

			errors.addAll(form.getValidationErrors());
			System.out.println(errors);
			session.setAttribute("errors", errors);
			if (errors.size() > 0) {
				return "Page19.jsp";
			}
			
			ResponseBean r = new ResponseBean();
			r.setQuestion_id(19);
			r.setRespondent_id(1);
			r.setResponse( "{"
					+ form.getPage_19_1() + "'"
					+ form.getPage_19_2() + "'"
					+ form.getPage_19_3() + "'"
					+ form.getPage_19_4() + "'"
					+ form.getPage_19_5() + "'"
					+ form.getPage_19_6() + "'"
					+ form.getPage_19_7() + "'"
					+ form.getPage_19_8() + "'"
					+ form.getPage_19_9() + "'"
					+ form.getPage_19_10() + "'"
					+ form.getPage_19_11() + "'"
					+ "}");
			responseDAO.create(r);
			
			return "Page20.jsp";
		} catch (RollbackException e) {
			errors.add(e.getMessage());
			return "Page19jsp";
		} catch (FormBeanException e) {
			errors.add(e.getMessage());
			return "Page19.jsp";
		}
		
	}
}