package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.Model;
import model.RespondentDAO;
import model.ResponseDAO;

public class Page12CardAction extends Action{

	private ResponseDAO responseDAO;
    private RespondentDAO respondentDAO;

    public Page12CardAction(Model model) {
        responseDAO = model.getResponseDAO();
        respondentDAO = model.getRespondentDAO();
    }

    @Override
    public String getName() {
        return "CardDemo.do";
    }

    @Override
    public String perform(HttpServletRequest request) {
        List<String> errors = new ArrayList<String>();
        List<String> successMessage = new ArrayList<String>();
        HttpSession session = request.getSession();
        session.setAttribute("successMessage", successMessage);
        session.setAttribute("errors", errors);
        session.setAttribute("nextPage", "page14.do");
        return "CardDemo.jsp";
    }	
}
