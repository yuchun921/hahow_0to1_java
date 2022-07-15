package codegym;

import java.util.List;
import java.util.ArrayList;

public class TestDemo {

	public static void main(String[] args) {
		String s1 = "test1";
		String s2 = "test2";
		String s3 = "test3";
		String s4 = "test4";
		String s5 = "test5";
		
		/* Build List object */
 		List<String> list = new ArrayList<String>();

		/* Put elements to List */
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		/* Get elements: get(index) */
		list.get(1);

		/* Remove elements: remove(elements) */
		list.remove("test4");

		/* print each elements: for each */
		// way1
		for (String s : list) {
			System.out.println(s);
		}
		// way2
		// list.forEach((n) -> System.out.println(n));

	}

}
