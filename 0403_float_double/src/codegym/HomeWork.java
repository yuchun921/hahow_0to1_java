package codegym;

public class HomeWork {

	public static void main(String[] args) {
		// FV = PV(1+i)^n

		int presentValue = 100000;
		double i = 0.03;
		int n = 10;

		double futureValue = presentValue * Math.pow((1 + i), n);
		System.out.println("FV is " + futureValue);

	}

}
