package model;

import org.genericdao.ConnectionPool;
import org.genericdao.DAOException;
import org.genericdao.GenericDAO;
import org.genericdao.MatchArg;
import org.genericdao.RollbackException;
import org.genericdao.Transaction;

import databeans.SurveyResponseBean;

public class SurveyResponseDAO extends GenericDAO<SurveyResponseBean>{
	public SurveyResponseDAO(ConnectionPool cp, String tableName) throws DAOException{
		super(SurveyResponseBean.class, tableName, cp);
	}
	
	public void create(SurveyResponseBean sr) throws RollbackException {
		try {
			Transaction.begin();
			SurveyResponseBean srList[] = match(MatchArg.equals("respondent_id", sr.getRespondent_id()));
			if (srList.length > 0) {
				throw new RollbackException("This user has already completed one survey with valid response;");
			}
			super.create(sr);
			Transaction.commit();
		} finally {
			if (Transaction.isActive()) {
                Transaction.rollback();
            }
		}
	// count number of respondents by surveyID
	}
	
}
