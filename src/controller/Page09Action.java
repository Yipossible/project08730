package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.el.lang.ELSupport;
import org.genericdao.RollbackException;
import org.mybeans.form.FormBeanException;
import org.mybeans.form.FormBeanFactory;

import databeans.RespondentBean;
import databeans.ResponseBean;
import formbean.Page09Form;
import model.Model;
import model.RespondentDAO;
import model.ResponseDAO;

public class Page09Action extends Action {
	private FormBeanFactory<Page09Form> formBeanFactory = FormBeanFactory.getInstance(Page09Form.class);
	private ResponseDAO responseDAO;
	private RespondentDAO respondentDAO;
	
	public Page09Action (Model model) {
		responseDAO = model.getResponseDAO();
		respondentDAO = model.getRespondentDAO();
	}
	
	@Override
	public String getName() {
		return "page09.do";
	}

	@Override
	public String perform(HttpServletRequest request) {
		List<String> errors = new ArrayList<String>();
		HttpSession session = request.getSession();
		session.setAttribute("nextPage", "page10.do");
		try {
			Page09Form form = formBeanFactory.create(request);
			
			if (!form.isPresent()) {
				return "Page09.jsp";
			}
			
			errors.addAll(form.getValidationErrors());
            System.out.println(errors);
            session.setAttribute("errors", errors);
            if (errors.size() > 0) {
                return "Page09.jsp";
            }
            
            String unique_id = (String) session.getAttribute("unique_id"); // store in session
            RespondentBean p = respondentDAO.read(unique_id);
            System.out.println(p);
            
            ResponseBean r = new ResponseBean();
            r.setQuestion_id(9);
            r.setRespondent_id(p.getRespondent_id());
            r.setResponse(form.getPrice());
            responseDAO.create(r);

			return "page10.do";
		} catch (RollbackException e) {
		    System.out.println("in transaction");
			errors.add(e.getMessage());
			return "Page09.jsp";
		} catch (FormBeanException e) {
		    System.out.println("in form bean");
		    errors.add(e.getMessage());
			return "Page09.jsp";
		}
		
	}
}
