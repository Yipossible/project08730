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
			ResponseBean r= new ResponseBean();
			r.setQuestion_id(18);
			r.setRespondent_id(//get session id);
			r.setResponse("{" 
					+ //get value from column 1
					+ ","
					+ //get value from column 2
					+ "}");
			
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
