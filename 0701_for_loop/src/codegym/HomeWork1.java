package codegym;

public class HomeWork1 {
	public static void main(String[] args) {
		// first line
		System.out.print("     ");
		for (int i = 0; i <= 12; i++) {
			System.out.printf("%-5d", i);
		}

		System.out.println();
		for (int i = 0; i <= 12; i++) {
			System.out.printf("%-5d", i);
			for (int j = 0; j <= 12; j++) {
				System.out.printf("%-5d", i * j);
			}
			System.out.println();
		}
	}
}
