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
import formbean.Page11Form;
import model.Model;
import model.RespondentDAO;
import model.ResponseDAO;

public class Page11Action extends Action{
	private FormBeanFactory<Page11Form> formBeanFactory = FormBeanFactory.getInstance(Page11Form.class);
	private ResponseDAO responseDAO;
	private RespondentDAO respondentDAO;
	
	public Page11Action(Model model) {
		responseDAO = model.getResponseDAO();
		respondentDAO = model.getRespondentDAO();
	}
	
	@Override
	public String getName() {
		return "page11.do";
	}
	
	@Override
	public String perform(HttpServletRequest request){
		List<String> errors = new ArrayList<String>();
		HttpSession session = request.getSession();
		
		
		try {
			Page11Form form = formBeanFactory.create(request);
			if (!form.isPresent()) {
				return "Page11.jsp";
			}
			
			errors.addAll(form.getValidationErrors());
			session.setAttribute("errors", errors);
			
			if (errors.size() > 0) {
				return "Page11.jsp";
			}
			String unique_id = (String) session.getAttribute("unique_id"); // store in session
            RespondentBean respondentBean = respondentDAO.read(unique_id);
            
            if (respondentBean != null) {
			
			ResponseBean r = new ResponseBean();
			r.setQuestion_id(11);
			r.setRespondent_id(respondentBean.getRespondent_id());
			r.setResponse("{"
					+ form.getPage_11_1() + ","
					+ form.getPage_11_2() + ","
					+ form.getPage_11_3() + ","
					+ form.getPage_11_4() + ","
					+ form.getPage_11_5() + ","
					+"}"
					);
			responseDAO.create(r);
            } else {
            	return "Page11.jsp";
            }
					
			return "page14.do";
		} catch (RollbackException e) {
			errors.add(e.getMessage());
			return "Page11.jsp";
		} catch (FormBeanException e) {
			errors.add(e.getMessage());
			return "Page11.jsp";
		}
	}
	
}
