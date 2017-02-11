package formbean;

import java.util.ArrayList;
import java.util.List;

import org.mybeans.form.FormBean;

public class Page19Form extends FormBean{
	private String page_19_1;
	private String page_19_2;
	private String page_19_3;
	private String page_19_4;
	private String page_19_5;
	private String page_19_6;
	private String page_19_7;
	private String page_19_8;
	private String page_19_9;
	private String page_19_10;
	private String page_19_11;
	
	public String getPage_19_1() {
		return page_19_1;
	}
	public void setPage_19_1(String page_19_1) {
		this.page_19_1 = page_19_1;
	}
	public String getPage_19_2() {
		return page_19_2;
	}
	public void setPage_19_2(String page_19_2) {
		this.page_19_2 = page_19_2;
	}
	public String getPage_19_3() {
		return page_19_3;
	}
	public void setPage_19_3(String page_19_3) {
		this.page_19_3 = page_19_3;
	}
	public String getPage_19_4() {
		return page_19_4;
	}
	public void setPage_19_4(String page_19_4) {
		this.page_19_4 = page_19_4;
	}
	public String getPage_19_5() {
		return page_19_5;
	}
	public void setPage_19_5(String page_19_5) {
		this.page_19_5 = page_19_5;
	}
	public String getPage_19_6() {
		return page_19_6;
	}
	public void setPage_19_6(String page_19_6) {
		this.page_19_6 = page_19_6;
	}
	public String getPage_19_7() {
		return page_19_7;
	}
	public void setPage_19_7(String page_19_7) {
		this.page_19_7 = page_19_7;
	}
	public String getPage_19_8() {
		return page_19_8;
	}
	public void setPage_19_8(String page_19_8) {
		this.page_19_8 = page_19_8;
	}
	public String getPage_19_9() {
		return page_19_9;
	}
	public void setPage_19_9(String page_19_9) {
		this.page_19_9 = page_19_9;
	}
	public String getPage_19_10() {
		return page_19_10;
	}
	public void setPage_19_10(String page_19_10) {
		this.page_19_10 = page_19_10;
	}
	public String getPage_19_11() {
		return page_19_11;
	}
	public void setPage_19_11(String page_19_11) {
		this.page_19_11 = page_19_11;
	}

	public List<String> getValidationErrors() {
		List<String> errors = new ArrayList<String>();
		
		if(page_19_1 == null || page_19_1.length() == 0) {
			errors.add("Please fill row 1.");
		}
		
		if(page_19_2 == null || page_19_2.length() == 0) {
			errors.add("Please fill row 2.");
		}
		
		if(page_19_3 == null || page_19_3.length() == 0) {
			errors.add("Please fill row 3.");
		}
		
		if(page_19_3 == null || page_19_4.length() == 0) {
			errors.add("Please fill row 4.");
		}
		
		if(page_19_4 == null || page_19_5.length() == 0) {
			errors.add("Please fill row 5.");
		}
		
		if(page_19_5 == null || page_19_6.length() == 0) {
			errors.add("Please fill row 6.");
		}
		
		if(page_19_6 == null || page_19_7.length() == 0) {
			errors.add("Please fill row 7.");
		}
		
		if(page_19_7 == null || page_19_8.length() == 0) {
			errors.add("Please fill row 8.");
		}
		
		if(page_19_8 == null || page_19_9.length() == 0) {
			errors.add("Please fill row 9.");
		}
		
		if(page_19_9 == null || page_19_10.length() == 0) {
			errors.add("Please fill row 10.");
		}
		
		if(page_19_10 == null || page_19_11.length() == 0) {
			errors.add("Please fill row 11.");
		}
		
		if(page_19_11 == null || page_19_1.length() == 0) {
			errors.add("Please fill row 1.");
		}
		
		if (errors.size() > 0) {
			return errors;
		}
		return errors;
	}
}

