package certificateTopic;

/*
 * Which three statements are true?
 * (A) Compilation fails
 * (B) The code compiles and the output is 2.
 * (C) If lines 16, 17 and 18 were removed, compilation would fail.
 * (D) If lines 24, 25 and 26 were removed, compilation would fail.
 * (E) If lines 16, 17 and 18 were removed, the code would compile and the output would be 2.
 * (F) If lines 24, 25 and 26 were removed, the code would compile and the output would be 1.
 * 
 */

// Class Declaration
public class HomeWork {

	// inner class in class
	class A implements Foo {
		public int bar() {
			return 1;
		}
	}

	// Method
	public int fubar(Foo foo) {
		return foo.bar();
	}

	// Method
	public void testFoo() {

		// inner class in method
		@SuppressWarnings("hiding")
		class A implements Foo {
			public int bar() {
				return 2;
			}
		}

		System.out.println(fubar(new A()));
	}

	// Main Method
	public static void main(String[] argv) {
		new HomeWork().testFoo();
	}

}

/**
 * Explanation:
 * 這裡出現了兩種innerClass：在class中的, 在方法中的
 * 其實不論是哪種innerClass，其效力都只限於它"出現的block中(大括弧)"
 * 同名的class會被覆寫，默認使用最接近呼叫點的層級的class
 * 原程式的testFoo方法做了fubar(new A())的動作，這裡的A是在testFoo方法中生成的，因此指的便是方法中的innerClass(最接近呼叫點層級)
 * 如果把16.17.18行去掉，不影響原本結果
 * 如果把24.25.26行去掉，原本方法中指的A就會是class中的innerClass A (最接近呼叫點層級)
 */
