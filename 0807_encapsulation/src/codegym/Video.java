package codegym;

public class Video {

	private String fileName; // private 外部的物件都不能使用這個屬性
	
	// 封裝: 把某些東西封裝在自己物件內, 只開一些特定介面讓外界可以間接使用到封裝起來的東西
	// 若要使用上面private的物件, 所以要開一個public或開啟它修飾子的方法, 讓外部可以使用
	
	// 供外部設置fileName
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	// 拿到fileName
	public String getFileName() {
		return this.fileName;
	}
	
	/* [eclipse tips] quick generate get() and set()
	 * 	right click > sourct > generate Getters and Setters
	 */
	
	

}
