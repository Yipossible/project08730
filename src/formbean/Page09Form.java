package formbean;

import java.util.ArrayList;
import java.util.List;

import org.mybeans.form.FormBean;

public class Page09Form  extends FormBean{
	private String page_09_1;
	private String page_09_2;
	private String page_09_3;
	private String page_09_4;
	private String page_09_5;
	private String page_09_6;
	private String page_09_7;
	private String page_09_8;
	private String page_09_9;
	private String page_09_10;
	private String page_09_11;
	public String getPage_09_1() {
		return page_09_1;
	}
	public void setPage_09_1(String page_09_1) {
		this.page_09_1 = page_09_1;
	}
	public String getPage_09_2() {
		return page_09_2;
	}
	public void setPage_09_2(String page_09_2) {
		this.page_09_2 = page_09_2;
	}
	public String getPage_09_3() {
		return page_09_3;
	}
	public void setPage_09_3(String page_09_3) {
		this.page_09_3 = page_09_3;
	}
	public String getPage_09_4() {
		return page_09_4;
	}
	public void setPage_09_4(String page_09_4) {
		this.page_09_4 = page_09_4;
	}
	public String getPage_09_5() {
		return page_09_5;
	}
	public void setPage_09_5(String page_09_5) {
		this.page_09_5 = page_09_5;
	}
	public String getPage_09_6() {
		return page_09_6;
	}
	public void setPage_09_6(String page_09_6) {
		this.page_09_6 = page_09_6;
	}
	public String getPage_09_7() {
		return page_09_7;
	}
	public void setPage_09_7(String page_09_7) {
		this.page_09_7 = page_09_7;
	}
	public String getPage_09_8() {
		return page_09_8;
	}
	public void setPage_09_8(String page_09_8) {
		this.page_09_8 = page_09_8;
	}
	public String getPage_09_9() {
		return page_09_9;
	}
	public void setPage_09_9(String page_09_9) {
		this.page_09_9 = page_09_9;
	}
	public String getPage_09_10() {
		return page_09_10;
	}
	public void setPage_09_10(String page_09_10) {
		this.page_09_10 = page_09_10;
	}
	public String getPage_09_11() {
		return page_09_11;
	}
	public void setPage_09_11(String page_09_11) {
		this.page_09_11 = page_09_11;
	}

	public List<String> getValidationErrors() {
		List<String> errors = new ArrayList<String>();
		
		if(page_09_1 == null || page_09_1.length() == 0) {
			errors.add("Please fill row 1.");
		}
		
		if(page_09_2 == null || page_09_2.length() == 0) {
			errors.add("Please fill row 2.");
		}
		
		if(page_09_3 == null || page_09_3.length() == 0) {
			errors.add("Please fill row 3.");
		}
		
		if(page_09_3 == null || page_09_4.length() == 0) {
			errors.add("Please fill row 4.");
		}
		
		if(page_09_4 == null || page_09_5.length() == 0) {
			errors.add("Please fill row 5.");
		}
		
		if(page_09_5 == null || page_09_6.length() == 0) {
			errors.add("Please fill row 6.");
		}
		
		if(page_09_6 == null || page_09_7.length() == 0) {
			errors.add("Please fill row 7.");
		}
		
		if(page_09_7 == null || page_09_8.length() == 0) {
			errors.add("Please fill row 8.");
		}
		
		if(page_09_8 == null || page_09_9.length() == 0) {
			errors.add("Please fill row 9.");
		}
		
		if(page_09_9 == null || page_09_10.length() == 0) {
			errors.add("Please fill row 10.");
		}
		
		if(page_09_10 == null || page_09_11.length() == 0) {
			errors.add("Please fill row 11.");
		}
		
		if(page_09_11 == null || page_09_1.length() == 0) {
			errors.add("Please fill row 1.");
		}
		
		if (errors.size() > 0) {
			return errors;
		}
		return errors;
	}
}
