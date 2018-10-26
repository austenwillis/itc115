import java.util.Random;

public class Assignment5 {

	public static void main(String[] args) {

		makeGuesses();

	}

	public static void makeGuesses() {
		Random randomNumber = new Random();
		int number = randomNumber.nextInt(50) + 1;
		int guesses = 1;
		while (number <= 48) {
			System.out.println("guess = " + number);
			number =  randomNumber.nextInt(50) + 1;
			guesses ++;
		}
		System.out.println("guess = " + number);
		System.out.println("total guesses: " + guesses);
	}
}
