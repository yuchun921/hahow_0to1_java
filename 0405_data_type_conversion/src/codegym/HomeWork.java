package codegym;

public class HomeWork {
	
	public static void main(String[] args) {
		/* Part1.
		 * 1. Setting a variable: double d = 3.14
		 * 2. turn double d to string
		 * 3. turn string to float
		*/
		
		// step1
		double d = 3.14;
		// step2
		String s = String.valueOf(d);
		// step3
		float f = Float.parseFloat(s);
		
		/* Part2.
		 * 1. turn float data type to Float class type
		 * 2. use Float object function get integer 3
		 * 3. print output
		 */
		
		// step1
		Float f1 = Float.valueOf(f);
		// step2
		int i = f1.intValue();
		// step3
		System.out.println(i);
	}
	
}
