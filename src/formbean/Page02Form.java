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
public class Page02Form extends FormBean {
    private String over18;
    private String livedOver3;
    private String over2adult;
    private String understand;
    private String participate;
    private String email;
    
    
    /**
     * @return the over18
     */
    public String getOver18() {
        return over18;
    }


    /**
     * @param over18 the over18 to set
     */
    public void setOver18(String over18) {
        this.over18 = over18;
    }


    /**
     * @return the livedOver3
     */
    public String getLivedOver3() {
        return livedOver3;
    }


    /**
     * @param livedOver3 the livedOver3 to set
     */
    public void setLivedOver3(String livedOver3) {
        this.livedOver3 = livedOver3;
    }


    /**
     * @return the over2adult
     */
    public String getOver2adult() {
        return over2adult;
    }


    /**
     * @param over2adult the over2adult to set
     */
    public void setOver2adult(String over2adult) {
        this.over2adult = over2adult;
    }


    /**
     * @return the understand
     */
    public String getUnderstand() {
        return understand;
    }


    /**
     * @param understand the understand to set
     */
    public void setUnderstand(String understand) {
        this.understand = understand;
    }


    /**
     * @return the participate
     */
    public String getParticipate() {
        return participate;
    }


    /**
     * @param participate the participate to set
     */
    public void setParticipate(String participate) {
        this.participate = participate;
    }


    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }


    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }


    public List<String> getValidationErrors() {
        List<String> errors = new ArrayList<String>();
       
        if (over18 == null || over18.length() == 0) {
            errors.add("over18 is required");
        }
        if (email == null || email.length() == 0) {
            errors.add("email is required");
        } 
        if (participate == null || participate.length() == 0) {
            errors.add("participate is required");
        } 
        if (understand == null || understand.length() == 0) {
            errors.add("understand is required");
        } 
        if (over2adult == null || over2adult.length() == 0) {
            errors.add("over2adult is required");
        }
        if (livedOver3 == null || livedOver3.length() == 0) {
            errors.add("livedOver3 is required");
        }
        return errors;
    }

}
