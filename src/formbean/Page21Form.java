package formbean;

import java.util.ArrayList;
import java.util.List;

import org.mybeans.form.FormBean;

public class Page21Form extends FormBean{
	private String page_21_1;
	private String page_21_2;
	private String page_21_3;
	private String page_21_4;
	private String page_21_5;
	private String page_21_6;
	private String page_21_7;
	private String page_21_8;
	private String page_21_9;
	private String page_21_10;
	private String page_21_11;
	
	public String getPage_21_1() {
		return page_21_1;
	}
	public void setPage_21_1(String page_21_1) {
		this.page_21_1 = page_21_1;
	}
	public String getPage_21_2() {
		return page_21_2;
	}
	public void setPage_21_2(String page_21_2) {
		this.page_21_2 = page_21_2;
	}
	public String getPage_21_3() {
		return page_21_3;
	}
	public void setPage_21_3(String page_21_3) {
		this.page_21_3 = page_21_3;
	}
	public String getPage_21_4() {
		return page_21_4;
	}
	public void setPage_21_4(String page_21_4) {
		this.page_21_4 = page_21_4;
	}
	public String getPage_21_5() {
		return page_21_5;
	}
	public void setPage_21_5(String page_21_5) {
		this.page_21_5 = page_21_5;
	}
	public String getPage_21_6() {
		return page_21_6;
	}
	public void setPage_21_6(String page_21_6) {
		this.page_21_6 = page_21_6;
	}
	public String getPage_21_7() {
		return page_21_7;
	}
	public void setPage_21_7(String page_21_7) {
		this.page_21_7 = page_21_7;
	}
	public String getPage_21_8() {
		return page_21_8;
	}
	public void setPage_21_8(String page_21_8) {
		this.page_21_8 = page_21_8;
	}
	public String getPage_21_9() {
		return page_21_9;
	}
	public void setPage_21_9(String page_21_9) {
		this.page_21_9 = page_21_9;
	}
	public String getPage_21_10() {
		return page_21_10;
	}
	public void setPage_21_10(String page_21_10) {
		this.page_21_10 = page_21_10;
	}
	public String getPage_21_11() {
		return page_21_11;
	}
	public void setPage_21_11(String page_21_11) {
		this.page_21_11 = page_21_11;
	}

	public List<String> getValidationErrors() {
		List<String> errors = new ArrayList<String>();
		
		if(page_21_1 == null || page_21_1.length() == 0) {
			errors.add("Please fill row 1.");
		}
		
		if(page_21_2 == null || page_21_2.length() == 0) {
			errors.add("Please fill row 2.");
		}
		
		if(page_21_3 == null || page_21_3.length() == 0) {
			errors.add("Please fill row 3.");
		}
		
		if(page_21_4 == null || page_21_4.length() == 0) {
			errors.add("Please fill row 4.");
		}
		
		if(page_21_5 == null || page_21_5.length() == 0) {
			errors.add("Please fill row 5.");
		}
		
		if(page_21_6 == null || page_21_6.length() == 0) {
			errors.add("Please fill row 6.");
		}
		
		if(page_21_7 == null || page_21_7.length() == 0) {
			errors.add("Please fill row 7.");
		}
		
		if(page_21_8 == null || page_21_8.length() == 0) {
			errors.add("Please fill row 8.");
		}
		
		if(page_21_9 == null || page_21_9.length() == 0) {
			errors.add("Please fill row 9.");
		}
		
		if(page_21_10 == null || page_21_10.length() == 0) {
			errors.add("Please fill row 10.");
		}
		
		if(page_21_11 == null || page_21_11.length() == 0) {
			errors.add("Please fill row 11.");
		}
		

		
		if (errors.size() > 0) {
			return errors;
		}
		return errors;
	}
}

