package codegym;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		long l = (long) i;
		System.out.println(l);

		long l1 = 2147483648L; // 程式中整數編譯器預設是 int, 因此要請編譯器使用long作為記憶體配置
		System.out.println(l1);

		float f = 3.14F; // double 長度 8byte, float 長度 4byte, 因此要告訴編譯器你這邊是要用float配置
		System.out.println(f);

		// 物件
		System.out.println("=================");
		Double d = new Double(3.14);
		System.out.println(d.SIZE); // SIZE 物件長度
		System.out.println(d.intValue()); // SIZE 物件長度

		// 將基本資料型態轉換成物件
		System.out.println("--------- data type turn to object ---------");
		double d1 = 3.14;
		Double d2 = Double.valueOf(d1);
		System.out.println(d2);

		// complier sugar: 編譯器自動將基本資料型態轉成物件
		System.out.println("========= Complier sugar =========");
		System.out.println("--------- autoboxing ---------");
		// autoboxing: 將基本資料型態轉成物件
		double dd1 = 6.53;
		Double dd2 = dd1;
		System.out.println(dd2);

		System.out.println("--------- unboxing ---------");
		// unboxing: 將物件轉成基本資料型態
		Double dd3 = new Double(6.53); // since version9 ==> Double.valueOf(6.53);
		double dd4 = dd3;
		System.out.println(dd4);

		System.out.println("--------- string turn to double type ---------");
		// 字串轉基本資料型態: 字串無法做加減乘除
		double dou1 = Double.parseDouble("2.67");
		int dou2 = Integer.parseInt("4");

		System.out.println(dou1);
		System.out.println(dou2);

		System.out.println("--------- double type turn to string ---------");
		// 基本資料型態轉字串
		double dou3 = 5.89;
		String dou3s = String.valueOf(dou3);
		String dou4s = new String("5.89");
		System.out.println(dou3s);
		System.out.println(dou4s);
	}

}
