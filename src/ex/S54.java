package ex;

public class S54 {
	/**
	 * Check if the parameter is positive, negative, or zero
	 * 
	 * @param value an integer
	 * @return "positive", "negative", or "zero";
	 */
	public static String checkSign(int value) {
		if (value == 0) {
			return "zero";
		} else if (value > 0) {
			return "positive";
		} else {
			return "negative";
		}
	}

	/**
	 * Check if the parameter is odd
	 * 
	 * @param value an integer
	 * @return "odd" or "even"
	 */
	public static boolean isOdd(int value) {
		if (value % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Convert the parameter to its English name, if it is in [0..9]
	 * 
	 * @param value an integer
	 * @return "zero" for 0 ... "nine" for 9, or "other"
	 */
	public static String asWord(int value) {
		if (value == 0) {
			return "zero";
		} else if (value == 1) {
			return "one";
		} else if (value == 2) {
			return "two";
		} else if (value == 3) {
			return "three";
		} else if (value == 4) {
			return "four";
		} else if (value == 5) {
			return "five";
		} else if (value == 6) {
			return "six";
		} else if (value == 7) {
			return "seven";
		} else if (value == 8) {
			return "eight";
		} else if (value == 9) {
			return "nine";
		} else {
			return "other";
		}
	}

	/**
	 * Convert a value in the interval [0, 100] to a letter in [A, F]
	 * 
	 * A if value > 90 B if value in (80, 90] ... F if value <= 50
	 * 
	 * @param percentile in [0, 100]
	 * @return a letter in [A, F]
	 */
	public static char vote(double percentile) {
		if (percentile <= 50) {
			return 'F';
		} else if (percentile <= 60) {
			return 'E';
		} else if (percentile <= 70) {
			return 'D';
		} else if (percentile <= 80) {
			return 'C';
		} else if (percentile <= 90) {
			return 'B';
		} else {
			return 'A';
		}
	}

//
//	/**
//	 * Leap year checker
//	 * 
//	 * @param year
//	 * @return true if leap year
//	 */
	public static boolean isLeapYear(int year) {
		if (year % 100 == 0 && year % 400 != 0) {
			return false;
		} else if (year % 4 == 0) {
			return true;
		}
		return false;
	}

//
//	/**
//	 * Sort the input parameters
//	 * 
//	 * @param a
//	 * @param b
//	 * @param c
//	 * @return a sorted array
//	 */
	public static int[] sort(int a, int b, int c) {
		int[] result = new int[3];

		// TODO

		return result;
	}
}
