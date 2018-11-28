import java.util.Scanner;

public class ProductMain {
	public static void main(String[] args) {

		Product car = new Product("car", 20000, "F3R32GH", "A brand new car!");

		System.out.println(car.toString());

		Product table = new Product("table", 300.99, "76HHJH", "A large wooden table.");
		System.out.println();

		System.out.println(table.toString());

		Product computer = new Product("computer", 100.89, "37H90", "Super fast computer!");
		System.out.println();

		System.out.println(computer.toString());

		System.out.println();

		System.out.println("Product count: " + Product.count);
		System.out.println();

		Scanner console = new Scanner(System.in);

		System.out.println("Enter a new product!");
		System.out.println();

		System.out.print("Enter product name:");

		String enterName = console.nextLine();

		System.out.print("Enter " + enterName + " price:");

		double enterPrice = console.nextDouble();
		System.out.print("Enter " + enterName + " product code:");
		Scanner secondConsole = new Scanner(System.in);

		String enterCode = secondConsole.nextLine();

		System.out.print("Enter " + enterName + " description:");
		Scanner thirdConsole = new Scanner(System.in);

		String enterDescription = thirdConsole.nextLine();

		System.out.println();

		Product enteredProduct = new Product(enterName, enterPrice, enterCode, enterDescription);

		System.out.println(enteredProduct.toString());
		System.out.println();

		System.out.println("Updated product count: " + Product.count);

	}
}
