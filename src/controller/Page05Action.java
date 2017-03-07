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

public class Page05Action extends Action {	
	private ResponseDAO responseDAO;
    private RespondentDAO respondentDAO;

    public Page05Action(Model model) {
        responseDAO = model.getResponseDAO();
        respondentDAO = model.getRespondentDAO();
    }

    @Override
    public String getName() {
        return "page05.do";
    }

    @Override
    public String perform(HttpServletRequest request) {
        List<String> errors = new ArrayList<String>();
        List<String> successMessage = new ArrayList<String>();
        HttpSession session = request.getSession();
        session.setAttribute("successMessage", successMessage);
        session.setAttribute("errors", errors);
        try {
            String unique_id = (String) session.getAttribute("unique_id"); // store in session
            RespondentBean p = respondentDAO.read(unique_id);
            System.out.println(p.getRespondent_id() % 2);
            if (p.getRespondent_id() % 2 == 0) {
                session.setAttribute("nextPage", "page06.do");
            } else {
                session.setAttribute("nextPage", "page08.do");
            }
        } catch (RollbackException e) {
            errors.add(e.getMessage());
            System.out.println(errors);
            return "error.jsp";
        } 
        return "Page05.jsp";
    }
}
