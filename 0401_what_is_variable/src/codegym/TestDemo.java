package codegym;

public class TestDemo {

	public static String name = "Peggy"; // 因為此變數會在main方法中被使用, 而main方法已經是 public static, 所以被使用的也必須是 public static
	// public static int age2 = age; // 區域變數不可以拉到外面使用

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 27; // 區域變數只能在裡面使用

		System.out.println("My name is " + name + ", I'm " + age + " years old.");
	}

}
