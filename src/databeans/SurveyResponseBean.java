package databeans;

import java.sql.Timestamp;

import org.genericdao.PrimaryKey;

@PrimaryKey("respondent_id")
public class SurveyResponseBean {
	private int respondent_id;
	private int survey_id;
	private Timestamp timestamp;
	private String response;
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
    /**
     * @return the survey_id
     */
    public int getSurvey_id() {
        return survey_id;
    }
    /**
     * @param survey_id the survey_id to set
     */
    public void setSurvey_id(int survey_id) {
        this.survey_id = survey_id;
    }
    /**
     * @return the timestamp
     */
    public Timestamp getTimestamp() {
        return timestamp;
    }
    /**
     * @param timestamp the timestamp to set
     */
    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
    /**
     * @return the response
     */
    public String getResponse() {
        return response;
    }
    /**
     * @param response the response to set
     */
    public void setResponse(String response) {
        this.response = response;
    }
}
