package codegym;

public class SuperClass {
	public String name;

	// 在SuperClass被執行/物件載入的時候, 也跟著執行, 但無論如何只會"執行一次"
	static {
		System.out.println("Run static block once!");
	}

	public SuperClass() {
		this.name = "someone";
	}

	public SuperClass(String name) {
		this.name = name;
		System.out.println("Run constructor block every time");

	}
}
