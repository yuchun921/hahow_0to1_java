package codegym;

public class TestDemo {

	public static void main(String[] args) {
		// while
		int i = 1;
		while (i<10) {
			System.out.printf("%-2d", i);
			i++;
		}
		
		System.out.println();
		
		// do-while
		int j = 11;
		do {
			System.out.printf("%-2d (���ޫ�˳��|���@��)", j);
			j++;
		} while(j<10);
	}

}
