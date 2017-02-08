package databeans;

import org.genericdao.PrimaryKey;

@PrimaryKey("respondent_id")
public class RespondentBean {
    private int respondent_id;
    private int survey_id;
    private String unique_id;
    private String zipcode;
    private int age;
	private String email;
	private String payment_account;
	private String geo_info;
	private boolean full_payment;
	
	/**
     * @return the respondent_id
     */
    public int getRespondent_id() {
        return respondent_id;
    }
    /**
     * @param respondent_id the respondent_id to set
     */
    public void setRespondent_id(int respondent_id) {
        this.respondent_id = respondent_id;
    }
    public int getSurvey_id() {
		return survey_id;
	}
	public void setSurvey_id(int survey_id) {
		this.survey_id = survey_id;
	}
	
    /**
     * @return the session_id
     */
    public String getUnique_id() {
        return unique_id;
    }
    /**
     * @param session_id the session_id to set
     */
    public void setUnique_id(String unique_id) {
        this.unique_id = unique_id;
    }
    /**
     * @param zipcode the zipcode to set
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    
    /**
     * @return the zipcode
     */
    public String getZipcode() {
        return zipcode;
    }
    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }
    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
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
    /**
     * @return the payment_account
     */
    public String getPayment_account() {
        return payment_account;
    }
    /**
     * @param payment_account the payment_account to set
     */
    public void setPayment_account(String payment_account) {
        this.payment_account = payment_account;
    }
    /**
     * @return the geo_info
     */
    public String getGeo_info() {
        return geo_info;
    }
    /**
     * @param geo_info the geo_info to set
     */
    public void setGeo_info(String geo_info) {
        this.geo_info = geo_info;
    }
    /**
     * @return the full_payment
     */
    public boolean isFull_payment() {
        return full_payment;
    }
    /**
     * @param full_payment the full_payment to set
     */
    public void setFull_payment(boolean full_payment) {
        this.full_payment = full_payment;
    }
}
