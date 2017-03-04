/**
 * 
 */
package formbean;

import java.util.ArrayList;
import java.util.List;
import org.mybeans.form.FormBean;

/**
 * @author jennyching
 *
 */
public class PaymentForm extends FormBean {
    private String amazonAccount;

    
   
	/**
     * @return the amazonAccount
     */
    public String getAmazonAccount() {
        return amazonAccount;
    }



    /**
     * @param amazonAccount the amazonAccount to set
     */
    public void setAmazonAccount(String amazonAccount) {
        this.amazonAccount = amazonAccount;
    }



    public List<String> getValidationErrors() {
        List<String> errors = new ArrayList<String>();
        if (amazonAccount == null || amazonAccount.length() == 0) {
            errors.add("amazonAccount is required");
        } 
        return errors;
    }

}
