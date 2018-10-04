
public class Fibonacci {

	public static void main(String[] args) {
		System.out.print("The First 12 Fibonacci Numbers: ");

		int number1 = 0;

		int number2 = 1;

		for (int i = 1; i <= 12; i++) {
			int addNum1Num2 = number1 + number2;
			number1 = number2;
			number2 = addNum1Num2;
			System.out.print(number1 + " ");

		}

	}

}
