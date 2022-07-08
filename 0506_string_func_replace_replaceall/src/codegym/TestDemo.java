package codegym;

public class TestDemo {
	public static void main(String[] args) {
		// replace(CharSquence a, CharSquence b): 將字串中的a替換成b
		String str = "abCD123ABcd246";
		System.out.println(str.replace("C", "0"));
		
		System.out.println();
		// replaceAll(String regex, String replacement)
		// 若第一個參數並非使用正規表示法, 則該方法與replace一樣
		
		// Regular Expression (java.util.regex.Pattern)
		/*
		 * \d ==> 0~9
		 * [a-zA-Z] ==> 所有大小寫字母
		 */
		
		System.out.println(str.replaceAll("[a-zA-Z]", "8"));
	}
}
