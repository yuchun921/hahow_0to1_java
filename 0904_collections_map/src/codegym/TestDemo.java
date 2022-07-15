package codegym;

import java.util.HashSet;
import java.util.Set;

public class TestDemo {

	public static void main(String[] args) {
		/* Set example */

		Set<String> set = new HashSet<String>();

		/* Add elements to set */
		set.add("test1");
		set.add("test2");
		set.add("test3");
		set.add("test4");
		set.add("test5");

		/* Remove elements: remove(index) */
		set.remove("test3");
		
		/* size (set length) */
		System.out.println("set size is: "+set.size());

		/* Print each elements */
		System.out.println("\nPrint each element in set:");
		for (String s: set) {
			System.out.println(s);
		}

	}

}
