package formbean;

import java.util.ArrayList;
import java.util.List;

import org.mybeans.form.FormBean;

public class Page16Form extends FormBean{
	private String page_16_1;
	private String page_16_2;
	private String page_16_3;
	private String page_16_4;
	private String page_16_5;
	private String page_16_6;
	private String page_16_7;
	private String page_16_8;
	private String page_16_9;
	private String page_16_10;
	private String page_16_11;
	
	public String getPage_16_1() {
		return page_16_1;
	}
	public void setPage_16_1(String page_16_1) {
		this.page_16_1 = page_16_1;
	}
	public String getPage_16_2() {
		return page_16_2;
	}
	public void setPage_16_2(String page_16_2) {
		this.page_16_2 = page_16_2;
	}
	public String getPage_16_3() {
		return page_16_3;
	}
	public void setPage_16_3(String page_16_3) {
		this.page_16_3 = page_16_3;
	}
	public String getPage_16_4() {
		return page_16_4;
	}
	public void setPage_16_4(String page_16_4) {
		this.page_16_4 = page_16_4;
	}
	public String getPage_16_5() {
		return page_16_5;
	}
	public void setPage_16_5(String page_16_5) {
		this.page_16_5 = page_16_5;
	}
	public String getPage_16_6() {
		return page_16_6;
	}
	public void setPage_16_6(String page_16_6) {
		this.page_16_6 = page_16_6;
	}
	public String getPage_16_7() {
		return page_16_7;
	}
	public void setPage_16_7(String page_16_7) {
		this.page_16_7 = page_16_7;
	}
	public String getPage_16_8() {
		return page_16_8;
	}
	public void setPage_16_8(String page_16_8) {
		this.page_16_8 = page_16_8;
	}
	public String getPage_16_9() {
		return page_16_9;
	}
	public void setPage_16_9(String page_16_9) {
		this.page_16_9 = page_16_9;
	}
	public String getPage_16_10() {
		return page_16_10;
	}
	public void setPage_16_10(String page_16_10) {
		this.page_16_10 = page_16_10;
	}
	public String getPage_16_11() {
		return page_16_11;
	}
	public void setPage_16_11(String page_16_11) {
		this.page_16_11 = page_16_11;
	}

	public List<String> getValidationErrors() {
		List<String> errors = new ArrayList<String>();
		
		if(page_16_1 == null || page_16_1.length() == 0) {
			errors.add("Please fill row 1.");
		}
		
		if(page_16_2 == null || page_16_2.length() == 0) {
			errors.add("Please fill row 2.");
		}
		
		if(page_16_3 == null || page_16_3.length() == 0) {
			errors.add("Please fill row 3.");
		}
		
		if(page_16_3 == null || page_16_4.length() == 0) {
			errors.add("Please fill row 4.");
		}
		
		if(page_16_4 == null || page_16_5.length() == 0) {
			errors.add("Please fill row 5.");
		}
		
		if(page_16_5 == null || page_16_6.length() == 0) {
			errors.add("Please fill row 6.");
		}
		
		if(page_16_6 == null || page_16_7.length() == 0) {
			errors.add("Please fill row 7.");
		}
		
		if(page_16_7 == null || page_16_8.length() == 0) {
			errors.add("Please fill row 8.");
		}
		
		if(page_16_8 == null || page_16_9.length() == 0) {
			errors.add("Please fill row 9.");
		}
		
		if(page_16_9 == null || page_16_10.length() == 0) {
			errors.add("Please fill row 10.");
		}
		
		if(page_16_10 == null || page_16_11.length() == 0) {
			errors.add("Please fill row 11.");
		}
		
		if(page_16_11 == null || page_16_1.length() == 0) {
			errors.add("Please fill row 1.");
		}
		
		if (errors.size() > 0) {
			return errors;
		}
		return errors;
	}
}

