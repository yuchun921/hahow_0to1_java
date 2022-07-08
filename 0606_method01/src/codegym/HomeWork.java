package codegym;

public class HomeWork {

	public static void main(String[] args) {
		HomeWork hw = new HomeWork();
		System.out.println(hw.calBmi(1.53, 74.8));

	}
	
	public double calBmi(double height, double weight) {
		double bmi = weight / Math.pow(height, 2);
		return bmi;
	}

}
