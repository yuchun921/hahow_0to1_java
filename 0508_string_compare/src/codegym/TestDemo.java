package codegym;

public class TestDemo {

	public static void main(String[] args) {
		// equals: �P�_�r��O�_�۵�
		// ���i�H�� == , �]���o�ˬO�P�_�o��Ӫ���reference�O�_�۵�

		String str1 = "abcd";
		String str2 = "efgh";
		String str3 = "abcd";

		System.out.println("str1 �M str2 �O�_�ۦP? " + str1.equals(str2));
		System.out.println("str1 �M str3 �O�_�ۦP? " + str1.equals(str3));

	}

}