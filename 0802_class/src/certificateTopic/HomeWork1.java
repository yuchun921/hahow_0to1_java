package certificateTopic;

// Class Declaration
class X {
	// "default constructor"
	X() {
		System.out.print(1);
	}

	// "overload constructor"
	X(int x) {
		this();
		System.out.print(2);
	}
}

// Class Declaration
public class HomeWork1 extends X {
	// "default constructor"
	HomeWork1() {
		super(6);
		System.out.print(3);
	}

	// "overload constructor"
	HomeWork1(int y) {
		this();
		System.out.println(4);
	}

	public static void main(String[] args) {
		new HomeWork1(5);
	}

}

/** Explanation:
 * [!] this() 呼叫自己本身沒有參數的建構子
 * [!] super() 調用父類別的屬性或方法
 * 
 * 1. (L31) 程式都是從 main() 開始, 所以從 main() 開始看
 * 		new HomeWork1(5); ==> new HomeWork 物件, 且調用需要輸入參數的建構子 => 跳到L26
 * 
 * 2. (L26) HomewWork1(int y)
 * 		(L27) this(); ==> 呼叫HomeWork自己本身沒有參數的建構子 => 跳到 L20
 * 
 * 3. (L20) HomewWork1()
 * 		(L21) super(6); ==> 調用父類別X的屬性或方法, 這邊有傳入參數, 所以調用父類別有需要傳入參數的建構子 => 跳到L11
 * 
 * 4. (L11) X(int x)
 * 		(L12) this(); ==> 呼叫X自己本身沒有參數的建構子 => 跳到L6
 * 
 * 5. (L6) X()
 * 		(L7) System.out.println(1); ==> print(1)
 * 		
 * --- L7執行結束, 跳回 L12 ---
 * 
 * 6. (L12) this(); 執行結束 => 往下執行 L13
 * 		(L13) System.out.print(2); ==> print(2)
 * 
 * --- L13執行結束, 跳回 L21 ---
 * 
 * 7. (L21) super(6); 執行結束 => 往下執行 L22
 * 		(L22) System.out.print(3); ==> print(3)
 * 
 *  --- L22執行結束, 跳回 L27 ---
 *  
 * 7. (L27)this();; 執行結束 => 往下執行 L28
 * 		(L22) System.out.print(4); ==> print(4)
 * 
 * 8. 程式執行結束, 依序print => 1234
 * 
 */
