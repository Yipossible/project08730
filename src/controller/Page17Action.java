package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.genericdao.RollbackException;
import org.mybeans.form.FormBeanException;
import org.mybeans.form.FormBeanFactory;

import databeans.ResponseBean;
import formbean.Page17Form;
import model.Model;
import model.ResponseDAO;

public class Page17Action extends Action {
	private FormBeanFactory<Page17Form> formBeanFactory = FormBeanFactory.getInstance(Page17Form.class);
	private ResponseDAO responseDAO;
	
	public Page17Action (Model model) {
		responseDAO = model.getResponseDAO();
	}
	
	@Override
	public String getName() {
		return "page17.do";
	}

	@Override
	public String perform(HttpServletRequest request) {
		List<String> errors = new ArrayList<String>();
		HttpSession session = request.getSession();
		
		try {
			Page17Form form = formBeanFactory.create(request);
			
			if (!form.isPresent()) {
				return "Page17.jsp";
			}
			

			errors.addAll(form.getValidationErrors());
			System.out.println(errors);
			session.setAttribute("errors", errors);
			if (errors.size() > 0) {
				return "Page17.jsp";
			}
			
			ResponseBean r = new ResponseBean();
			r.setQuestion_id(17);
			r.setRespondent_id(1);
			r.setResponse( "{"
					+ form.getPage_17_1() + "'"
					+ form.getPage_17_2() + "'"
					+ form.getPage_17_3() + "'"
					+ form.getPage_17_4() + "'"
					+ form.getPage_17_5() + "'"
					+ form.getPage_17_6() + "'"
					+ form.getPage_17_7() + "'"
					+ form.getPage_17_8() + "'"
					+ form.getPage_17_9() + "'"
					+ form.getPage_17_10() + "'"
					+ form.getPage_17_11() + "'"
					+ "}");
			responseDAO.create(r);
			
			return "Page18.jsp";
		} catch (RollbackException e) {
			errors.add(e.getMessage());
			return "Page17jsp";
		} catch (FormBeanException e) {
			errors.add(e.getMessage());
			return "Page17.jsp";
		}
		
	}
}