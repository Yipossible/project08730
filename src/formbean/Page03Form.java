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
public class Page03Form extends FormBean {
    private String zipcode;
    private String cityLiveTime;
    private String age;
    private String preschool;
    private String k12;
    private String under30;
    private String from30to65;
    private String over65;
    private String coordinates;
    private String address;
    
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
        this.zipcode = trimAndConvert(zipcode, "<>&\"");
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
        this.cityLiveTime = trimAndConvert(cityLiveTime, "<>&\"");
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
        this.age = trimAndConvert(age, "<>&\"");
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
        this.preschool = trimAndConvert(preschool, "<>\"&");
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
        this.k12 = trimAndConvert(k12, "<>&\"");
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
        this.under30 = trimAndConvert(under30, "<>&\"");
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
        this.from30to65 = trimAndConvert(from30to65, "<>&\"");
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
        this.over65 = trimAndConvert(over65, "<>&\"");
    }

    
    
    public String getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<String> getValidationErrors() {
        List<String> errors = new ArrayList<String>();
        if (zipcode == null || zipcode.length() == 0) {
            errors.add("zipcode is required");
        } else if (zipcode.length() > 5 || zipcode.length() > 5) {
            errors.add("Invalid values");
            return errors;
        }
        if (cityLiveTime == null || cityLiveTime.length() == 0) {
            errors.add("cityLiveTime is required");
        } else if (cityLiveTime.length() > 15 || cityLiveTime.length() >15) {
            errors.add("Invalid values");
            return errors;
        }
        
        if (age == null || age.length() == 0) {
            errors.add("age is required");
        } else if (age.length() > 3 || age.length() > 3) {
            errors.add("Invalid values");
            return errors;
        }
        
//        if (address == null || address.length() == 0) {
//        	errors.add("geoAPI use reaches limit");
//        	return errors;
//        }
//        
//        if (coordinates == null || coordinates.length() == 0) {
//        	errors.add("geoAPI use reaches limit");
//        	return errors;
//        }
        
        
        try {
            double a = Double.parseDouble(age);
            double cl = Double.parseDouble(cityLiveTime);
            double o = Double.parseDouble(over65);
            double p = Double.parseDouble(preschool);
            double f = Double.parseDouble(from30to65);
            double u = Double.parseDouble(under30);
            double k = Double.parseDouble(k12);
            int z = Integer.parseInt(zipcode);
            if (a < 0 || cl < 0 || z < 9999) {
                errors.add("Invalid value");
            }
        } catch (NumberFormatException e) {
            errors.add("Please input all numbers!");
        }
        return errors;
    }

}
