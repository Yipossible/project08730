package formbean;

import java.util.ArrayList;
import java.util.List;

import org.mybeans.form.FormBean;

public class Page17Form extends FormBean{
	private String page_17_1;
	private String page_17_2;
	private String page_17_3;
	private String page_17_4;
	private String page_17_5;
	private String page_17_6;
	private String page_17_7;
	private String page_17_8;
	private String page_17_9;
	private String page_17_10;
	private String page_17_11;
	
	public String getPage_17_1() {
		return page_17_1;
	}
	public void setPage_17_1(String page_17_1) {
		this.page_17_1 = page_17_1;
	}
	public String getPage_17_2() {
		return page_17_2;
	}
	public void setPage_17_2(String page_17_2) {
		this.page_17_2 = page_17_2;
	}
	public String getPage_17_3() {
		return page_17_3;
	}
	public void setPage_17_3(String page_17_3) {
		this.page_17_3 = page_17_3;
	}
	public String getPage_17_4() {
		return page_17_4;
	}
	public void setPage_17_4(String page_17_4) {
		this.page_17_4 = page_17_4;
	}
	public String getPage_17_5() {
		return page_17_5;
	}
	public void setPage_17_5(String page_17_5) {
		this.page_17_5 = page_17_5;
	}
	public String getPage_17_6() {
		return page_17_6;
	}
	public void setPage_17_6(String page_17_6) {
		this.page_17_6 = page_17_6;
	}
	public String getPage_17_7() {
		return page_17_7;
	}
	public void setPage_17_7(String page_17_7) {
		this.page_17_7 = page_17_7;
	}
	public String getPage_17_8() {
		return page_17_8;
	}
	public void setPage_17_8(String page_17_8) {
		this.page_17_8 = page_17_8;
	}
	public String getPage_17_9() {
		return page_17_9;
	}
	public void setPage_17_9(String page_17_9) {
		this.page_17_9 = page_17_9;
	}
	public String getPage_17_10() {
		return page_17_10;
	}
	public void setPage_17_10(String page_17_10) {
		this.page_17_10 = page_17_10;
	}
	public String getPage_17_11() {
		return page_17_11;
	}
	public void setPage_17_11(String page_17_11) {
		this.page_17_11 = page_17_11;
	}

	public List<String> getValidationErrors() {
		List<String> errors = new ArrayList<String>();
		
		if(page_17_1 == null || page_17_1.length() == 0) {
			errors.add("Please fill row 1.");
		}
		
		if(page_17_2 == null || page_17_2.length() == 0) {
			errors.add("Please fill row 2.");
		}
		
		if(page_17_3 == null || page_17_3.length() == 0) {
			errors.add("Please fill row 3.");
		}
		
		if(page_17_3 == null || page_17_4.length() == 0) {
			errors.add("Please fill row 4.");
		}
		
		if(page_17_4 == null || page_17_5.length() == 0) {
			errors.add("Please fill row 5.");
		}
		
		if(page_17_5 == null || page_17_6.length() == 0) {
			errors.add("Please fill row 6.");
		}
		
		if(page_17_6 == null || page_17_7.length() == 0) {
			errors.add("Please fill row 7.");
		}
		
		if(page_17_7 == null || page_17_8.length() == 0) {
			errors.add("Please fill row 8.");
		}
		
		if(page_17_8 == null || page_17_9.length() == 0) {
			errors.add("Please fill row 9.");
		}
		
		if(page_17_9 == null || page_17_10.length() == 0) {
			errors.add("Please fill row 10.");
		}
		
		if(page_17_10 == null || page_17_11.length() == 0) {
			errors.add("Please fill row 11.");
		}
		
		if(page_17_11 == null || page_17_1.length() == 0) {
			errors.add("Please fill row 1.");
		}
		
		if (errors.size() > 0) {
			return errors;
		}
		return errors;
	}
}

