package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Model;

public class Controller extends HttpServlet {

    private static final long serialVersionUID = 1L;
    Model model;
    public void init() throws ServletException {
        model = new Model(getServletConfig());
        Action.add(new Page01Action(model));
        Action.add(new Page02Action(model));
        Action.add(new Page03Action(model));
        Action.add(new Page04Action(model));
        Action.add(new Page06Action(model));
        Action.add(new Page07Action(model));
        Action.add(new Page09Action(model));
        Action.add(new Page10Action(model));
        Action.add(new Page11Action(model));
        Action.add(new Page14Action(model));
        Action.add(new Page15Action(model));
        Action.add(new Page16Action(model));
        Action.add(new Page17Action(model));
        Action.add(new Page18Action(model));
        Action.add(new Page19Action(model));
        Action.add(new Page20Action(model));
        Action.add(new Page21Action(model));
        Action.add(new Page22Action(model));
        Action.add(new Page23Action(model));
        Action.add(new Page24Action(model));
        Action.add(new Page25Action(model));
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (model.getRequireSSL() && !request.isSecure()) {
			// If we're required to use SSL and we're not on a secure connection, redirect
        	String host = request.getServerName();
        	String port = (request.getServerPort()==80) ? "" : ":8443";
            response.sendRedirect("https://"+host+port+request.getRequestURI());
            return;
        }

        String nextPage = performTheAction(request);
	    sendToNextPage(nextPage,request,response);
    }

    /*
     * Extracts the requested action and (depending on whether the user is
     * logged in) perform it (or make the user login).
     * 
     * @param request
     * 
     * @return the next page (the view)
     */
    private String performTheAction(HttpServletRequest request) {
        String servletPath = request.getServletPath();
        String action = getActionName(servletPath);
        // Let the logged in user run his chosen action
        return Action.perform(action, request);
    }

    /*
     * If nextPage is null, send back 404 If nextPage ends with ".do", redirect
     * to this page. If nextPage ends with ".jsp", dispatch (forward) to the
     * page (the view) This is the common case
     */
    private void sendToNextPage(String nextPage, HttpServletRequest request,
            HttpServletResponse response) throws IOException, ServletException {

        if (nextPage == null) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND,
                    request.getServletPath());
            return;
        }

        if (nextPage.endsWith(".do")) {
            response.sendRedirect(nextPage);
            return;
        }

        if (nextPage.endsWith(".jsp")) {
            RequestDispatcher d = request.getRequestDispatcher("WEB-INF/"
                    + nextPage);            
            d.forward(request, response);
            return;
        } else {
            response.sendRedirect(nextPage);
        }
    }

    /*
     * Returns the path component after the last slash removing any "extension"
     * if present.
     */
    private String getActionName(String path) {
        // We're guaranteed that the path will start with a slash
        int slash = path.lastIndexOf('/');
        return path.substring(slash + 1);
    }
}
