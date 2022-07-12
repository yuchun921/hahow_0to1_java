package codegym;

public class Foo<T> { // T meas Datatype
	private T foo; // T means 未來使用Foo類別產生物件時必須傳入的資料型態參數

	public T getFoo() {
		return foo;
	}

	public void setFoo(T foo) {
		this.foo = foo;
	}
	
	
}
