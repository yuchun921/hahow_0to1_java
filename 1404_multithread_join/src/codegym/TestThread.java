package codegym;

public class TestThread implements Runnable {
	/* extends thread then overwrite run() method */

	private String name;

	// constructor
	public TestThread(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println(name + " Start.");
		System.out.println(name + " Runnging.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " End.");
	}
}
