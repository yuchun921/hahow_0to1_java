package codegym;

import java.util.ArrayList;
import java.util.List;

public class TestDemo {
	public static void main(String[] args) {
		/*
		 * package codegym 下的 DoubleFoo and StringFoo, 內容極為相似, 除了傳入的資料型態不同
		 * 若使用泛型, 可以不用因為資料型態限制而實作多種方法, 只需要實作一種即可, 以避免這種情況發生
		 */
		System.out.println("*** Generic example ***");
		System.out.println("\\n--- String data type ---");
		Foo<String> fooStrObj = new Foo<String>();
		fooStrObj.setFoo("test generic");
		System.out.println(fooStrObj.getFoo());
		
		System.out.println("\n--- Double data type ---");
		Foo<Double> fooDoubleObj = new Foo<Double>();
		fooDoubleObj.setFoo(3.14);
		System.out.println(fooDoubleObj.getFoo());
		
		/* Wildcard example */
		// Foo <? extends List> foo1 = new Foo<String>(); // Error: String不是繼承List的子類別 / 也沒有實作List介面
		Foo <? extends List> foo2 = new Foo<ArrayList>(); // ArrayList實作List介面
		
		Foo <? super ArrayList> foo3 = new Foo<List>(); // List 是 ArrayList 的父類別
		
	}
}
