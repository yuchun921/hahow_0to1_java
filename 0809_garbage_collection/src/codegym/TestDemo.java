package codegym;

public class TestDemo {
	public static void main(String[] args) {
		GC gc1 = new GC("f1");
		GC gc2 = new GC("f2");
		GC gc3 = new GC("f3");

		// 變數變成null時, 物件不再被使用
		gc1 = null;
		gc2 = null;
		gc3 = null;

		// 不會立刻執行, 等到JVM確認沒有其他物件或是方法在使用這些物件時, 才會執行
		System.gc();

		// try..catch to avoding throw exception
		try {
			// 讓thread在仍活著的情況下暫時休息
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
