package model;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import org.genericdao.ConnectionPool;
import org.genericdao.DAOException;
import org.genericdao.RollbackException;


public class Model {
    private RespondentDAO respondentDAO;
    private ResponseDAO responseDAO;
    
	private boolean requireSSL;
    
    public Model(ServletConfig config) throws ServletException {
        try {
        	requireSSL = new Boolean(config.getInitParameter("requireSSL"));

            String jdbcDriver = config.getInitParameter("jdbcDriverName");
            String jdbcURL = config.getInitParameter("jdbcURL");

            ConnectionPool pool = new ConnectionPool(jdbcDriver, jdbcURL);
            respondentDAO = new RespondentDAO(pool, "respondent");
            responseDAO = new ResponseDAO(pool, "response");
        } catch (DAOException e) {
            throw new ServletException(e);
        }
    }

    public RespondentDAO getRespondentDAO() {
        return respondentDAO;
    }
    
    public ResponseDAO getResponseDAO() {
        return responseDAO;
    }
    
	public boolean getRequireSSL() {
		return requireSSL;
	}
}
