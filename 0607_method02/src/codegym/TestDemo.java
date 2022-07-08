package codegym;

public class TestDemo {

	public static void main(String[] args) {
		// �U����k�����O�R�A����, �]���n��new�@��TestDemo�����~�i�H�ϥ�
		TestDemo demo = new TestDemo();
		
		System.out.println("===== �����O =====");
		System.out.println("function add(i, j) --> add(4, 5) = " + demo.add(4, 5)); // 9
		System.out.println("function add(i, j, k) --> add(1, 2, 3) = " + demo.add(1, 2, 3));
		
		System.out.println("===== �l���O =====");
		SubClass sub = new SubClass();
		System.out.println("function add(i, j) --> add(4, 5) = " + sub.add(4, 5)); // 900
	}

	public int add(int i, int j) {
		return i + j;
	}

	public int add(int i, int j, int k) {
		return i + j + k;
	}
	
	// hw: �P�˦W�٪���k, �B�^�ǫ��A�ۦP, ���ǤJ4�ӭ�.
	public int add(int i, int j, int k, int p) {
		return i + j + k + p;
	}
}
