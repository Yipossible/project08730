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
import formbean.Page04Form;
import model.Model;
import model.RespondentDAO;
import model.ResponseDAO;

public class Page06Action extends Action {	
	private ResponseDAO responseDAO;
    private RespondentDAO respondentDAO;

    public Page06Action(Model model) {
        responseDAO = model.getResponseDAO();
        respondentDAO = model.getRespondentDAO();
    }

    @Override
    public String getName() {
        return "page06.do";
    }

    @Override
    public String perform(HttpServletRequest request) {
        List<String> errors = new ArrayList<String>();
        List<String> successMessage = new ArrayList<String>();
        HttpSession session = request.getSession();
        session.setAttribute("successMessage", successMessage);
        session.setAttribute("errors", errors);
        session.setAttribute("nextPage", "page07.do");
        String unique_id = (String) session.getAttribute("unique_id"); // store in session
        RespondentBean p;
        try {
            p = respondentDAO.read(unique_id);
            if (!p.isFull_payment()) {
                return "NotEligible.jsp";
            }
        } catch (RollbackException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "error.jsp";
        }
       
        return "Page06.jsp";
    }
}
