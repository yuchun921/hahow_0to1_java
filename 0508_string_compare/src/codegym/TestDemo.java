package codegym;

public class TestDemo {

	public static void main(String[] args) {
		// equals: 判斷字串是否相等
		// 不可以用 == , 因為這樣是判斷這兩個物件的reference是否相等

		String str1 = "abcd";
		String str2 = "efgh";
		String str3 = "abcd";

		System.out.println("str1 和 str2 是否相同? " + str1.equals(str2));
		System.out.println("str1 和 str3 是否相同? " + str1.equals(str3));

	}

}
