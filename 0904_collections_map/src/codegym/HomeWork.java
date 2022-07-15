package codegym;

import java.util.HashSet;
import java.util.Set;

public class HomeWork {

	public static void main(String[] args) {
		/* Set example */

		Set<Integer> set = new HashSet<Integer>();

		/* Add elements to set */
		set.add(1);
		set.add(12);
		set.add(123);
		set.add(1234);
		set.add(12345);

		/* Remove elements: remove(index) */
		set.remove(12);

		/* size (set length) */
		System.out.println("set size is: " + set.size());

		/* Print each elements */
		System.out.println("\nPrint each element in set:");
		for (Integer i : set) {
			System.out.println(i);
		}

	}

}
