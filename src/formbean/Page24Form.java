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
public class Page24Form extends FormBean {
    private String experience;
    private String available_1;
    private String available_2;
    private String available_3;
    private String available_4;
    private String available_5;
    private String available_6;
    private String available_7;
    private String available_8;
    private String available_9;
    


    /**
     * @return the available_1
     */
    public String getAvailable_1() {
        return available_1;
    }



    /**
     * @param available_1 the available_1 to set
     */
    public void setAvailable_1(String available_1) {
        this.available_1 = available_1;
    }



    /**
     * @return the available_2
     */
    public String getAvailable_2() {
        return available_2;
    }



    /**
     * @param available_2 the available_2 to set
     */
    public void setAvailable_2(String available_2) {
        this.available_2 = available_2;
    }



    /**
     * @return the available_3
     */
    public String getAvailable_3() {
        return available_3;
    }



    /**
     * @param available_3 the available_3 to set
     */
    public void setAvailable_3(String available_3) {
        this.available_3 = available_3;
    }



    /**
     * @return the available_4
     */
    public String getAvailable_4() {
        return available_4;
    }



    /**
     * @param available_4 the available_4 to set
     */
    public void setAvailable_4(String available_4) {
        this.available_4 = available_4;
    }



    /**
     * @return the available_5
     */
    public String getAvailable_5() {
        return available_5;
    }



    /**
     * @param available_5 the available_5 to set
     */
    public void setAvailable_5(String available_5) {
        this.available_5 = available_5;
    }



    /**
     * @return the available_6
     */
    public String getAvailable_6() {
        return available_6;
    }



    /**
     * @param available_6 the available_6 to set
     */
    public void setAvailable_6(String available_6) {
        this.available_6 = available_6;
    }



    /**
     * @return the available_7
     */
    public String getAvailable_7() {
        return available_7;
    }



    /**
     * @param available_7 the available_7 to set
     */
    public void setAvailable_7(String available_7) {
        this.available_7 = available_7;
    }



    /**
     * @return the available_8
     */
    public String getAvailable_8() {
        return available_8;
    }



    /**
     * @param available_8 the available_8 to set
     */
    public void setAvailable_8(String available_8) {
        this.available_8 = available_8;
    }



    /**
     * @return the available_9
     */
    public String getAvailable_9() {
        return available_9;
    }



    /**
     * @param available_9 the available_9 to set
     */
    public void setAvailable_9(String available_9) {
        this.available_9 = available_9;
    }



    /**
     * @return the experience
     */
    public String getExperience() {
        return experience;
    }



    /**
     * @param experience the experience to set
     */
    public void setExperience(String experience) {
        this.experience = experience;
    }



    public List<String> getValidationErrors() {
        List<String> errors = new ArrayList<String>();
        if (experience == null || experience.length() == 0) {
            errors.add("quesion 4 is required");
        } 
        return errors;
    }

}
