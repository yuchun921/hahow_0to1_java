package codegym;

public class TestDemo {

	public static void main(String[] args) {
		// 下面方法都不是靜態物件, 因此要先new一個TestDemo物件後才可以使用
		TestDemo demo = new TestDemo();
		
		System.out.println("===== 父類別 =====");
		System.out.println("function add(i, j) --> add(4, 5) = " + demo.add(4, 5)); // 9
		System.out.println("function add(i, j, k) --> add(1, 2, 3) = " + demo.add(1, 2, 3));
		
		System.out.println("===== 子類別 =====");
		SubClass sub = new SubClass();
		System.out.println("function add(i, j) --> add(4, 5) = " + sub.add(4, 5)); // 900
	}

	public int add(int i, int j) {
		return i + j;
	}

	public int add(int i, int j, int k) {
		return i + j + k;
	}
	
	// hw: 同樣名稱的方法, 且回傳型態相同, 但傳入4個值.
	public int add(int i, int j, int k, int p) {
		return i + j + k + p;
	}
}
