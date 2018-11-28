import java.util.*;
import java.text.*;

public class Product {
	private double price;
	private String code;
	private String description;
	private String name;
	public static int count;

	public Product(String productName, double productPrice, String productCode,
			String productDescript) {

		price = productPrice;
		code = productCode;
		description = productDescript;
		name = productName;
		count++;

	}
	public String getDescription(){
		return this.description;
		}
	
	public void changeDescription(String newDescription) {
		this.description = newDescription;
	
	}
	public String getPriceFormatted() {
		String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
		return formattedPrice;
	}

	public String toString() {
		return name + "\nThe price is: " + getPriceFormatted() + "\nProduct Code: " + code + "\nProduct Description: "
				+ description;
	}
	}
