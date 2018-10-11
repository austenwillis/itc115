
public class Assignment3 {
	public static void main(String[] args) {
		printPowersOfN(8, 3);
		printPowersOfN(3, 5);
		

	}

	public static void printPowersOfN(int base, int exp) {
		for (int i = 0; i <= exp; i++) {
			double power = Math.pow(base, i);
			System.out.print((int) power + " ");

		}
		System.out.println();

	}
}
