package formbean;

import java.util.ArrayList;
import java.util.List;

import org.mybeans.form.FormBean;


public class Page15Form extends FormBean{

	private String page_15_1_guessall;
	private String page_15_1_guessbad;
	private String page_15_2_guessall;
	private String page_15_2_guessbad;
	private String page_15_3_guessall;
	private String page_15_3_guessbad;
	private String page_15_4_guessall;
	private String page_15_4_guessbad;
	private String page_15_5_guessall;
	private String page_15_5_guessbad;
	private String page_15_6_guessall;
	private String page_15_6_guessbad;
	private String page_15_7_guessall;
	private String page_15_7_guessbad;
	private String page_15_8_guessall;
	private String page_15_8_guessbad;
	private String page_15_9_guessall;
	private String page_15_9_guessbad;
	private String text;

	
	
	public String getPage_15_1_guessall() {
		return page_15_1_guessall;
	}
	public void setPage_15_1_guessall(String page_15_1_guessall) {
		this.page_15_1_guessall = trimAndConvert(page_15_1_guessall, "<>\"&");
	}
	public String getPage_15_1_guessbad() {
		return page_15_1_guessbad;
	}
	public void setPage_15_1_guessbad(String page_15_1_guessbad) {
		this.page_15_1_guessbad = trimAndConvert(page_15_1_guessbad, "<>\"&");
	}
	public String getPage_15_2_guessall() {
		return page_15_2_guessall;
	}
	public void setPage_15_2_guessall(String page_15_2_guessall) {
		this.page_15_2_guessall = trimAndConvert(page_15_2_guessall, "<>\"&");
	}
	public String getPage_15_2_guessbad() {
		return page_15_2_guessbad;
	}
	public void setPage_15_2_guessbad(String page_15_2_guessbad) {
		this.page_15_2_guessbad = trimAndConvert(page_15_2_guessbad, "<>\"&");
	}
	public String getPage_15_3_guessall() {
		return page_15_3_guessall;
	}
	public void setPage_15_3_guessall(String page_15_3_guessall) {
		this.page_15_3_guessall = trimAndConvert(page_15_3_guessall, "<>\"&");
	}
	public String getPage_15_3_guessbad() {
		return page_15_3_guessbad;
	}
	public void setPage_15_3_guessbad(String page_15_3_guessbad) {
		this.page_15_3_guessbad = trimAndConvert(page_15_3_guessbad, "<>\"&");
	}
	public String getPage_15_4_guessall() {
		return page_15_4_guessall;
	}
	public void setPage_15_4_guessall(String page_15_4_guessall) {
		this.page_15_4_guessall = trimAndConvert(page_15_4_guessall, "<>\"&");
	}
	public String getPage_15_4_guessbad() {
		return page_15_4_guessbad;
	}
	public void setPage_15_4_guessbad(String page_15_4_guessbad) {
		this.page_15_4_guessbad = trimAndConvert(page_15_4_guessbad, "<>\"&");
	}
	public String getPage_15_5_guessall() {
		return page_15_5_guessall;
	}
	public void setPage_15_5_guessall(String page_15_5_guessall) {
		this.page_15_5_guessall = trimAndConvert(page_15_5_guessall, "<>\"&");
	}
	public String getPage_15_5_guessbad() {
		return page_15_5_guessbad;
	}
	public void setPage_15_5_guessbad(String page_15_5_guessbad) {
		this.page_15_5_guessbad = trimAndConvert(page_15_5_guessbad, "<>\"&");
	}
	public String getPage_15_6_guessall() {
		return page_15_6_guessall;
	}
	public void setPage_15_6_guessall(String page_15_6_guessall) {
		this.page_15_6_guessall = trimAndConvert(page_15_6_guessall, "<>\"&");
	}
	public String getPage_15_6_guessbad() {
		return page_15_6_guessbad;
	}
	public void setPage_15_6_guessbad(String page_15_6_guessbad) {
		this.page_15_6_guessbad = trimAndConvert(page_15_6_guessbad, "<>\"&");
	}
	public String getPage_15_7_guessall() {
		return page_15_7_guessall;
	}
	public void setPage_15_7_guessall(String page_15_7_guessall) {
		this.page_15_7_guessall = trimAndConvert(page_15_7_guessall, "<>\"&");
	}
	public String getPage_15_7_guessbad() {
		return page_15_7_guessbad;
	}
	public void setPage_15_7_guessbad(String page_15_7_guessbad) {
		this.page_15_7_guessbad = trimAndConvert(page_15_7_guessbad, "<>\"&");
	}
	public String getPage_15_8_guessall() {
		return page_15_8_guessall;
	}
	public void setPage_15_8_guessall(String page_15_8_guessall) {
		this.page_15_8_guessall = trimAndConvert(page_15_8_guessall, "<>\"&");
	}
	public String getPage_15_8_guessbad() {
		return page_15_8_guessbad;
	}
	public void setPage_15_8_guessbad(String page_15_8_guessbad) {
		this.page_15_8_guessbad = trimAndConvert(page_15_8_guessbad, "<>\"&");
	}
	public String getPage_15_9_guessall() {
		return page_15_9_guessall;
	}
	public void setPage_15_9_guessall(String page_15_9_guessall) {
		this.page_15_9_guessall = trimAndConvert(page_15_9_guessall, "<>\"&");
	}
	public String getPage_15_9_guessbad() {
		return page_15_9_guessbad;
	}
	public void setPage_15_9_guessbad(String page_15_9_guessbad) {
		this.page_15_9_guessbad = trimAndConvert(page_15_9_guessbad, "<>\"&");
	}
	
	
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public double getValueasDouble(String s) {
		try {
			Double valueasDouble = Double.parseDouble(s);
			return Math.round(valueasDouble * 100.0) / 100.0;
		} catch (NumberFormatException e) {
			return -1;
		}
	}
	
