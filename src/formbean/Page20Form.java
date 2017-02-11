package formbean;

import java.util.ArrayList;
import java.util.List;

import org.mybeans.form.FormBean;

public class Page20Form extends FormBean{
	private String page_20_1;
	private String page_20_2;
	private String page_20_3;
	private String page_20_4;
	private String page_20_5;
	private String page_20_6;
	private String page_20_7;
	private String page_20_8;
	private String page_20_9;
	private String page_20_10;
	private String page_20_11;
	
	public String getPage_20_1() {
		return page_20_1;
	}
	public void setPage_20_1(String page_20_1) {
		this.page_20_1 = page_20_1;
	}
	public String getPage_20_2() {
		return page_20_2;
	}
	public void setPage_20_2(String page_20_2) {
		this.page_20_2 = page_20_2;
	}
	public String getPage_20_3() {
		return page_20_3;
	}
	public void setPage_20_3(String page_20_3) {
		this.page_20_3 = page_20_3;
	}
	public String getPage_20_4() {
		return page_20_4;
	}
	public void setPage_20_4(String page_20_4) {
		this.page_20_4 = page_20_4;
	}
	public String getPage_20_5() {
		return page_20_5;
	}
	public void setPage_20_5(String page_20_5) {
		this.page_20_5 = page_20_5;
	}
	public String getPage_20_6() {
		return page_20_6;
	}
	public void setPage_20_6(String page_20_6) {
		this.page_20_6 = page_20_6;
	}
	public String getPage_20_7() {
		return page_20_7;
	}
	public void setPage_20_7(String page_20_7) {
		this.page_20_7 = page_20_7;
	}
	public String getPage_20_8() {
		return page_20_8;
	}
	public void setPage_20_8(String page_20_8) {
		this.page_20_8 = page_20_8;
	}
	public String getPage_20_9() {
		return page_20_9;
	}
	public void setPage_20_9(String page_20_9) {
		this.page_20_9 = page_20_9;
	}
	public String getPage_20_10() {
		return page_20_10;
	}
	public void setPage_20_10(String page_20_10) {
		this.page_20_10 = page_20_10;
	}
	public String getPage_20_11() {
		return page_20_11;
	}
	public void setPage_20_11(String page_20_11) {
		this.page_20_11 = page_20_11;
	}

	public List<String> getValidationErrors() {
		List<String> errors = new ArrayList<String>();
		
		if(page_20_1 == null || page_20_1.length() == 0) {
			errors.add("Please fill row 1.");
		}
		
		if(page_20_2 == null || page_20_2.length() == 0) {
			errors.add("Please fill row 2.");
		}
		
		if(page_20_3 == null || page_20_3.length() == 0) {
			errors.add("Please fill row 3.");
		}
		
		if(page_20_3 == null || page_20_4.length() == 0) {
			errors.add("Please fill row 4.");
		}
		
		if(page_20_4 == null || page_20_5.length() == 0) {
			errors.add("Please fill row 5.");
		}
		
		if(page_20_5 == null || page_20_6.length() == 0) {
			errors.add("Please fill row 6.");
		}
		
		if(page_20_6 == null || page_20_7.length() == 0) {
			errors.add("Please fill row 7.");
		}
		
		if(page_20_7 == null || page_20_8.length() == 0) {
			errors.add("Please fill row 8.");
		}
		
		if(page_20_8 == null || page_20_9.length() == 0) {
			errors.add("Please fill row 9.");
		}
		
		if(page_20_9 == null || page_20_10.length() == 0) {
			errors.add("Please fill row 10.");
		}
		
		if(page_20_10 == null || page_20_11.length() == 0) {
			errors.add("Please fill row 11.");
		}
		
		if(page_20_11 == null || page_20_1.length() == 0) {
			errors.add("Please fill row 1.");
		}
		
		if (errors.size() > 0) {
			return errors;
		}
		return errors;
	}
}

