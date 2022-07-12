# 泛型 Generic

- 多型(ploymorphism)的一種技巧
- 定義"安全的"泛型類別(Generic class), 提供編譯時期檢查
- 編譯期間無法確定程式的撰寫方式, 而按照執行期間的狀況決定
- 不用因為資料型態限制而實作多種方法, 只需要實作一種即可
- keyword: <T> & T : T means Data "Type"

```java
// Example1
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

```java  
// Example2
public class Foo<T>{
	private T f;
}

// 可以定義多個
public class Foo<T1, T2>{
	privete T1 f1;
	privete T2 f2;
}
```  
  
---

## 通配字元 Wildcard

- 共變性
- 繼承於List的子類別 或 實作List介面的類別
	```java  
	Doo < ? extends List> // 要放到Doo的資料型別必須是繼承於List的子類別
	```  
- List的父類別
	```java  
	Doo < ? super List> // 要放到Doo的資料型別必須是List的父類別
	```  

---

## Homework 證照題目
![證照考題](https://i.imgur.com/8CMiYsP.png)  
==> answer in GenericB.java

