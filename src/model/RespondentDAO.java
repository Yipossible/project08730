package model;

import org.genericdao.ConnectionPool;
import org.genericdao.DAOException;
import org.genericdao.GenericDAO;
import org.genericdao.MatchArg;
import org.genericdao.RollbackException;
import org.genericdao.Transaction;

import databeans.RespondentBean;

public class RespondentDAO extends GenericDAO<RespondentBean> {

    public RespondentDAO(ConnectionPool cp, String tableName) throws DAOException {
        super(RespondentBean.class, tableName, cp);
    }
    
    public void create(RespondentBean r) throws RollbackException {
        try {
            Transaction.begin();
            RespondentBean a[] = match(MatchArg.equals("payment_account", r.getPayment_account())); // compare or email duplicated
            RespondentBean b[] = match(MatchArg.equals("email", r.getEmail()));
            if (a.length > 0)
                throw new RollbackException("User already exists, duplicate submission is not allowed!");
            if (b.length > 0)
                throw new RollbackException("User already exists, duplicate submission is not allowed!");
            super.create(r);
            Transaction.commit();
        } finally {
            if (Transaction.isActive()) {
                Transaction.rollback();
            }
        }
    }
    // read the respondent
    public RespondentBean read(String unique_id) throws RollbackException {
        RespondentBean a[] = match(MatchArg.equals("unique_id", unique_id));
        if (a.length == 1) {
            return a[0];
        } else {
            return null;
        }
    }
}
