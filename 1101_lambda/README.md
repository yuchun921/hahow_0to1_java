# Lambda
- 定義函式介面實作的一種方法
- 不用建立實作的類別
- 不用輸入方法的名稱

## Lambda 表示式
```java  

// 實作 com 變數
// 輸入參數: 兩個整數 x, y
// 實作方法: x-y
Comparator<Integer> com = (Integer x, Integer y) -> x-y;

// 使用 com
Integer result = com.compare(5,2);
```

#### 等號左邊
- 目標型態(Target Type)
- Interface 定義函式介面
- 只有一個抽象方法

#### 等號右邊
- Lambda 表示式 (Expression)
- `->` : input(輸入參數) -> body(實作方法)
- 可以使用自定義的interface

---

## 使用靜態方法來定義函式介面實作
- 函式介面的實作是參考某一個類別的靜態方法
- 輸入及回傳的參數是一樣的
- 使用方法: `物件名稱::方法名稱`

```java
// 相減的靜態方法
Math.subtractExact(5, 2);

// 參考靜態方法
Comparator<Integer> com = Math::subtractExact;
// 物件名稱 => Math, 方法名稱 => subtractExact

Integer result = com.compare(5, 2); // 3
```
