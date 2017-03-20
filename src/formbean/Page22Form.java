package formbean;

import java.util.ArrayList;
import java.util.List;

import org.mybeans.form.FormBean;

public class Page22Form extends FormBean{
	private String page_22_1;
	private String page_22_2;
	private String page_22_3;
	private String page_22_4;
	private String page_22_5;
	
	public String getPage_22_1() {
		return page_22_1;
	}
	public void setPage_22_1(String page_22_1) {
		this.page_22_1 = page_22_1;
	}
	public String getPage_22_2() {
		return page_22_2;
	}
	public void setPage_22_2(String page_22_2) {
		this.page_22_2 = page_22_2;
	}
	public String getPage_22_3() {
		return page_22_3;
	}
	public void setPage_22_3(String page_22_3) {
		this.page_22_3 = page_22_3;
	}
	public String getPage_22_4() {
		return page_22_4;
	}
	public void setPage_22_4(String page_22_4) {
		this.page_22_4 = page_22_4;
	}
	public String getPage_22_5() {
		return page_22_5;
	}
	public void setPage_22_5(String page_22_5) {
		this.page_22_5 = page_22_5;
	}
	
	public List<String> getValidationErrors() {
		List<String> errors = new ArrayList<String>();
		
		if(page_22_1 == null || page_22_1.length() == 0) {
			errors.add("Please fill row 1.");
		}
		
		if(page_22_2 == null || page_22_2.length() == 0) {
			errors.add("Please fill row 2.");
		}
		
		if(page_22_3 == null || page_22_3.length() == 0) {
			errors.add("Please fill row 3.");
		}
		
		if(page_22_4 == null || page_22_4.length() == 0) {
			errors.add("Please fill row 4.");
		}
		
		if(page_22_5 == null || page_22_5.length() == 0) {
			errors.add("Please fill row 5.");
		}
		
		
		if (errors.size() > 0) {
			return errors;
		}
		return errors;
	}
}

