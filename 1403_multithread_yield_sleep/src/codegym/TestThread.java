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

		if ("t1".equals(name)) {
			Thread.yield();
		}

		try {
			if ("t3".equals(name)) {
				Thread.sleep(3000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(name + " Runnging.");
		System.out.println(name + " End.");
	}
}
