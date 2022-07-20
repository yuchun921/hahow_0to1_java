package codegym;

public class TestRunnable implements Runnable {
	/* implements Runnable interface and run() method */
	private String name;

	public TestRunnable(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println(name + " Runnging.");
	}
}
