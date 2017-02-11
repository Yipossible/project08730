package formbean;

import java.util.ArrayList;
import java.util.List;

import org.mybeans.form.FormBean;

public class Page18Form extends FormBean {
	private String button;

	public String getButton() {
		return button;
	}

	public void setButton(String button) {
		this.button = button;
	}
	
	public List<String> getValidationErrors() {
		List<String> errors = new ArrayList<String>();
		
		if(button.length() == 0 || button == null) {
			errors.add("Invalid button");
		}
		
		return errors;
	}
	
}
