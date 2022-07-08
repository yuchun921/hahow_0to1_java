package codegym;

public class TestDemo {

	public static void main(String[] args) {
		/* 字元陣列 */
		char[] c = {'a', 'b', 'c'};
		String str = String.valueOf(c);
		
		System.out.println(c);
		System.out.println(str);
		
		/* charAt(int index) 指定字串中的位元 */
		System.out.println(str.charAt(1));
	}

}
