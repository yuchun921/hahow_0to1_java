package codegym;

import java.util.HashMap;
import java.util.Map;

public class TestDemo {

	public static void main(String[] args) {
		/* Map example */
		Map<String, Integer> map = new HashMap<String, Integer>();

		/* Add key, value to map */
		map.put("age", 27);
		map.put("height", 170);
		map.put("weight", 68);
		map.put("number", 3456);

		/* Get value from key in map */
		System.out.println("Age: " + map.get("age"));

		/* Use key to remove key, value pair */
		map.remove("number");

		/* Use keySet() to get value, and print it */
		System.out.println("\nEach value:");
		for (String key : map.keySet()) {
			System.out.println(map.get(key));
		}

	}

}
