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
import formbean.Page19Form;
import model.Model;
import model.RespondentDAO;
import model.ResponseDAO;

public class Page19Action extends Action {
	private FormBeanFactory<Page19Form> formBeanFactory = FormBeanFactory.getInstance(Page19Form.class);
	private ResponseDAO responseDAO;
	private RespondentDAO respondentDAO;
	
	public Page19Action (Model model) {
		responseDAO = model.getResponseDAO();
		respondentDAO = model.getRespondentDAO();
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
			
			 String unique_id = (String) session.getAttribute("unique_id"); // store in session
	         RespondentBean respondentBean = respondentDAO.read(unique_id);
	         if (!respondentBean.isFull_payment()) {
	                return "NotEligible.jsp";
	            }   
	            if (respondentBean != null) {
			
			ResponseBean r = new ResponseBean();
			r.setQuestion_id(19);
			r.setRespondent_id(respondentBean.getRespondent_id());
			String[] range = form.getPrice().split(",");
            double r1 = Integer.parseInt(range[0]) * 10;
            double r2 = Integer.parseInt(range[1]) * 10;
            r.setResponse("yes: $0 to $" + (r1 - 0.01) + "; maybe: from $" + r1 + " to $" + (r2 - 0.01) + "; no: from $" + r2 + " to $100");
			responseDAO.create(r);
	            } else {
	            	return "Page19.jsp";
	            }
			
	            if (respondentBean.getRespondent_id() % 2 == 0) {
	                session.setAttribute("nextPage", "page20.do");
	                return "page20.do";
	            } else {
	                session.setAttribute("nextPage", "page21.do");
	                return "page21.do";
	            }
		} catch (RollbackException e) {
//			errors.add(e.getMessage());
			return "error.jsp";
		} catch (FormBeanException e) {
			errors.add(e.getMessage());
			return "Page19.jsp";
		}
		
	}
}