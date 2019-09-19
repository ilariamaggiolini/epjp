package ex;

public class S55 {
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */
	public static long sum(int first, int last) {
		if (last < first) {
			return 0;
		} else {
			int sum = 0;
			for (int i = first; i <= last; i++) {
				sum += i;
			}
			return sum;
		}
	}

	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {
		int cur = first;
		if (cur % 2 != 0) {
			cur += 1;
		}

		int sum = 0;
		for (; cur <= last; cur += 2) {
			sum += cur;
		}
		return sum;
	}

	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {
		int i;
		int f = 1;
		for (i = 1; i <= value; i = i + 1) {
			f = f * i;
		}
		return f;
	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, …)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) {
		// TODO
		return 0;
	}

	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {
		int[][] result = new int[0][0];

		// TODO

		return result;
	}
}
