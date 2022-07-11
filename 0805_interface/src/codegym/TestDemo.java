package codegym;

public class TestDemo {

	public static void main(String[] args) {
		File f = new Multimedia(); // File interface的資料型別, Multimedia的實體物件
		// 使用interface File 裡面的 getFileName method, 但是實際會使用new出的Miltimedia物件中實作的getFileName method
		System.out.println(f.getFileName());
	}
	
	
	// 這個方法只在乎整合傳送流程, 實際上它不在意檔案是什麼, 或是網路是怎麼傳的
	public void deliveryProcess(File f, Network net) {
		// connect
		net.connect();
		
		// delivery
		net.transfer(f.getFileName());
		
		// diconnect
		net.disconnect();
		
		/*
		 * 這個方法(流程)完全不管其方法實作內容, 只在意流程正確
		 */
	}
}
