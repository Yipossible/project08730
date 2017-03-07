package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.genericdao.RollbackException;
import org.mybeans.form.FormBeanException;
import org.mybeans.form.FormBeanFactory;

import databeans.RespondentBean;
import formbean.Page18Form;
import model.Model;
import model.RespondentDAO;
import model.ResponseDAO;

public class Page18Action extends Action{

	private FormBeanFactory<Page18Form> formBeanFactory = FormBeanFactory.getInstance(Page18Form.class); 
	private ResponseDAO responseDAO;
	private RespondentDAO respondentDAO;
	
	public Page18Action(Model model) {
		responseDAO = model.getResponseDAO();
		respondentDAO = model.getRespondentDAO();
	}
	@Override
	public String getName() {
			return "page18.do";
	}
		
	@Override
	public String perform(HttpServletRequest request) {
		List<String> errors = new ArrayList<String>();
		HttpSession session = request.getSession();
		try {
			Page18Form form = formBeanFactory.create(request);
			String unique_id = (String) session.getAttribute("unique_id"); // store in session
            
			RespondentBean respondentBean = respondentDAO.read(unique_id);
            if (!respondentBean.isFull_payment()) {
                return "NotEligible.jsp";
            }
			if (!form.isPresent()) {
				return "Page18.jsp";
			}
			
			errors.addAll(form.getValidationErrors());
			session.setAttribute("errors", errors);
			if (errors.size() > 0) {
				return "Page18.jsp";
			}
			if (respondentBean.getRespondent_id() % 2 == 0) {
                session.setAttribute("nextPage", "page19.do");
                return "page19.do";
            } else {
                session.setAttribute("nextPage", "page20.do");
                return "page20.do";
            }			
		} catch (RollbackException e) {
            errors.add(e.getMessage());
            return "error.jsp";
        } catch (FormBeanException e) {
			errors.add(e.getMessage());
			return "Page18.jsp";
		}
			
		}
}
