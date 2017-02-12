package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.genericdao.RollbackException;
import org.mybeans.form.FormBeanException;
import org.mybeans.form.FormBeanFactory;

import databeans.ResponseBean;
import formbean.Page25Form;
import model.Model;
import model.ResponseDAO;

public class Page25Action extends Action {
	private FormBeanFactory<Page25Form> formBeanFactory = FormBeanFactory.getInstance(Page25Form.class);
	private ResponseDAO responseDAO;
	
	public Page25Action (Model model) {
		responseDAO = model.getResponseDAO();
	}
	
	@Override
	public String getName() {
		return "page25.do";
	}

	@Override
	public String perform(HttpServletRequest request) {
		List<String> errors = new ArrayList<String>();
		HttpSession session = request.getSession();
		
		try {
			Page25Form form = formBeanFactory.create(request);
			
			if (!form.isPresent()) {
				return "Page25.jsp";
			}
			

			errors.addAll(form.getValidationErrors());
			System.out.println(errors);
			session.setAttribute("errors", errors);
			if (errors.size() > 0) {
				return "Page25.jsp";
			}
			
			ResponseBean r = new ResponseBean();
			r.setQuestion_id(29);
			r.setRespondent_id(1);
			r.setResponse( "{"
					+ form.getPage_25_1() + ","
					+ form.getPage_25_2() + ","
					+ form.getPage_25_3() + ","
					+ form.getPage_25_4() + ","
					+ form.getPage_25_5() + ","
					+ form.getPage_25_6() + ","
					+ form.getPage_25_7() + ","
					+ form.getPage_25_8() + ","
					+ "}");
			responseDAO.create(r);
			
			return "page03.do";
		} catch (RollbackException e) {
			errors.add(e.getMessage());
			return "Page25jsp";
		} catch (FormBeanException e) {
			errors.add(e.getMessage());
			return "Page25.jsp";
		}
		
	}
}