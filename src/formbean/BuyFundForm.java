package formbean;

import java.util.ArrayList;
import java.util.List;
import org.mybeans.form.FormBean;

public class BuyFundForm extends FormBean {
	private String fundId;
	private String amount;
	
	public String getFundId() {
		return fundId;
	}

	public String getAmount() {
		return amount;
	}

	public void setFundId(String fundId) {
		this.fundId = trimAndConvert(fundId, "<>\"");
	}

	public void setAmount(String amount) {
		this.amount = trimAndConvert(amount, "<>\"");
	}

	public List<String> getValidationErrors() {
        List<String> errors = new ArrayList<String>();
        if (fundId == null || fundId.length() == 0) {
            errors.add("Fund is required");
        }
        if (amount == null || amount.length() == 0) {
            errors.add("Amount is required");
        }
        if (fundId.length() > 15 || amount.length() >15) {
        	errors.add("Invalid values");
        	return errors;
        }
        try {
        	double amt = Double.parseDouble(amount);
        	if (amt < 0.01) {
        		errors.add("Please enter a bigger amount.");
        	}
        } catch (NumberFormatException e) {
        	errors.add("Invalid format for amount");
        }
        return errors;
    }

}
