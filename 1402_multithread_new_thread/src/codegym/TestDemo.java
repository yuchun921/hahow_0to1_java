package codegym;

public class TestDemo {

	public static void main(String[] args) {
		/* Generated thread */
		System.out.println("main thread start");
		TestThread thread1 = new TestThread("thread1");
		TestThread thread2 = new TestThread("thread2");
		TestThread thread3 = new TestThread("thread3");
		TestThread thread4 = new TestThread("thread4");
		TestThread thread5 = new TestThread("thread5");

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();

		Thread threadRun1 = new Thread(new TestRunnable("threadRun1"));
		Thread threadRun2 = new Thread(new TestRunnable("threadRun2"));
		Thread threadRun3 = new Thread(new TestRunnable("threadRun3"));
		Thread threadRun4 = new Thread(new TestRunnable("threadRun4"));
		Thread threadRun5 = new Thread(new TestRunnable("threadRun5"));

		threadRun1.start();
		threadRun2.start();
		threadRun3.start();
		threadRun4.start();
		threadRun5.start();
		
		System.out.println("main thread end");
	}

}
