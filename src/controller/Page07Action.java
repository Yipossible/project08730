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
import formbean.Page07Form;
import model.Model;
import model.RespondentDAO;
import model.ResponseDAO;

public class Page07Action extends Action {
	private FormBeanFactory<Page07Form> formBeanFactory = FormBeanFactory.getInstance(Page07Form.class);
	private ResponseDAO responseDAO;
	private RespondentDAO respondentDAO;
	
	public Page07Action (Model model) {
		responseDAO = model.getResponseDAO();
		respondentDAO = model.getRespondentDAO();
	}
	
	@Override
	public String getName() {
		return "page07.do";
	}

	@Override
	public String perform(HttpServletRequest request) {
		List<String> errors = new ArrayList<String>();
		HttpSession session = request.getSession();
		
		try {
		    String unique_id = (String) session.getAttribute("unique_id"); // store in session
            RespondentBean p = respondentDAO.read(unique_id);
            if (!p.isFull_payment()) {
                return "NotEligible.jsp";
            }
		    Page07Form form = formBeanFactory.create(request);
			
			if (!form.isPresent()) {
				return "Page07.jsp";
			}
			

			errors.addAll(form.getValidationErrors());
			System.out.println(errors);
			session.setAttribute("errors", errors);
			if (errors.size() > 0) {
				return "Page07.jsp";
			}
			
            if (!p.isFull_payment()) {
                return "NotEligible.jsp";
            }
            System.out.println(p);
            
			ResponseBean r = new ResponseBean();
			r.setQuestion_id(7);
			r.setRespondent_id(p.getRespondent_id());
			String[] range = form.getPrice().split(",");
			double r1 = Integer.parseInt(range[0]) * 10;
			double r2 = Integer.parseInt(range[1]) * 10;
			r.setResponse("yes: $0 to $" + (r1 - 0.01) + "; maybe: from $" + r1 + " to $" + (r2 - 0.01) + "; no: from $" + r2 + " to $100");
			responseDAO.create(r);
			
			if (p.getRespondent_id() % 2 == 0) {
                session.setAttribute("nextPage", "page08.do");
                return "page08.do";
            } else {
                session.setAttribute("nextPage", "page10.do");
                return "page10.do";
            }
		} catch (RollbackException e) {
//			errors.add(e.getMessage());
			System.out.println(errors);
			return "error.jsp";
		} catch (FormBeanException e) {
			errors.add(e.getMessage());
			System.out.println(errors);
			return "Page07.jsp";
		}
		
	}
}
