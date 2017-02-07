package model;

import org.genericdao.ConnectionPool;
import org.genericdao.DAOException;
import org.genericdao.GenericDAO;
import org.genericdao.MatchArg;
import org.genericdao.RollbackException;
import org.genericdao.Transaction;

import databeans.ResponseBean;

public class RespondentDAO extends GenericDAO<ResponseBean> {

    public RespondentDAO(ConnectionPool cp, String tableName) throws DAOException {
        super(ResponseBean.class, tableName, cp);
    }
    
    public void create(ResponseBean r) throws RollbackException {
        try {
            Transaction.begin();
            ResponseBean a[] = match(MatchArg.equals("payment_account", r.getPayment_account()));
            if (a.length > 0)
                throw new RollbackException("User already exists, duplicate submission is not allowed!");
            super.create(r);
            Transaction.commit();
        } finally {
            if (Transaction.isActive()) {
                Transaction.rollback();
            }
        }
    }
}
