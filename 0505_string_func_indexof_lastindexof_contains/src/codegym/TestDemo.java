package codegym;

public class TestDemo {

	public static void main(String[] args) {
		String s = "aabbccdda";
		// indexOf(String str): �^�ǲĤ@��substing��index
		System.out.println(s.indexOf("b"));
		// lastIndexOf(String str): �^�ǳ̫�@��substing��index
		System.out.println(s.lastIndexOf("b"));
		// exercise: ���oString s ���� bbcc
		System.out.println(s.substring(s.indexOf("b"), s.lastIndexOf("c") + 1));
		
		System.out.println();
		// contains(CharSequences s): �ˬd�O�_�]�t�Y�Ӧr��, return boolean
		System.out.println(s.contains("c"));
		System.out.println(s.contains("f"));
	}

}
