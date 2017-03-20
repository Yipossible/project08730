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
public class Page05Form extends FormBean {
    private String ans;

    

    /**
     * @return the ans
     */
    public String getAns() {
        return ans;
    }



    /**
     * @param ans the ans to set
     */
    public void setAns(String ans) {
        this.ans = ans;
    }



    public List<String> getValidationErrors() {
        List<String> errors = new ArrayList<String>();
        if (ans == null || ans.length() == 0) {
            errors.add("Please answer the quesion after watching the video.");
        }
        System.out.println("teste" + ans);
        return errors;
    }

}
