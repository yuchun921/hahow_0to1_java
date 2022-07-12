package codegym;

public class FTP extends Network{
	// implement methods in Network abstract class
	
	@Override
	public void connect() {
		System.out.println("...Internet connect");
		
	}

	@Override
	public void disconnect() {
		System.out.println("...Internet disconnect");
		
	}
	

}
