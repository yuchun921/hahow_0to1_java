package codegym;

public class HomeWork2 {

	public static void main(String[] args) {
		int[] array = { 3, 10, 18, 24 };
		System.out.println("For loop: " + forSum(array));
		System.out.println("Foreach loop: " + forEachSum(array));

		/*
		 * // use for loop to sum array
		 * int sum = 0;  
		 * for (int i = 0; i < array.length; i++) {
		 *     sum += array[i]; 
		 * } 
		 * System.out.println("For loop: " + sum);
		 * 
		 * // use foreach to sum array 
		 * int sum1 = 0; for (int i : array) { 
		 *     sum1 += i; 
		 * }
		 * System.out.println("Foreach loop: " + sum1);
		 */
	}

	// Try to write a method
	public static int forSum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	public static int forEachSum(int[] array) {
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		return sum;
	}

}
