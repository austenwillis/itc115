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
	
	
	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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

