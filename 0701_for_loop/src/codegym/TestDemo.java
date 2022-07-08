package codegym;

public class TestDemo {

	public static void main(String[] args) {
		// for loop: 9*9
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}
		
		// for each
		System.out.println("=== For each example ===");
		int[] array = {2, 4, 6, 8};
		for(int i : array) {
			System.out.println(i*10);
		}
	}
}
