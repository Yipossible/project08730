package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.genericdao.RollbackException;
import org.mybeans.form.FormBeanException;
import org.mybeans.form.FormBeanFactory;

import databeans.CustomerBean;
import databeans.TransactionBean;
import formbeans.BuyFundForm;
import formbeans.RequestCheckForm;
import model.CustomerDAO;
import model.FundDAO;
import model.Model;
import model.TransactionDAO;

public class Page03Action extends Action {
	private FormBeanFactory<RequestCheckForm> formBeanFactory = FormBeanFactory
            .getInstance(RequestCheckForm.class);
	
	private TransactionDAO transactionDAO;
    private FundDAO fundDAO;

    public Page03Action(Model model) {
        transactionDAO = model.getTransactionDAO();
        fundDAO = model.getFundDAO();
    }

    @Override
    public String getName() {
        return "c_requestCheck.do";
    }

    @Override
    public String perform(HttpServletRequest request) {
        List<String> errors = new ArrayList<String>();
        List<String> successMessage = new ArrayList<String>();
        HttpSession session = request.getSession();
        session.setAttribute("successMessage", successMessage);
        session.setAttribute("errors", errors);
        try {
            RequestCheckForm form = formBeanFactory.create(request);

            if (!form.isPresent()) {
                return "c_home.do";
            }

            errors.addAll(form.getValidationErrors());
            if (errors.size() != 0) {
                return "c_home.do";
            }

            CustomerBean c = (CustomerBean)session.getAttribute("customer");
            if (c != null) {
            	double amountInProcessing = 0;
            	TransactionBean[] oldTransactions = transactionDAO.getTransactionByCustomerId(c.getCustomerId());
            	for (int i = 0; i < oldTransactions.length; i++) {
            		if (oldTransactions[i].getTransaction_type().equals("pending") 
            				&& (oldTransactions[i].getOrder_type().equals("buy") || oldTransactions[i].getOrder_type().equals("requestcheck"))) {
            			amountInProcessing  += oldTransactions[i].getDollar_amount(); 
            		}
            	}
            	if (amountInProcessing + Double.parseDouble(form.getCheckAmount()) > c.getCash()) {
            		errors.add("Cannot add request. Insufficient Funds.");
            		return "c_home.do";
            	}
            	
            	TransactionBean t = new TransactionBean(); 
            	t.setCustomer_id(c.getCustomerId());
            	t.setDate(new Date());
            	t.setOrder_type("requestcheck");
            	t.setDollar_amount(Double.parseDouble(form.getCheckAmount()));
            	t.setTransaction_type("pending");
            	transactionDAO.addTransaction(t);
            	successMessage.add("Request to encash $" + form.getCheckAmount() + " successfull placed.");
            }
            else {
                return "login.jsp";
            }
            return "c_home.do";
        } catch (RollbackException e) {
            errors.add(e.toString());
            return "error.jsp";
        } catch (FormBeanException e) {
            errors.add(e.toString());
            return "error.jsp";
        }
    }

}
