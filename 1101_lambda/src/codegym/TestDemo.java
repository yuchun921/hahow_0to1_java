package codegym;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestDemo {

	public static void main(String[] args) {

		// 使用泛型在前方就定義好資料型態的話, 等號後邊就不用在定義
		Comparator<Integer> com = (x, y) -> x * y;
		
		int result = com.compare(100, 48);
		System.out.println(result);
		
		// Java8 forEach: 搭配lambda得到資料
		List<String> list = new ArrayList<String>();
		list.add("99");
		list.add("88");
		list.add("77");
		
		list.forEach(s -> System.out.println(s));
		
		// 使用靜態方法來定義函式介面實作
		Comparator<Integer> com1 = Math::subtractExact;
		int result1 = com1.compare(10, 2);
		System.out.println(result1);
		
	}

}
