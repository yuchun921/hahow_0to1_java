package codegym;

public class TestDemo {

	static int i = 123;
	static final int j = 123;
	
	public static void main(String[] args) {
		/*
		 * final:
		 * - class:    設為final class的類別不能再被繼承
		 * 		EX: 放在 public final class TestDemo, 儲存後, subclass會報錯
		 * - function: 不能再被覆寫
		 * 		EX: 放在 public final void testFunction(), 儲存後, subclass會報錯
		 * - variable: 初始化後不能修改
		 * 		EX: main 方法外 static int i = 123, 在main中, 就無法修改i的值
		 */
		
		i = 456;
		// j = 444; 因static final int j, so can't change it's value
	}
	
	public void testFunction() {
		
	}
}
