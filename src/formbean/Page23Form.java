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
public class Page23Form extends FormBean {
    private String race;
    private String income;
    private String payer;
    private String estimate_amps;
    private String estimate_kWh;
    
    

    /**
     * @return the race
     */
    public String getRace() {
        return race;
    }



    /**
     * @param race the race to set
     */
    public void setRace(String race) {
        this.race = race;
    }



    /**
     * @return the income
     */
    public String getIncome() {
        return income;
    }



    /**
     * @param income the income to set
     */
    public void setIncome(String income) {
        this.income = income;
    }



    /**
     * @return the payer
     */
    public String getPayer() {
        return payer;
    }



    /**
     * @param payer the payer to set
     */
    public void setPayer(String payer) {
        this.payer = payer;
    }



    /**
     * @return the estimate_amps
     */
    public String getEstimate_amps() {
        return estimate_amps;
    }



    /**
     * @param estimate_amps the estimate_amps to set
     */
    public void setEstimate_amps(String estimate_amps) {
        this.estimate_amps = estimate_amps;
    }



    /**
     * @return the estimate_kWh
     */
    public String getEstimate_kWh() {
        return estimate_kWh;
    }



    /**
     * @param estimate_kWh the estimate_kWh to set
     */
    public void setEstimate_kWh(String estimate_kWh) {
        this.estimate_kWh = estimate_kWh;
    }



    public List<String> getValidationErrors() {
        List<String> errors = new ArrayList<String>();
        if (race == null || race.length() == 0) {
            errors.add("zipcode is required");
        } else if (race.length() > 5 || race.length() > 5) {
            errors.add("Invalid values");
            return errors;
        }
        if (income == null || income.length() == 0) {
            errors.add("cityLiveTime is required");
        } else if (income.length() > 15 || income.length() >15) {
            errors.add("Invalid values");
            return errors;
        }
        
        if (payer == null || payer.length() == 0) {
            errors.add("age is required");
        } else if (payer.length() > 3 || payer.length() > 3) {
            errors.add("Invalid values");
            return errors;
        }
//        if (estimate_kWh == null || estimate_kWh.length() == 0) {
//            errors.add("age is required");
//        } else if (estimate_kWh.length() > 3 || estimate_kWh.length() > 3) {
//            errors.add("Invalid values");
//            return errors;
//        }
//        if (estimate_amps == null || estimate_amps.length() == 0) {
//            errors.add("age is required");
//        } else if (estimate_amps.length() > 3 || estimate_amps.length() > 3) {
//            errors.add("Invalid values");
//            return errors;
//        }
//        try {
//            double k = Double.parseDouble(estimate_kWh);
//            double a = Double.parseDouble(estimate_amps);
//            if (a < 0 || k < 0 ) {
//                errors.add("Invalid value");
//            }
//        } catch (NumberFormatException e) {
//            errors.add("Invalid format for amount");
//        }
        return errors;
    }

}
