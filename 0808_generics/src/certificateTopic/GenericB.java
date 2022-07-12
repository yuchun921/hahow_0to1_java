package certificateTopic;

/*
 * Place the code into GenericB class definition to make the class compile successfully.
 * (A) ? extends Pet
 * (B) T extends Pet
 * (C) ? implements Pet
 * (D) T implements Pet
 * (E) Pet extends T
 * (F) ?
 * (G) T
 * (H) <?>
 * (I) <Pet>
 */

// 通配字元(?)不能當作宣告方法的型別，必須要⽤T或是其他參數名稱
public class GenericB<T extends Pet> {

	public T foo;

	public void setFoo(T foo) {
		this.foo = foo;
	}

	public T getFoo() {
		return foo;
	}

	public static void main(String[] args) {
		GenericB<Cat> bar = new GenericB<Cat>();
		bar.setFoo(new Cat());
		Cat c = bar.getFoo();
		System.out.println(c);
	}

}

interface Pet {
}

class Cat implements Pet {
}
