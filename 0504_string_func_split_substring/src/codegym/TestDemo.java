package codegym;

public class TestDemo {

	public static void main(String[] args) {
		String a = "test1, test2, test3";
		// split(String regex) �r��̷�","���}�s��}�C
		String[] a1 = a.split(",");
		System.out.println(a1[1]);
		// trim() �h���ť�
		System.out.println(a1[1].trim());
		// subsrting(int startIndex, [int endIndex]) �̷ӫ��w��m���^�l�r�� (���tendIndex)
		String b = "abcdefg";
		System.out.println(b.subSequence(0, 4));
		

	}

}