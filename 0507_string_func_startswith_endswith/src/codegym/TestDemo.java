package codegym;

public class TestDemo {

	public static void main(String[] args) {
		String str = "abcd";
		// startWith: 檢查字串是否以某字元開頭
		System.out.println("str 以 a 開頭: " + str.startsWith("a"));
		System.out.println("str 以 b 開頭: " + str.startsWith("b"));
		// endsWith: 檢查字串是否以某字元結束
		System.out.println("str 以 b 結尾: " + str.endsWith("b"));
		System.out.println("str 以 d 結尾: " + str.endsWith("d"));
	}

}
