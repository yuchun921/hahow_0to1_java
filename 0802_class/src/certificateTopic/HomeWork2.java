package certificateTopic;

/*
 * Witch four code fragments, inserted indepedently at line24 will compile? (Choose four)
 * 
 * (A) public void m1(){}
 * (B) protected void m1(){}
 * (C) private void m1(){}
 * (D) void m2(){}
 * (E) public void m2(){}
 * (F) protected void m2(){}
 * (G) private void m2(){}
 * 
 * ANS: A, B, E, F
 */

public class HomeWork2{
	
	void m1() {};
	protected void m2() {};

}

class Lois extends HomeWork2{
	// insert code here
}

/* 
 * 修飾子存取權限: (高<--->低) public > protected > default > private
 * override時子類別調用父類別的修飾子存取權限不能比原本父類別的還低
 * (Cannot reduce the visibility of the inherited method from HomeWork2) 
 * 
 * 因此
 * m1 在父類別中是 default, 因此Louis繼承後若覆寫, 可以選擇 (A) public 和 B(protected)
 * m2 在父類別中是 protected, 因此Louis繼承後若覆寫, 可以選擇 (E) public 和 F(protected)
 */

