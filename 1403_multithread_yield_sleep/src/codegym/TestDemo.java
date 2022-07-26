package codegym;

public class TestDemo {

	public static void main(String[] args) {
		/* Generated thread */
		System.out.println("main thread start");

		// new three threads
		Thread t1 = new Thread(new TestThread("t1"));
		Thread t2 = new Thread(new TestThread("t2"));
		Thread t3 = new Thread(new TestThread("t3"));

		
		t1.start();
		t2.start();
		t3.start();

		System.out.println("main thread end");
	}

}
