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
import formbean.Page17Form;
import model.Model;
import model.RespondentDAO;
import model.ResponseDAO;

public class Page17Action extends Action {
	private FormBeanFactory<Page17Form> formBeanFactory = FormBeanFactory.getInstance(Page17Form.class);
	private ResponseDAO responseDAO;
	private RespondentDAO respondentDAO;
	
	public Page17Action (Model model) {
		responseDAO = model.getResponseDAO();
		respondentDAO = model.getRespondentDAO();
	}
	
	@Override
	public String getName() {
		return "page17.do";
	}

	@Override
	public String perform(HttpServletRequest request) {
		List<String> errors = new ArrayList<String>();
		HttpSession session = request.getSession();
		session.setAttribute("nextPage", "page18.do");
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
			
			String unique_id = (String) session.getAttribute("unique_id"); // store in session
            RespondentBean respondentBean = respondentDAO.read(unique_id);
            
            System.out.println(respondentBean == null);
            
            if (respondentBean != null) {
			
			ResponseBean r = new ResponseBean();
			r.setQuestion_id(17);
			r.setRespondent_id(respondentBean.getRespondent_id());
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
			System.out.println("answer saved");
            } else {
            	return "Page17.jsp";
            }
			
			return "page18.do";
		} catch (RollbackException e) {
			errors.add(e.getMessage());
			return "Page17.jsp";
		} catch (FormBeanException e) {
			errors.add(e.getMessage());
			return "Page17.jsp";
		}
		
	}
}