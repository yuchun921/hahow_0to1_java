# Interface 介面
- 抽象的概念, 只單純定義方法, 而不實作, 有點像開出一個規格, 但各自的物件自己去做各自規格 (可參照8-2 OOP README.md) => keyword: interface  
- 若要使用interfece的物件, 就必須實作其方法 => keyword: implements  
	```java  
	public interface File{
		public void openFile(); // 只定義, 不實做
	}
	
	public class multimedia implements File{
		// 實作
	}
	```
- 在介面中, 不能夠定義屬性, 但如果真的要的話, 只能定義常數(不能修改)
	```java
	// 一定要static and final
	public static final String test = "a";
	```

---

# 多重繼承
- interface可以多重繼承 (類別就只能繼承一個父類別)
```java  
public interface File extends Super1, Super2 {
    ...
}
```
