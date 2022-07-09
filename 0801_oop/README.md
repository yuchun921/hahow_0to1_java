# 物件導向 Objected-oriented programming

- 提高軟體的重用性(Reuse), 靈活性, 擴充功能性
- 程式中物件可以互相存取相關資料

## 耦合度 Coupling or Dependency
- 物件本身可以自由修改與變化, 且不影響其他物件
- 外部程式修改也不會影響到物件本身的功能及運作
- 物件之間還要可以互相合作

```text
歐盟:
	高耦合度組織
	使用同種貨幣, 把各個國家關係拉的很緊密, 若有其一有財務危機時, 其餘會員國也會受到嚴重損害
WTO
	低耦合度組織
	只規範部分標準, 因此各國之間只要符合其監督機制, 就可以互相合作
```


## 類別與物件 Object and Class
- 類別是定義物件的一種形態, 沒有實體 --> 設計圖(藍圖)
	- 類別下有自己的屬性和方法
- 物件是某個類別的實體(instance) --> 依照設計圖做出來的東西


## 封裝 Encapsulation
1.  將「實作」與 **「外部物件感興趣的操作介面」** 分開
	```java  
	public class Test{
		// private無法直接給外部的人使用
		// 透過下列2個publice方法來拿到name
		private String name; 
		
		public void setName(String str){
			name = str.trim();
		}
		
		public String getName(){
			return name;
		}
	}
	
	```
2. 定義物件的操作介面和隱藏實作細節
3. 使用 private, public 等 access modifiers

## 繼承 Extends
1. 基於某個父類別對物件的定義擴充
2. 可以增加新的方法也可以覆寫父類別的方法
```java
class B extends A{ }
```

## 介面 Interface
1. 描述不同類別間相同的行為
2. 實作與介面分開, 以便讓同個介面但不同的實作物件能夠用一樣的面貌讓外界使用
	```java
	public interface Car{ // 這個介面名稱為Car
		// 有兩個方法, 但沒有實作(直接加();),
		// 像是開出一個規格 => 這個車一定要有這兩個方法 
		public void goAhead();
		public void goBack();
	}
	
	// 底下實作 ==> 才確定這兩個方法要做什麼行為
	publice class Ford implements Car{ // keyword: implements
		// 實作goAhead(), goBack()
	}
	
	publice class Mazda implements Car{ // keyword: implements
		// 實作goAhead(), goBack()
	}
	```
3. 介面沒有實作方法，所以沒辦法產出實體(No implements and instances in interface)
	
## 多型 Polymorphism
1. 同一個資料型態, 操作不同物件實例 ==> 因此可降低對資料型態操作的依賴度
2. 可用界面和父類別來宣告物件型態
```java
/* 承 interface 的範例 */

// 先把Car物件 new出來
// 在此範例之前做的 => 會new跟資料型態一樣的 Ex: TestDemo demo = new TestDemo();
// 但因為前面所提: "介面沒有實作方法, 不能夠產生實體"
// 要產生實體, 必要有一個class才能產生實體物件
Car ford = new Ford(); // 這邊實際new出來的物件, 是由Ford這個class實現的 (interface的Ford Class)
Car mazda = new Mazda(); // 同Ford
// 不需要因為是ford還是mazda而寫成兩個方法，只要對 "interface" car 操作就行了

public void process(Car car){
	car.goAhead();
	car.goBack();
	car.goAhead();
}
```

## 抽象類別 Abstract class
1. 可包含實作方法和未實作方法 
    - 但若含未實作方法 => 不可以被實體化(不可以被new)
    - 若要含未實作方法且要被實體化, 必須建一個子類別然後繼承此抽象類別, 且必須實作未實作的方法
2. 子類別必須實作抽象類別的抽象方法
```java
public abstract class Ford{
    public void goAhead(){
        // 必須實做
    }
    
    // 未實作
    public void openDoor(); // 直接();結束, 並沒有實作
}
```

## 泛型 Generic
1. 多型的一種技巧
2. 編譯期間無法確定程式的撰寫方式, 而按照執行期間的狀況決定
3. 不用因為資料型態限制而實作多種方法, 只需要實作一種即可
4. keyword: <T> & T : T means Data "Type"

```java
public class numbers<T>{
    public void add(T num1, T num2){
        System.out.println(num1+num2);
    }
}
// T 指的是傳入的資料型態
/*
 * 一般情況而言若我要傳入整數, 就必須寫一個 (int num1, int num2) 的方法
 * 若今天要傳入浮點數, 要另外再寫一個 (double num1, double num2) 的方法
 * 但使用泛型的話, 只要寫 (T num1, T num2) 一個, 而程式會按照執行時你傳入的去做決定
 */
```

---

# UML (Undefined Modeling Language)

IT 能夠閱讀、傳達系統組織架構的設計規格
- 使用案例圖 (Use-case diagram)  
  1. Actor(參與者) : 顧客、銀行主機  
  2. Use Case (使用案例) : 會用到 查詢餘額、提款、轉帳  
    ![](https://i.imgur.com/8sNSaAy.png)  
- 類別圖 (Class diagram)  
    ![類別圖](https://s4.itho.me/sites/default/files/images/%E5%9C%9617(5).jpg)  
  參考: https://www.ithome.com.tw/node/62186  
- 循序圖 (Sequence diagram)  
    ![循序圖](https://3.bp.blogspot.com/-Y3avfHLEMc8/XIHl-cNpDOI/AAAAAAAAJTE/dW0OYYqFJZ0xUozFfzGj-4GFlsTfws57wCEwYBhgL/s1600/sequence-diagrams-2.png)  
    參考: https://terryjryeh.blogspot.com/2019/03/uml-sequence-diagrams-8.html  
- 狀態圖 (Statechart diagram)  
    ![狀態圖](https://online.visual-paradigm.com/repository/images/e6ef1cbb-8cf6-40e3-8bae-aa4859f0d12f/state-machine-diagram-design/state-machine-diagram-for-online-bookstore.png)  

---

# 設計模式 Design pattern
要怎麼使用物件導向來解決軟體工程的問題？
1. 設計模式是在解決各種問題中的經驗彙整
2. 將反覆出現的各種問題提出的解決方案
3. GoF 提出 23 種經典的設計模式
