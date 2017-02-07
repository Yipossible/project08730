package model;

import org.genericdao.ConnectionPool;
import org.genericdao.DAOException;
import org.genericdao.GenericDAO;
import org.genericdao.MatchArg;
import org.genericdao.RollbackException;
import org.genericdao.Transaction;


import databeans.ResponseBean;

public class ResponseDAO extends GenericDAO<ResponseBean>{
	public ResponseDAO(ConnectionPool cp, String tablename) throws DAOException {
		super(ResponseBean.class, tablename, cp);
	}
	
	public void create(ResponseBean r) throws RollbackException {
		try {
			Transaction.begin();
			ResponseBean response[] = match(MatchArg.and(MatchArg.equals("respondent_id", r.getRespondent_id()),
					MatchArg.equals("question_id", r.getQuestion_id())));
			if(response.length > 0) {
				throw new RollbackException("User has already answered this question.");
			}
			super.create(r);
			Transaction.commit();
		} finally {
			if (Transaction.isActive()) {
                Transaction.rollback();
            }
		}
		
	}
}
