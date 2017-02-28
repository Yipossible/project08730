package formbean;

import java.util.ArrayList;
import java.util.List;

import org.mybeans.form.FormBean;

public class Page07Form  extends FormBean{
	private String price;
	
	public String getPrice() {
		return price;
	}
	
    public void setPrice(String price) {
        this.price = price;
    }

    public List<String> getValidationErrors() {
		List<String> errors = new ArrayList<String>();
		
		if(price == null || price.length() == 0) {
			errors.add("Please select price.");
		}
		
		if (errors.size() > 0) {
			return errors;
		}
		return errors;
	}
}
