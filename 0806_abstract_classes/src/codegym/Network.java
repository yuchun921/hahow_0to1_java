package codegym;

public abstract class Network {

	// 傳輸前要連線, 傳輸後要斷線
	// 所以此實作方法會使用下面兩個抽象方法
	// 但實際上transfer method並不在意它到底怎麼連接, 他只知道他要連線跟斷線就對了
	public void transfer(String fileName) {
		connect();
		System.out.println("Transfer: " + fileName);
		disconnect();
		
	}
	
	// 抽象方法, 不實作
	public abstract void connect();
	
	public abstract void disconnect();

}
