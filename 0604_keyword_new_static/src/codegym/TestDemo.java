package codegym;

public class TestDemo {

	public static void main(String[] args) {
		// 屬性前若有 static, 其他類別可以直接使用裡面屬性或方法
		System.out.println(Class1.i); // print 123

		// Class1 中的 function1 因不是static, 就不可以直接使用
		// Class1.function1(); ===> Error

		// 要先new一個Class1的實體物件
		Class1 class1 = new Class1();
		class1.function1(); // print 456

	}

}
