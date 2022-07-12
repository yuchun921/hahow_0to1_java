package codegym;

public class TestDemo {
	public static void main(String[] args) {
		Network net = new FTP(); // 多型: Network 資料型態, new FPT 物件
		net.transfer("photo");
	}
}
