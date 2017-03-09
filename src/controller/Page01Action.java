package controller;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.genericdao.RollbackException;
import org.mybeans.form.FormBeanException;
import org.mybeans.form.FormBeanFactory;

import databeans.RespondentBean;
import databeans.ResponseBean;
import model.Model;
import model.RespondentDAO;
import model.ResponseDAO;

public class Page01Action extends Action {
    private SecureRandom random = new SecureRandom();
	private ResponseDAO responseDAO;
    private RespondentDAO respondentDAO;

    public Page01Action(Model model) {
        responseDAO = model.getResponseDAO();
        respondentDAO = model.getRespondentDAO();
    }

    @Override
    public String getName() {
        return "page01.do";
    }

    @Override
    public String perform(HttpServletRequest request) {
        List<String> errors = new ArrayList<String>();
        List<String> successMessage = new ArrayList<String>();
        HttpSession session = request.getSession();
        session.setAttribute("successMessage", successMessage);
        session.setAttribute("errors", errors);
        
        try {
            String unique_id = new BigInteger(130, random).toString(32);
            RespondentBean r = new RespondentBean();
            r.setUnique_id(unique_id);
            r.setFull_payment(true);
            System.out.println(unique_id);
            System.out.println(r.isFull_payment());
            respondentDAO.create(r);
            session.setAttribute("unique_id", unique_id);
            return "Page01.jsp";
        } catch (RollbackException e) {
//            errors.add(e.toString());
            return "error.jsp";
        }
    }

}
