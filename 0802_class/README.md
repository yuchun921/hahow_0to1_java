# 建構子 Constructor
當物件被 new 出來的時候, 會執行建構子裡面的動作  
(當子類別 extends 父類別的時候, 父類別就被 new 出來了)

- 又稱"建構方法", "不回傳值的方法"
- 建構物件的同時, 可以初始化必要資訊
- **建構子名稱** 和 **類別名稱** 一樣
- 可以被重載(Overload)
	--> 資料型態和個數必須不同

若在Class中定義建構子, 需要傳入參數, 且無其他不需要傳入參數的建構子,  
```java
public class SuperClass {
    // constructor name must be same as class name
    public SuperClass(String str) {
        // 建構子被產生的同時, 給name屬性一個字串
        name = str;
    }
}
```
那在new Class物件時, 就必須得要傳入參數  
```java
SuperClass s = new SuperClass("Peggy");
// output
System.out.println("s.name"); // Peggy
```

但建構子可以被overload, 所以如果在Class中另外定義了一個不需傳入參數的建構子時,  
```java
public class SuperClass {
    public SuperClass() {
    	name = "someone";
    }
}
```
在new Class物件時, 也可以不用傳入參數  
```java
SuperClass s = new SuperClass();
// output
System.out.println("s.name"); // someone
```

---

# This
- Similar to self in Python.  
- 參考物件本身(就是這個class物件自己本身)  
- this() 也代表呼叫物件"沒有參數"的default建構子(直接以();結束)  
![](https://i.imgur.com/YS3S7xT.png)

# super
- similar to super() in Python.
- 參考父類別的屬性或方法
    ```java
    public class SubClass extends SuperClass{
        public String nickName;

        public SubClass(){
            this.nickName = "little" + super.name; // super 呼叫父類別的屬性
        }
    }
    ```

    ```java
    public static void main(String[] args) {
        // 在main()中new SubClass 子類別物件
        // 在 new 一個子類別的時候，父類別同時也會被 new 出來
        SubClass sub = new SubClass();
        System.out.println(sub.nickName);
    }
    // new 一個子類別(SubClass)的時候，父類別(SuperClass)同時也會由父類別中沒有參數的"default"建構子 new 出來 
    // => 因此才可以透過 super 調用父類別的屬性或方法
    ```
- 此外要特別注意 **"在new 一個子類別的時候，父類別同時也會被 new 出來"**, 未來開發時可能寫了很多繼承的方法, 可能你只使用子類別的某個功能, 但記憶體中, 程式會把它上面所有父類別都new出來