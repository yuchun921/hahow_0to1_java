package codegym;

public class OuterClass {

	// 內部類別一樣可以使用修飾子, 設定屬性, 方法... => 與一般類別無異
	private class InnerClass {
		// attribute in innerClass
		private String name;

		// method in innerClass
		public void sayHello() {
			System.out.println("Hello " + name);
		}
	}

	// 該方法用來呼叫內部類別
	public void callInnerClass() {
		InnerClass inner = new InnerClass();
		inner.name = "Peggy";
		inner.sayHello();
	}

}
