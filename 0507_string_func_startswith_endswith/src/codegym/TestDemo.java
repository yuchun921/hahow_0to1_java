package codegym;

public class TestDemo {

	public static void main(String[] args) {
		String str = "abcd";
		// startWith: �ˬd�r��O�_�H�Y�r���}�Y
		System.out.println("str �H a �}�Y: " + str.startsWith("a"));
		System.out.println("str �H b �}�Y: " + str.startsWith("b"));
		// endsWith: �ˬd�r��O�_�H�Y�r������
		System.out.println("str �H b ����: " + str.endsWith("b"));
		System.out.println("str �H d ����: " + str.endsWith("d"));
	}

}
