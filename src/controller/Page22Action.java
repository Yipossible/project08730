package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.genericdao.RollbackException;
import org.mybeans.form.FormBeanException;
import org.mybeans.form.FormBeanFactory;

import databeans.RespondentBean;
import databeans.ResponseBean;
import formbean.Page22Form;
import model.Model;
import model.RespondentDAO;
import model.ResponseDAO;

public class Page22Action extends Action {
	private FormBeanFactory<Page22Form> formBeanFactory = FormBeanFactory.getInstance(Page22Form.class);
	private ResponseDAO responseDAO;
	private RespondentDAO respondentDAO;
	
	public Page22Action (Model model) {
		responseDAO = model.getResponseDAO();
		respondentDAO = model.getRespondentDAO();
	}
	
	@Override
	public String getName() {
		return "page22.do";
	}

	@Override
	public String perform(HttpServletRequest request) {
		List<String> errors = new ArrayList<String>();
		HttpSession session = request.getSession();
		session.setAttribute("nextPage", "page23.do");
		try {
			Page22Form form = formBeanFactory.create(request);
			
			if (!form.isPresent()) {
				return "Page22.jsp";
			}
			

			errors.addAll(form.getValidationErrors());
			System.out.println(errors);
			session.setAttribute("errors", errors);
			if (errors.size() > 0) {
				return "Page22.jsp";
			}
			String unique_id = (String) session.getAttribute("unique_id"); // store in session
            RespondentBean p = respondentDAO.read(unique_id);
            System.out.println(p);
            
			ResponseBean r = new ResponseBean();
			r.setQuestion_id(22);
			r.setRespondent_id(p.getRespondent_id());
			r.setResponse( "{"
					+ form.getPage_22_1() + ","
					+ form.getPage_22_2() + ","
					+ form.getPage_22_3() + ","
					+ form.getPage_22_4() + ","
					+ form.getPage_22_5() + ","
					+ "}");
			responseDAO.create(r);
			
			return "page23.do";
		} catch (RollbackException e) {
			errors.add(e.getMessage());
			System.out.println(errors);
			return "Page22.jsp";
		} catch (FormBeanException e) {
			errors.add(e.getMessage());
			return "Page22.jsp";
		}
		
	}
}