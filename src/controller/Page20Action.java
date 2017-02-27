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
import formbean.Page20Form;
import model.Model;
import model.RespondentDAO;
import model.ResponseDAO;

public class Page20Action extends Action {
	private FormBeanFactory<Page20Form> formBeanFactory = FormBeanFactory.getInstance(Page20Form.class);
	private ResponseDAO responseDAO;
	private RespondentDAO respondentDAO;
	
	public Page20Action (Model model) {
		responseDAO = model.getResponseDAO();
		respondentDAO = model.getRespondentDAO();
	}
	
	@Override
	public String getName() {
		return "page20.do";
	}

	@Override
	public String perform(HttpServletRequest request) {
		List<String> errors = new ArrayList<String>();
		HttpSession session = request.getSession();
		
		try {
			Page20Form form = formBeanFactory.create(request);
			
			if (!form.isPresent()) {
				return "Page20.jsp";
			}
			

			errors.addAll(form.getValidationErrors());
			System.out.println(errors);
			session.setAttribute("errors", errors);
			if (errors.size() > 0) {
				return "Page20.jsp";
			}
			
			 String unique_id = (String) session.getAttribute("unique_id"); // store in session
	            RespondentBean respondentBean = respondentDAO.read(unique_id);
	            
	            if (respondentBean != null) {
			
			ResponseBean r = new ResponseBean();
			r.setQuestion_id(20);
			r.setRespondent_id(respondentBean.getRespondent_id());
			r.setResponse( "{"
					+ form.getPage_20_1() + "'"
					+ form.getPage_20_2() + "'"
					+ form.getPage_20_3() + "'"
					+ form.getPage_20_4() + "'"
					+ form.getPage_20_5() + "'"
					+ form.getPage_20_6() + "'"
					+ form.getPage_20_7() + "'"
					+ form.getPage_20_8() + "'"
					+ form.getPage_20_9() + "'"
					+ form.getPage_20_10() + "'"
					+ form.getPage_20_11() + "'"
					+ "}");
			responseDAO.create(r);
	            }
			else {
				return "Page20.jsp";
						}
			
			
			return "page21.do";
		} catch (RollbackException e) {
			errors.add(e.getMessage());
			return "Page20.jsp";
		} catch (FormBeanException e) {
			errors.add(e.getMessage());
			return "Page20.jsp";
		}
		
	}
}