import java.util.*;

public class Seasons {
	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		System.out.println("Find out the season!");

		System.out.print("Enter a Month 1-12: ");

		int month = console.nextInt();
		System.out.print("Enter a Date 1-31: ");
		int date = console.nextInt();
		result(month, date);
		console.close();
	}

	public static void result(int month, int date) {
		if ((month > 12) && (date > 31)) {
			System.out.println("Invalid Month and Date entry. Please Try Again.");
		} else if (month > 12) {
			System.out.println(textMonth(month) + ". Please Try Again.");
		} else if (date > 31) {
			System.out.println(textDate(date) + ". Please Try Again.");
		} else if (month == 2 && date > 28) {
			System.out.println(textMonth(month) + " only has 28 days. Please Enter a valid date.");
		} else if ((month == 4 && date > 30) || (month == 6 && date > 30) || (month == 9 && date > 30)
				|| (month == 11 && date > 30)) {
			System.out.println(textMonth(month) + " only has 30 days. Please Enter a valid date");
		} else {
			System.out.print(textMonth(month) + " " + textDate(date) + " is " + season(month, date) + ".");
		}
	}

	private static String textDate(int date) {
		String tDate = " ";
		String stDate = Integer.toString(date);
		if (date == 1 || date == 21 || date == 31) {
			tDate = stDate + "st";
		} else if (date == 2 || date == 22) {
			tDate = stDate + "nd";
		} else if (date == 3 || date == 23) {
			tDate = stDate + "rd";
		} else if (date < 1 || date > 31) {
			tDate = "Invalid Date";
		} else {
			tDate = stDate + "th";
		}
		return tDate;
	}

	private static String textMonth(int month) {
		String tMonth = " ";
		if (month == 1) {
			tMonth = "January";
		} else if (month == 2) {
			tMonth = "February";
		} else if (month == 3) {
			tMonth = "March";
		} else if (month == 4) {
			tMonth = "April";
		} else if (month == 5) {
			tMonth = "May";
		} else if (month == 6) {
			tMonth = "June";
		} else if (month == 7) {
			tMonth = "July";
		} else if (month == 8) {
			tMonth = "August";
		} else if (month == 9) {
			tMonth = "September";
		} else if (month == 10) {
			tMonth = "October";
		} else if (month == 11) {
			tMonth = "November";
		} else if (month == 12) {
			tMonth = "December";
		} else {
			tMonth = "Invalid Month";
		}
		return tMonth;

	}

	private static String season(int month, int date) {

		int zero = 0;
		String myZero = Integer.toString(zero);
		String myDate = Integer.toString(date);
		if (date < 10) {
			myDate = myZero + myDate;
		}

		String myMonth = Integer.toString(month);
		String myCombo = myMonth + myDate;
		int numberDate = Integer.parseInt(myCombo);
		String showSeason = null;

		if (numberDate >= 616 && numberDate <= 630 || numberDate >= 701 && numberDate <= 731
				|| numberDate >= 801 && numberDate <= 831 || numberDate >= 901 && numberDate <= 915) {
			showSeason = "Summer";
		} else if (numberDate >= 916 && numberDate <= 930 || numberDate >= 1001 && numberDate <= 1031
				|| numberDate >= 1101 && numberDate <= 1130 || numberDate >= 1201 && numberDate <= 1215) {
			showSeason = "Fall";
		} else if (numberDate >= 1216 && numberDate <= 1231 || numberDate >= 101 && numberDate <= 131
				|| numberDate >= 201 && numberDate <= 228 || numberDate >= 301 && numberDate <= 315) {
			showSeason = "Winter";
		} else if (numberDate >= 316 && numberDate <= 331 || numberDate >= 401 && numberDate <= 430
				|| numberDate >= 501 && numberDate <= 531 || numberDate >= 601 && numberDate <= 615) {
			showSeason = "Spring";
		} else {
			showSeason = "Invalid";
		}

		return showSeason;

	}

}
