package codegym;

public class TestDemo {

	public static void main(String[] args) {
		// �ݩʫe�Y�� static, ��L���O�i�H�����ϥθ̭��ݩʩΤ�k
		System.out.println(Class1.i); // print 123

		// Class1 ���� function1 �]���Ostatic, �N���i�H�����ϥ�
		// Class1.function1(); ===> Error

		// �n��new�@��Class1�����骫��
		Class1 class1 = new Class1();
		class1.function1(); // print 456

	}

}
