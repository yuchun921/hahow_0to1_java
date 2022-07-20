package codegym;

public class TestThread extends Thread{
	/* extends thread then overwrite run() method */
	
	private String name;
	
	// constructor
	public TestThread (String name) {
		this.name = name;
	}
	
	public void run() {
		System.out.println(name + " Runnging.");
	}
}
