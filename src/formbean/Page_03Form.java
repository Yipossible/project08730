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
public class Page_03Form extends FormBean {
    private String zipcode;
    private String cityLiveTime;
    private String houseType;
    private String houseLiveTime;
    private String age;
    private String preschool;
    private String k12;
    private String under30;
    private String from30to65;
    private String over65;
    
    /**
     * @return the zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * @param zipcode the zipcode to set
     */
    public void setZipcode(String zipcode) {
        this.zipcode = trimAndConvert(zipcode, "<>\"");
    }

    /**
     * @return the cityLiveTime
     */
    public String getCityLiveTime() {
        return cityLiveTime;
    }

    /**
     * @param cityLiveTime the cityLiveTime to set
     */
    public void setCityLiveTime(String cityLiveTime) {
        this.cityLiveTime = trimAndConvert(cityLiveTime, "<>\"");
    }

    /**
     * @return the houseType
     */
    public String getHouseType() {
        return houseType;
    }

    /**
     * @param houseType the houseType to set
     */
    public void setHouseType(String houseType) {
        this.houseType = trimAndConvert(houseType, "<>\"");
    }

    /**
     * @return the houseLiveTime
     */
    public String getHouseLiveTime() {
        return houseLiveTime;
    }

    /**
     * @param houseLiveTime the houseLiveTime to set
     */
    public void setHouseLiveTime(String houseLiveTime) {
        this.houseLiveTime = trimAndConvert(houseLiveTime, "<>\"");
    }

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = trimAndConvert(age, "<>\"");
    }

    /**
     * @return the preschool
     */
    public String getPreschool() {
        return preschool;
    }

    /**
     * @param preschool the preschool to set
     */
    public void setPreschool(String preschool) {
        this.preschool = trimAndConvert(preschool, "<>\"");
    }

    /**
     * @return the k12
     */
    public String getK12() {
        return k12;
    }

    /**
     * @param k12 the k12 to set
     */
    public void setK12(String k12) {
        this.k12 = trimAndConvert(k12, "<>\"");
    }

    /**
     * @return the under30
     */
    public String getUnder30() {
        return under30;
    }

    /**
     * @param under30 the under30 to set
     */
    public void setUnder30(String under30) {
        this.under30 = trimAndConvert(under30, "<>\"");
    }

    /**
     * @return the from30to65
     */
    public String getFrom30to65() {
        return from30to65;
    }

    /**
     * @param from30to65 the from30to65 to set
     */
    public void setFrom30to65(String from30to65) {
        this.from30to65 = trimAndConvert(from30to65, "<>\"");
    }

    /**
     * @return the over65
     */
    public String getOver65() {
        return over65;
    }

    /**
     * @param over65 the over65 to set
     */
    public void setOver65(String over65) {
        this.over65 = trimAndConvert(over65, "<>\"");
    }

    public List<String> getValidationErrors() {
        List<String> errors = new ArrayList<String>();
        if (zipcode == null || zipcode.length() == 0) {
            errors.add("zipcode is required");
        }
        if (zipcode.length() > 5 || zipcode.length() > 5) {
            errors.add("Invalid values");
            return errors;
        }
        if (cityLiveTime == null || cityLiveTime.length() == 0) {
            errors.add("cityLiveTime is required");
        }
        if (cityLiveTime.length() > 15 || cityLiveTime.length() >15) {
            errors.add("Invalid values");
            return errors;
        }
        if (houseType == null || houseType.length() == 0) {
            errors.add("houseType is required");
        }
        if (houseType.length() > 15 || houseType.length() >15) {
            errors.add("Invalid values");
            return errors;
        }
        if (houseLiveTime == null || houseLiveTime.length() == 0) {
            errors.add("houseLiveTime is required");
        }
        if (houseLiveTime.length() > 15 || houseLiveTime.length() >15) {
            errors.add("Invalid values");
            return errors;
        }
        if (age == null || age.length() == 0) {
            errors.add("age is required");
        }
        if (age.length() > 3 || age.length() > 3) {
            errors.add("Invalid values");
            return errors;
        }
        try {
            double a = Double.parseDouble(age);
            double hl = Double.parseDouble(houseLiveTime);
            double cl = Double.parseDouble(cityLiveTime);
            int z = Integer.parseInt(zipcode);
            if (a < 0 || hl < 0 || cl < 0 || z < 9999) {
                errors.add("Invalid value");
            }
        } catch (NumberFormatException e) {
            errors.add("Invalid format for amount");
        }
        return errors;
    }

}
