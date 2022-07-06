package codegym;

public class TestDemo {

	public static void main(String[] args) {
		String s = "aabbccdda";
		// indexOf(String str): 回傳第一個substing的index
		System.out.println(s.indexOf("b"));
		// lastIndexOf(String str): 回傳最後一個substing的index
		System.out.println(s.lastIndexOf("b"));
		// exercise: 取得String s 中的 bbcc
		System.out.println(s.substring(s.indexOf("b"), s.lastIndexOf("c") + 1));
		
		System.out.println();
		// contains(CharSequences s): 檢查是否包含某個字串, return boolean
		System.out.println(s.contains("c"));
		System.out.println(s.contains("f"));
	}

}
