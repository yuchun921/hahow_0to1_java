package codegym;

public class TestDemo {

	public static void main(String[] args) {
		
		try {
			throw new MyException("Error message here.");
		} catch(MyException e) {
			System.out.println(e.getMessage());
		}

	}

}
