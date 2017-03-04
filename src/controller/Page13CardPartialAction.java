package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.Model;
import model.RespondentDAO;
import model.ResponseDAO;

public class Page13CardPartialAction extends Action{

	private ResponseDAO responseDAO;
    private RespondentDAO respondentDAO;

    public Page13CardPartialAction(Model model) {
        responseDAO = model.getResponseDAO();
        respondentDAO = model.getRespondentDAO();
    }

    @Override
    public String getName() {
        return "CardDemoPartial.do";
    }

    @Override
    public String perform(HttpServletRequest request) {
        List<String> errors = new ArrayList<String>();
        List<String> successMessage = new ArrayList<String>();
        HttpSession session = request.getSession();
        session.setAttribute("successMessage", successMessage);
        session.setAttribute("errors", errors);
        session.setAttribute("nextPage", "page14.do");
        return "CardDemoPartial.jsp";
    }	
}

