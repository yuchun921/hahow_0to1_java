package codegym;

public class SubClass extends TestDemo {
	
	// override: 繼承父類別TestDemo, 但改寫將其結果都*100
	public int add(int i, int j) {
		return (i + j) * 100;
	}
}
