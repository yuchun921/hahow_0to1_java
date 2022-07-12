package codegym;

public class GC {
	private String name;
	
	// constructor: 物件被new的時候就會使用這個方法
	public GC(String name) {
		this.name = name;
		System.out.println(this.name + ": Start");
	}
	
	// method: 所有物件最後會執行的方法
	protected void finalize() {
		System.out.println(this.name + ": End");
	}

}
