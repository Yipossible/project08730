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
       
        if (houseType == null || houseType.length() == 0) {
            errors.add("houseType is required");
        } else if (houseType.length() > 15 || houseType.length() >15) {
            errors.add("Invalid values");
            return errors;
        }
        if (houseLiveTime == null || houseLiveTime.length() == 0) {
            errors.add("houseLiveTime is required");
        } else if (houseLiveTime.length() > 15 || houseLiveTime.length() >15) {
            errors.add("Invalid values");
            return errors;
        }

        try {
            double hl = Double.parseDouble(houseLiveTime);
            if (hl < 0) {
                errors.add("Invalid value");
            }
        } catch (NumberFormatException e) {
            errors.add("Invalid format for amount");
        }
        return errors;
    }

}