	public List<String> getValidationErrors() {
		List<String> errors = new ArrayList<String>();
		
		if(page_15_1_guessall.length() == 0 || page_15_1_guessall == null) {
			errors.add("Please input your answer.");
		}
		
		if(page_15_1_guessbad.length() == 0 || page_15_1_guessbad == null) {
			errors.add("Please input your answer.");
		}
		
		if(page_15_2_guessall.length() == 0 || page_15_2_guessall == null) {
			errors.add("Please input your answer.");
		}
		
		if(page_15_2_guessbad.length() == 0 || page_15_2_guessbad == null) {
			errors.add("Please input your answer.");
		}
		
		if(page_15_3_guessall.length() == 0 || page_15_3_guessall == null) {
			errors.add("Please input your answer.");
		}
		
		if(page_15_3_guessbad.length() == 0 || page_15_3_guessbad == null) {
			errors.add("Please input your answer.");
		}
		
		if(page_15_4_guessall.length() == 0 || page_15_4_guessall == null) {
			errors.add("Please input your answer.");
		}
		
		if(page_15_4_guessbad.length() == 0 || page_15_4_guessbad == null) {
			errors.add("Please input your answer.");
		}
		
		if(page_15_5_guessall.length() == 0 || page_15_5_guessall == null) {
			errors.add("Please input your answer.");
		}
		
		if(page_15_5_guessbad.length() == 0 || page_15_5_guessbad == null) {
			errors.add("Please input your answer.");
		}
		
		if(page_15_6_guessall.length() == 0 || page_15_6_guessall == null) {
			errors.add("Please input your answer.");
		}
		
		if(page_15_6_guessbad.length() == 0 || page_15_6_guessbad == null) {
			errors.add("Please input your answer.");
		}
		
		if(page_15_7_guessall.length() == 0 || page_15_7_guessall == null) {
			errors.add("Please input your answer.");
		}
		
		if(page_15_7_guessbad.length() == 0 || page_15_7_guessbad == null) {
			errors.add("Please input your answer.");
		}
		
		if(page_15_8_guessall.length() == 0 || page_15_8_guessall == null) {
			errors.add("Please input your answer.");
		}
		
		if(page_15_8_guessbad.length() == 0 || page_15_8_guessbad == null) {
			errors.add("Please input your answer.");
		}
		
		if(page_15_9_guessall.length() == 0 || page_15_9_guessall == null) {
			errors.add("Please input your answer.");
		}
		
		if(page_15_9_guessbad.length() == 0 || page_15_9_guessbad == null) {
			errors.add("Please input your answer.");
		}
		
		//check input rationality
		if ((page_15_1_guessall.length() != 0) & (page_15_1_guessbad.length() != 0) && (Double.parseDouble(page_15_1_guessall) < Double.parseDouble(page_15_1_guessbad))) {
			errors.add("Perish value should be no more than total value for (1) Meat, Poultry, Seafood");
		}
		if ((page_15_2_guessall.length() != 0) & (page_15_2_guessbad.length() != 0) && (Double.parseDouble(page_15_2_guessall) < Double.parseDouble(page_15_2_guessbad))) {
			errors.add("Perish value should be no more than total value for (2) Dairy");
		}
		if ((page_15_3_guessall.length() != 0) & (page_15_3_guessbad.length() != 0) && (Double.parseDouble(page_15_3_guessall) < Double.parseDouble(page_15_3_guessbad))) {
			errors.add("Perish value should be no more than total value for (3) Eggs");
		}
		if ((page_15_4_guessall.length() != 0) & (page_15_4_guessbad.length() != 0) && (Double.parseDouble(page_15_4_guessall) < Double.parseDouble(page_15_4_guessbad))) {
			errors.add("Perish value should be no more than total value for (4) Fruits");
		}
		if ((page_15_5_guessall.length() != 0) & (page_15_5_guessbad.length() != 0) && (Double.parseDouble(page_15_5_guessall) < Double.parseDouble(page_15_5_guessbad))) {
			errors.add("Perish value should be no more than total value for (5) Sauces");
		}
		if ((page_15_6_guessall.length() != 0) & (page_15_6_guessbad.length() != 0) && (Double.parseDouble(page_15_6_guessall) < Double.parseDouble(page_15_6_guessbad))) {
			errors.add("Perish value should be no more than total value for (6) Bread, Cakes, Cookies, Pasta");
		}
		if ((page_15_7_guessall.length() != 0) & (page_15_7_guessbad.length() != 0) && (Double.parseDouble(page_15_7_guessall) < Double.parseDouble(page_15_7_guessbad))) {
			errors.add("Perish value should be no more than total value for (7) Perishable Pies and Pastry");
		}
		if ((page_15_8_guessall.length() != 0) & (page_15_8_guessbad.length() != 0) && (Double.parseDouble(page_15_8_guessall) < Double.parseDouble(page_15_8_guessbad))) {
			errors.add("Perish value should be no more than total value for (8) Perishable Vegetables");
		}		
		if ((page_15_9_guessall.length() != 0) & (page_15_9_guessbad.length() != 0) && (Double.parseDouble(page_15_9_guessall) < Double.parseDouble(page_15_9_guessbad))) {
			errors.add("Perish value should be no more than total value for (9) Soft Cheese");
		}
		
		
		
		
		if(text.length() == 0 || text== null) {
			errors.add("Please input your answer.");
		}


		
		if(errors.size() > 0) {
			return errors;
		}
		
		return errors;
	}
	
}
