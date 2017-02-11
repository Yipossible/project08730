package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.genericdao.RollbackException;
import org.mybeans.form.FormBeanException;
import org.mybeans.form.FormBeanFactory;

import databeans.ResponseBean;
import formbean.Page07Form;
import model.Model;
import model.ResponseDAO;

public class Page07Action extends Action {
	private FormBeanFactory<Page07Form> formBeanFactory = FormBeanFactory.getInstance(Page07Form.class);
	private ResponseDAO responseDAO;
	
	public Page07Action (Model model) {
		responseDAO = model.getResponseDAO();
	}
	
	@Override
	public String getName() {
		return "page07.do";
	}

	@Override
	public String perform(HttpServletRequest request) {
		List<String> errors = new ArrayList<String>();
		HttpSession session = request.getSession();
		
		try {
		    Page07Form form = formBeanFactory.create(request);
			
			if (!form.isPresent()) {
				return "Page07.jsp";
			}
			

			errors.addAll(form.getValidationErrors());
			System.out.println(errors);
			session.setAttribute("errors", errors);
			if (errors.size() > 0) {
				return "Page07.jsp";
			}
			
			ResponseBean r = new ResponseBean();
			r.setQuestion_id(7);
			r.setRespondent_id(2);
			r.setResponse( "{"
			        + form.getPage_07_1() + ","
                    + form.getPage_07_2() + ","
                    + form.getPage_07_3() + ","
                    + form.getPage_07_4() + ","
                    + form.getPage_07_5() + ","
                    + form.getPage_07_6() + ","
                    + form.getPage_07_7() + ","
                    + form.getPage_07_8() + ","
                    + form.getPage_07_9() + ","
                    + form.getPage_07_10() + ","
                    + form.getPage_07_11() + ","
					+ "}");
			responseDAO.create(r);
			
			return "Page08.jsp";
		} catch (RollbackException e) {
			errors.add(e.getMessage());
			return "Page07.jsp";
		} catch (FormBeanException e) {
			errors.add(e.getMessage());
			return "Page07.jsp";
		}
		
	}
}
