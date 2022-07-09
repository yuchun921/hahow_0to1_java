# 內部類別
- 在類別裡面定義類別
```java
public class OuterClass{
	private class InnerClass{
		...
	}
}  
```

- 內部類別本身可以存取外部類別的成員, 通常非靜態內部類別會宣告為 private, 這類內部類別是輔助類別中某些操作而設計, 外部不用知道內部類別的存在