package codegym;

public class TestDemo {

	public static void main(String[] args) {
		int i = 3;

		// if...else
		if (i > 0) {
			System.out.println(i + " > 0");
		} else {
			System.out.println(i + " <= 0");
		}

		// if...else if... else
		int j = 0;
		if (j > 0) {
			System.out.println("j("+j+")" + " > 0");
		} else if (j < 0) {
			System.out.println("j("+j+")" + " < 0");
		} else {
			System.out.println("j("+j+")" + " = 0");
		}
	}
}
