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
//	public static String asWord(int value) {
//		if (value == 0) {
//		return "zero";
//		} else if (value = 1) {
//			
//		}
//		return "one";
//		}

	/**
	 * Convert a value in the interval [0, 100] to a letter in [A, F]
	 * 
	 * A if value > 90 B if value in (80, 90] ... F if value <= 50
	 * 
	 * @param percentile in [0, 100]
	 * @return a letter in [A, F]
	 */
	public static char vote(double percentile) {
		if (value < 50) {
		return "F";
	} else if (value >= 50 && value < 60) {
		return "E"
	}

	/**
	 * Leap year checker
	 * 
	 * @param year
	 * @return true if leap year
	 */
//	public static boolean isLeapYear(int year) {
//		if (year%100 == 0 && year%400 != 0) {
//			return false;
//		}
//		
//			;
//
//		return false;
//	}
//
//	}else{if(year%4==0);return true;}

	/**
	 * Sort the input parameters
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return a sorted array
	 */
	public static int[] sort(int a, int b, int c) {
		int[] result = new int[3];

		// TODO

		return result;
	}
}
