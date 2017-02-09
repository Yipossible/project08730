package databeans;

import org.genericdao.PrimaryKey;

@PrimaryKey("response_id")
public class ResponseBean {
    private int response_id;
    private int question_id;
	private int respondent_id;
	private String response;
	
	/**
     * @return the response_id
     */
    public int getResponse_id() {
        return response_id;
    }
    /**
     * @param response_id the response_id to set
     */
    public void setResponse_id(int response_id) {
        this.response_id = response_id;
    }
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public int getRespondent_id() {
		return respondent_id;
	}
	public void setRespondent_id(int respondent_id) {
		this.respondent_id = respondent_id;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	
	
	
}
