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
import formbean.Page14Form;
import model.Model;
import model.RespondentDAO;
import model.ResponseDAO;


public class Page14Action extends Action{
	private FormBeanFactory<Page14Form> formBeanFactory = FormBeanFactory.getInstance(Page14Form.class);
	private ResponseDAO responseDAO;
	private RespondentDAO respondentDAO;
	
	public Page14Action(Model model) {
		responseDAO = model.getResponseDAO();
		respondentDAO = model.getRespondentDAO();
	}
	
	@Override
	public String getName() {
		return "page14.do";
	}
	
	@Override
	 public String perform(HttpServletRequest request) {
		List<String> errors = new ArrayList<String>();
		HttpSession session = request.getSession();
		session.setAttribute("nextPage", "page15.do");
		
		try {
			
			
			Page14Form form = formBeanFactory.create(request);
			
			if (!form.isPresent()) {
				return "Page14.jsp";
			}
			
		
			errors.addAll(form.getValidationErrors());
			session.setAttribute("errors", errors);
			if (errors.size() > 0) {
				return "Page14.jsp";
			}
			
			String unique_id = (String) session.getAttribute("unique_id"); // store in session
            RespondentBean respondentBean = respondentDAO.read(unique_id);
            if (!respondentBean.isFull_payment()) {
                return "NotEligible.jsp";
            }
            System.out.println(respondentBean);
            if (respondentBean != null) {
			
			ResponseBean r = new ResponseBean();
			r.setQuestion_id(14);
			r.setRespondent_id(respondentBean.getRespondent_id());
			r.setResponse("{"
					+ form.getText()
					+ "}");
			responseDAO.create(r);
            } else {
            	return "Page14.jsp";
            }
			return "page15.do";
			
		} catch (RollbackException e) {
//				errors.add(e.getMessage());
				return "Page14.jsp";
			} catch (FormBeanException e) {
				errors.add(e.getMessage());
				return "Page14.jsp";
			}
}
}
