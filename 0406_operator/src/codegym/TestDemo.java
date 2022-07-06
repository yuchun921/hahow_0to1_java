package codegym;

public class TestDemo {

	public static void main(String[] args) {
		int a = 4;
		int b = 3;

		/* arithmetic operato */
		// +1 遞增
		a++;
		System.out.println("After a++: " + a);

		// -1 遞減
		b--;
		System.out.println("After b--: " + b);

		// 餘數
		System.out.println("a%b: " + a % b);

		// += or -=
		a += b; // eaqul to a = a+b
		System.out.println("a+=b: " + a);

		/* conditional operator */
		// (a>b) ? true:false
		int c = 2;
		int d = 3;
		System.out.println(c < d ? "yes" : "no");
		
		int e = 3;
		int f = 4;
		System.out.println((e!=f) && (f%e>0) ? "yes" : "no");
	}

}
