package codegym;

public class TestDemo {

	static int i = 123;
	static final int j = 123;
	
	public static void main(String[] args) {
		/*
		 * final:
		 * - class:    �]��final class�����O����A�Q�~��
		 * 		EX: ��b public final class TestDemo, �x�s��, subclass�|����
		 * - function: ����A�Q�мg
		 * 		EX: ��b public final void testFunction(), �x�s��, subclass�|����
		 * - variable: ��l�ƫᤣ��ק�
		 * 		EX: main ��k�~ static int i = 123, �bmain��, �N�L�k�ק�i����
		 */
		
		i = 456;
		// j = 444; �]static final int j, so can't change it's value
	}
	
	public void testFunction() {
		
	}
}
