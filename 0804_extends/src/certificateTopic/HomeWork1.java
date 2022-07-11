package certificateTopic;

/*
 * What is the result
 * 
 * (A) peep
 * (B) bark
 * (C) meow
 * (D) Compilation fails
 * (E) An exception is thrown at runtime
 * 
 * ANS: E
 * 	 Animal的refrence是指向Dog物件實體，所以轉為Cat會在runtime時期發⽣錯誤
 */

// Class Declaration
class Animal {
	public String noise() {
		return "peep";
	}
}

class Dog extends Animal {
	public String noise() {
		return "brak";
	}
}

class Cat extends Animal {
	public String noise() {
		return "meow";
	}
}

// Class Declaration
public class HomeWork1 {
	public static void main(String[] args) {
		Animal animal = new Dog(); // Animal 父類別型態, 但是是由 Dog子類別new出實體物件
		Cat cat = (Cat) animal; // 可以 子類別轉子類別?? ==> 由答案可知不可這樣轉
		System.out.println(cat.noise()); 
		// 猜測: D. Compilation fails
		
		// Explanation: Animal的refrence是指向Dog物件實體，所以轉為Cat會在runtime時期發⽣錯誤
	}

}
