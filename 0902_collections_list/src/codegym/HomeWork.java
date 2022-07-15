package codegym;

import java.util.ArrayList;
import java.util.List;

public class HomeWork {

	public static void main(String[] args) {
		/* List exercise: change data types */
		Integer i1 = 11;
		Integer i2 = 22;
		Integer i3 = 33;
		Integer i4 = 44;

		List<Integer> list = new ArrayList<Integer>();

		/* Add elements to list */
		list.add(i1);
		list.add(i2);
		list.add(i3);
		list.add(i4);

		/* Remove elements: remove(index) */
		list.remove(2); // remove 33

		/* Print each elements */
		for (Integer i : list) {
			System.out.println(i);
		}
		
		list.forEach((i) -> System.out.println(i));

	}

}
