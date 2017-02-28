package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.Model;
import model.RespondentDAO;
import model.ResponseDAO;

public class Page08Action extends Action{
	private ResponseDAO responseDAO;
    private RespondentDAO respondentDAO;

    public Page08Action(Model model) {
        responseDAO = model.getResponseDAO();
        respondentDAO = model.getRespondentDAO();
    }

    @Override
    public String getName() {
        return "page08.do";
    }

    @Override
    public String perform(HttpServletRequest request) {
        List<String> errors = new ArrayList<String>();
        List<String> successMessage = new ArrayList<String>();
        HttpSession session = request.getSession();
        session.setAttribute("successMessage", successMessage);
        session.setAttribute("errors", errors);
        return "Page08.jsp";
    }
}
