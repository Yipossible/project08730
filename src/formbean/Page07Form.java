package formbean;

import java.util.ArrayList;
import java.util.List;

import org.mybeans.form.FormBean;

public class Page07Form  extends FormBean{
	private String page_07_1;
	private String page_07_2;
	private String page_07_3;
	private String page_07_4;
	private String page_07_5;
	private String page_07_6;
	private String page_07_7;
	private String page_07_8;
	private String page_07_9;
	private String page_07_10;
	private String page_07_11;
	public String getPage_07_1() {
		return page_07_1;
	}
	public void setPage_07_1(String page_07_1) {
		this.page_07_1 = page_07_1;
	}
	public String getPage_07_2() {
		return page_07_2;
	}
	public void setPage_07_2(String page_07_2) {
		this.page_07_2 = page_07_2;
	}
	public String getPage_07_3() {
		return page_07_3;
	}
	public void setPage_07_3(String page_07_3) {
		this.page_07_3 = page_07_3;
	}
	public String getPage_07_4() {
		return page_07_4;
	}
	public void setPage_07_4(String page_07_4) {
		this.page_07_4 = page_07_4;
	}
	public String getPage_07_5() {
		return page_07_5;
	}
	public void setPage_07_5(String page_07_5) {
		this.page_07_5 = page_07_5;
	}
	public String getPage_07_6() {
		return page_07_6;
	}
	public void setPage_07_6(String page_07_6) {
		this.page_07_6 = page_07_6;
	}
	public String getPage_07_7() {
		return page_07_7;
	}
	public void setPage_07_7(String page_07_7) {
		this.page_07_7 = page_07_7;
	}
	public String getPage_07_8() {
		return page_07_8;
	}
	public void setPage_07_8(String page_07_8) {
		this.page_07_8 = page_07_8;
	}
	public String getPage_07_9() {
		return page_07_9;
	}
	public void setPage_07_9(String page_07_9) {
		this.page_07_9 = page_07_9;
	}
	public String getPage_07_10() {
		return page_07_10;
	}
	public void setPage_07_10(String page_07_10) {
		this.page_07_10 = page_07_10;
	}
	public String getPage_07_11() {
		return page_07_11;
	}
	public void setPage_07_11(String page_07_11) {
		this.page_07_11 = page_07_11;
	}

	public List<String> getValidationErrors() {
		List<String> errors = new ArrayList<String>();
		
		if(page_07_1 == null || page_07_1.length() == 0) {
			errors.add("Please fill row 1.");
		}
		
		if(page_07_2 == null || page_07_2.length() == 0) {
			errors.add("Please fill row 2.");
		}
		
		if(page_07_3 == null || page_07_3.length() == 0) {
			errors.add("Please fill row 3.");
		}
		
		if(page_07_3 == null || page_07_4.length() == 0) {
			errors.add("Please fill row 4.");
		}
		
		if(page_07_4 == null || page_07_5.length() == 0) {
			errors.add("Please fill row 5.");
		}
		
		if(page_07_5 == null || page_07_6.length() == 0) {
			errors.add("Please fill row 6.");
		}
		
		if(page_07_6 == null || page_07_7.length() == 0) {
			errors.add("Please fill row 7.");
		}
		
		if(page_07_7 == null || page_07_8.length() == 0) {
			errors.add("Please fill row 8.");
		}
		
		if(page_07_8 == null || page_07_9.length() == 0) {
			errors.add("Please fill row 9.");
		}
		
		if(page_07_9 == null || page_07_10.length() == 0) {
			errors.add("Please fill row 10.");
		}
		
		if(page_07_10 == null || page_07_11.length() == 0) {
			errors.add("Please fill row 11.");
		}
		
		if(page_07_11 == null || page_07_1.length() == 0) {
			errors.add("Please fill row 1.");
		}
		
		if (errors.size() > 0) {
			return errors;
		}
		return errors;
	}
}
