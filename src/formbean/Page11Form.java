package formbean;

import java.util.ArrayList;
import java.util.List;

import org.mybeans.form.FormBean;

public class Page11Form extends FormBean{
	private String page_11_1;
	private String page_11_2;
	private String page_11_3;
	private String page_11_4;
	private String page_11_5;
	
	
	public String getPage_11_1() {
		return page_11_1;
	}


	public void setPage_11_1(String page_11_1) {
		this.page_11_1 = page_11_1;
	}


	public String getPage_11_2() {
		return page_11_2;
	}


	public void setPage_11_2(String page_11_2) {
		this.page_11_2 = page_11_2;
	}


	public String getPage_11_3() {
		return page_11_3;
	}


	public void setPage_11_3(String page_11_3) {
		this.page_11_3 = page_11_3;
	}


	public String getPage_11_4() {
		return page_11_4;
	}


	public void setPage_11_4(String page_11_4) {
		this.page_11_4 = page_11_4;
	}


	public String getPage_11_5() {
		return page_11_5;
	}


	public void setPage_11_5(String page_11_5) {
		this.page_11_5 = page_11_5;
	}


	public List<String> getValidationErrors() {
		List<String> errors = new ArrayList<String>();
		
		if (page_11_1 == null || page_11_1.length() == 0) {
			errors.add("Please fill question 1");
		}
		
		if (page_11_2 == null || page_11_2.length() == 0) {
			errors.add("Please fill question 2");
		}
		if (page_11_3 == null || page_11_3.length() == 0) {
			errors.add("Please fill question 3");
		}
		if (page_11_4 == null || page_11_4.length() == 0) {
			errors.add("Please fill question 4");
		}
		
		if (page_11_5 == null || page_11_5.length() == 0) {
			errors.add("Please fill question 5");
		}
		if (errors.size() > 0) {
			return errors;
		}
		return errors;
	}
	
}
