package codegym;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class TestDemo {

	public static void main(String[] args) {

		System.out.println("==== List example ====");
		List<String> list = new ArrayList<String>();

		list.add("t1");
		list.add("t2");
		System.out.println(list);

		System.out.println("\n==== Set example ====");
		Set<String> set = new HashSet<String>();

		set.add("t1");
		set.add("t2");
		set.add("t2"); // Not add to set, because dupulicated
		System.out.println(set);

		System.out.println("\n==== Map example ====");
		Map<String, Integer> map = new HashMap<String, Integer>();

		// keyword "put" to add keys and values (String, Integer)
		map.put("Peggy", 27);
		map.put("Amy", 28);
		System.out.println(map);
	}

}
