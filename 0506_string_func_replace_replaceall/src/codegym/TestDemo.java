package codegym;

public class TestDemo {
	public static void main(String[] args) {
		// replace(CharSquence a, CharSquence b): �N�r�ꤤ��a������b
		String str = "abCD123ABcd246";
		System.out.println(str.replace("C", "0"));
		
		System.out.println();
		// replaceAll(String regex, String replacement)
		// �Y�Ĥ@�ӰѼƨëD�ϥΥ��W��ܪk, �h�Ӥ�k�Preplace�@��
		
		// Regular Expression (java.util.regex.Pattern)
		/*
		 * \d ==> 0~9
		 * [a-zA-Z] ==> �Ҧ��j�p�g�r��
		 */
		
		System.out.println(str.replaceAll("[a-zA-Z]", "8"));
	}
}
