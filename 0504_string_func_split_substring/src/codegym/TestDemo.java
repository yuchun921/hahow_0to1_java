package codegym;

public class TestDemo {

	public static void main(String[] args) {
		String a = "test1, test2, test3";
		// split(String regex) 字串依照","分開存到陣列
		String[] a1 = a.split(",");
		System.out.println(a1[1]);
		// trim() 去除空白
		System.out.println(a1[1].trim());
		// subsrting(int startIndex, [int endIndex]) 依照指定位置取回子字串 (不含endIndex)
		String b = "abcdefg";
		System.out.println(b.subSequence(0, 4));
		

	}

}
