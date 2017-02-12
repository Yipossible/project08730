package formbean;

import java.util.ArrayList;
import java.util.List;

import org.mybeans.form.FormBean;

public class Page25Form extends FormBean{
	private String page_25_1;
	private String page_25_2;
	private String page_25_3;
	private String page_25_4;
	private String page_25_5;
	private String page_25_6;
	private String page_25_7;
	private String page_25_8;
	
	public String getPage_25_1() {
		return page_25_1;
	}
	public void setPage_25_1(String page_25_1) {
		this.page_25_1 = page_25_1;
	}
	public String getPage_25_2() {
		return page_25_2;
	}
	public void setPage_25_2(String page_25_2) {
		this.page_25_2 = page_25_2;
	}
	public String getPage_25_3() {
		return page_25_3;
	}
	public void setPage_25_3(String page_25_3) {
		this.page_25_3 = page_25_3;
	}
	public String getPage_25_4() {
		return page_25_4;
	}
	public void setPage_25_4(String page_25_4) {
		this.page_25_4 = page_25_4;
	}
	public String getPage_25_5() {
		return page_25_5;
	}
	public void setPage_25_5(String page_25_5) {
		this.page_25_5 = page_25_5;
	}
	public String getPage_25_6() {
		return page_25_6;
	}
	public void setPage_25_6(String page_25_6) {
		this.page_25_6 = page_25_6;
	}
	public String getPage_25_7() {
		return page_25_7;
	}
	public void setPage_25_7(String page_25_7) {
		this.page_25_7 = page_25_7;
	}
	public String getPage_25_8() {
		return page_25_8;
	}
	public void setPage_25_8(String page_25_8) {
		this.page_25_8 = page_25_8;
	}

	public List<String> getValidationErrors() {
		List<String> errors = new ArrayList<String>();
		
		if(page_25_1 == null || page_25_1.length() == 0) {
			errors.add("Please fill row 1.");
		}
		
		if(page_25_2 == null || page_25_2.length() == 0) {
			errors.add("Please fill row 2.");
		}
		
		if(page_25_3 == null || page_25_3.length() == 0) {
			errors.add("Please fill row 3.");
		}
		
		if(page_25_4 == null || page_25_4.length() == 0) {
			errors.add("Please fill row 4.");
		}
		
		if(page_25_5 == null || page_25_5.length() == 0) {
			errors.add("Please fill row 5.");
		}
		
		if(page_25_6 == null || page_25_6.length() == 0) {
			errors.add("Please fill row 6.");
		}
		
		if(page_25_7 == null || page_25_7.length() == 0) {
			errors.add("Please fill row 7.");
		}
		
		if(page_25_8 == null || page_25_8.length() == 0) {
			errors.add("Please fill row 8.");
		}
		
		
		if (errors.size() > 0) {
			return errors;
		}
		return errors;
	}
}

