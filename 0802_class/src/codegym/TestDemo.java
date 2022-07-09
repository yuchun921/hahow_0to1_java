package codegym;

public class TestDemo {

	public static void main(String[] args) {
		
		/**
		 *	        SuperClass super1 = new SuperClass();
		 *	             |        |      |             |_________________ 
		 *   	     ____|        |      |__________________             | (without args/params)
		 *	        |             |                         |            |
		 *	A "type SuperClass" object(or say instance) is newed by a "default constructor"
         */
		
		// 因目前在SuperClass中定義了一個建構子, 須傳入String參數, 且沒有其他建構子是不需要傳入參數的, 
		// 所以在new SuperClass物件時, 必要傳入參數
		SuperClass s = new SuperClass("Peggy"); // 只有第一次會執行static區塊
		System.out.println(s.name);
		
		SuperClass s1 = new SuperClass("P"); // 不會執行static區塊
		System.out.println(s1.name);
		SuperClass s2 = new SuperClass("Pipi"); // 不會執行static區塊
		System.out.println(s2.name);

		System.out.println("\n=== subclass ===");
		SubClass sub = new SubClass();
		System.out.println(sub.nickName);
	}

}
