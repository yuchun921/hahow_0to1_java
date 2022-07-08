package codegym;

import java.util.Calendar;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ageNow = 28;
		int ageRetire = 65;

		Calendar calendar = Calendar.getInstance();
		int yearNow = calendar.get(Calendar.YEAR);
		// int yearNow = 2022; // hardcode

		int yearRetire = yearNow + (ageRetire - ageNow);
		System.out.println("Retire year: " + yearRetire);
	}

}
