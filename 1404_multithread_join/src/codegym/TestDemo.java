package codegym;

public class TestDemo {

	public static void main(String[] args) {
		/* Generated thread */
		System.out.println("main thread start");

		// new thread
		Thread t1 = new Thread(new TestThread("t1"));
		t1.start();

		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main thread end");
	}

}
