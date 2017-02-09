package controller;

import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.authenticator.SingleSignOnSessionKey;
import org.genericdao.RollbackException;
import org.mybeans.form.FormBeanException;
import org.mybeans.form.FormBeanFactory;

import com.mysql.fabric.Response;

import databeans.ResponseBean;
import formbean.Page18Form;
import model.Model;
import model.ResponseDAO;

public class Page18Action extends Action{
	private FormBeanFactory<Page18Form> formBeanFactory = FormBeanFactory.getInstance(Page18Form.class);
	private ResponseDAO responseDAO;
	
	public Page18Action(Model model) {
		responseDAO = model.getResponseDAO();
	}
	
	@Override
	public String getName() {
		return "Page18.do";
	}
	
	@Override
	public String perform(HttpServletRequest request) {
		List<String> errors = new ArrayList<String>();
		request.getSession(false).setAttribute("errors", errors);
		
		try {
			Page18Form form = formBeanFactory.create(request);
			
			if (!form.isPresent()) {
				return "Page18.jsp";
			}
			
			errors.addAll(form.getValidationErrors());
			if (errors.size() > 0) {
				return "Page18.jsp";
			}
			
			
			
			//if sum is present, invoke dao
			if (form.getPage_18_10_totalguessall() != null || form.getPage_18_10_totalguessbad() != null) {
			ResponseBean r= new ResponseBean();
			r.setQuestion_id(18);
			r.setRespondent_id();//get session id);
			r.setResponse("{" 
					+ form.getPage_18_10_totalguessall()
					+ ","
					+ form.getPage_18_10_totalguessbad()
					+ "}");
			responseDAO.create(r);
			} else {
				errors.add("Please input all fields and click calculate button to get results before move to next page.");
				return "Page18,jsp";
			}
			
			return "Page18.jsp";
		} catch (RollbackException e) {
			errors.add(e.getMessage());
			return "errors.jsp";
		} catch (FormBeanException e) {
			errors.add(e.getMessage());
			return "errors.jsp";
		}
	}
}
