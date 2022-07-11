package codegym;

public class TestDemo {

	/*
	 * 父類別: multimedia
	 * 子類別: video
	 */
	public static void main(String[] args) {
		// 多形
		Multimedia media = new Video(); // 父類別資料型態, 子類別的實體
		media.play(); // 這邊因為是子類別的實體, 所以會call子類別的方法 => "Play Video"

		// 向上轉型
		Video media1 = new Video();
		Multimedia m1 = media1; // 向上轉型給父類別
		m1.play(); // 雖然轉給父類別, 但一樣是使用子類別的物件, 因此仍是子類別的方法 => "Play Video"
		
		// 向下轉型
		Multimedia media2 = new Video(); // 父類別資料型態, 子類別的實體
		Video v1 = (Video)media2; // 原本是父類別資料型態, 這邊轉為子類別資料型態
		v1.play(); // 子類別的實體, 子類別的方法 => "Play Video"
	}

	// goodness of polymorphism : decouple, one just need to focus on business model(logic/process) here, no need to concern about implementation and other details
	public void process(Multimedia media){ 
        System.out.println("Do something: start");
        media.play();
        System.out.println("Do something: finish");
    }
}
