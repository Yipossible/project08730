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
public class Page04Form extends FormBean {
    private String workFromHome;
    private String workFromHomeExplain;
    private String device;
    private String deviceExplain;
    private String houseType;
    private String houseLiveTime;
    
    

    /**
     * @return the workFromHome
     */
    public String getWorkFromHome() {
        return workFromHome;
    }



    /**
     * @param workFromHome the workFromHome to set
     */
    public void setWorkFromHome(String workFromHome) {
        this.workFromHome = workFromHome;
    }



    /**
     * @return the workFromHomeExplain
     */
    public String getWorkFromHomeExplain() {
        return workFromHomeExplain;
    }



    /**
     * @param workFromHomeExplain the workFromHomeExplain to set
     */
    public void setWorkFromHomeExplain(String workFromHomeExplain) {
        this.workFromHomeExplain = workFromHomeExplain;
    }



    /**
     * @return the device
     */
    public String getDevice() {
        return device;
    }



    /**
     * @param device the device to set
     */
    public void setDevice(String device) {
        this.device = device;
    }



    /**
     * @return the deviceExplain
     */
    public String getDeviceExplain() {
        return deviceExplain;
    }



    /**
     * @param deviceExplain the deviceExplain to set
     */
    public void setDeviceExplain(String deviceExplain) {
        this.deviceExplain = deviceExplain;
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
        this.houseType = houseType;
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
        this.houseLiveTime = houseLiveTime;
    }



    public List<String> getValidationErrors() {
        List<String> errors = new ArrayList<String>();
        if (workFromHome == null || workFromHome.length() == 0) {
            errors.add("Please choose your answer for question 4");
        }
        
        if (device == null || device.length() == 0) {
            errors.add("Please choose your answer for question 5");
        }
        
        if (houseType == null || houseType.length() == 0) {
            errors.add("Please choose your answer for house type");
        } else if (houseType.length() > 15 || houseType.length() >15) {
            errors.add("This is an non-applicable house type.");
            return errors;
        }
        if (houseLiveTime == null || houseLiveTime.length() == 0) {
            errors.add("Please answer how many years have you lived in your current house or apartment, as a required question.");
        } else if (houseLiveTime.length() > 15 || houseLiveTime.length() >15) {
            errors.add("Please enter a reason number for the years you lived in your current house");
            return errors;
        }

        try {
            double hl = Double.parseDouble(houseLiveTime);
            if (hl < 0) {
                errors.add("Please enter a reason number for the years you lived in your current house");
            }
        } catch (NumberFormatException e) {
            errors.add("Please enter the years you lived in your current house in a valid format");
        }
        return errors;
    }

}
