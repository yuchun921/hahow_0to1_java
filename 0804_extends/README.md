# 繼承

類別不能使用多重繼承  
-	一個子類別不能繼承兩個以上的父類別
  
```java
// 這樣是不行的  
public class B extends A, C {
	...
}
```

---

## 多形

父類別的reference可以指到子類別的物件
```java
public class B extends A{
    ...
}
// 這就是多型，因為 a 的 Type 是 A，但他是透過 B() 去 new 出實體物件來
A a = new B(); 
```

## 轉型 casting

★ 不管物件中間有被向上轉型或向下轉型，要看最開始 **實際上物件是由哪一個類別實現** 的，之後所使用的屬性和方法就是用那個類別的

使用多型後可以對物件轉型
- 向上轉型
- 向下轉型

```java
public class B extends A{
	...
}

// 向上轉型: 子類別物件向上傳給父類別
B b = new B(); // new 出 B物件
A a = b; // new出的 物件b assigned 給B的父類別 A

// 向下轉型: 父類別物件向下傳給子類別
A a = new B(); // 父類別資料型態, 子類別的實體
B b = (B)a; // 類似基本資料轉型, 一樣用()去轉
```

![轉型概念](https://img.uj5u.com/2020/09/15/72485151848591.png)
- https://www.uj5u.com/houduan/49411.html