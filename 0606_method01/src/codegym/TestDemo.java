package codegym;

public class TestDemo {

	public static void main(String[] args) {
		TestDemo demo = new TestDemo();
		String hello = demo.sayHello("Peggy");

		System.out.println(hello);

	}

	public String sayHello(String name) {

		String resp = "Hello " + name + "!";
		return resp;

	}

}
