import java.util.Arrays;

public class Assignment6 {
	public static void main(String[] args) {
		
		double[] numbers = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };
		double[] numbers2 = { 10.1, 8.4, 6.7, .3, 42 };

		boolean results1 = isSorted(numbers);

		System.out.println(results1);

		boolean results2 = isSorted(numbers2);

		System.out.println(results2);

	}

	public static boolean isSorted(double[] list) {
		String listUnsorted = Arrays.toString(list);
		double[] list1 = list;
		Arrays.sort(list1);
		String listSorted = Arrays.toString(list1);
		boolean result = false;

		if (listUnsorted.equals(listSorted)) {
			result = true;
		} else {
			result = false;
		}
		return result;

	}

}