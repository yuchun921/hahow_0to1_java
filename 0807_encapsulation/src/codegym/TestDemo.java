package codegym;

public class TestDemo {

	public static void main(String[] args) {
		Video video = new Video();
		
		// video.fileName; // The field Video.fileName is not visible [不能存取fileName, 因為其被封裝(private)] 
		
		// set file name
		video.setFileName("photo1");

		// get file name
		System.out.println(video.getFileName());

	}

}
