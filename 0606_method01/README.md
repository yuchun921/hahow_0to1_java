# Method 

## 為何要使用方法
- 避免程式不斷重複重寫(一樣的概念在不同地方一直重寫)

```java  
public String sayHello(String name){
	String str = "Hello " + name;
	return str;
}
```

## 方法名稱
- 方法名稱: `sayHello`

## 輸入參數
- 不限定只有一個, 可以多個輸入參數, 用逗號分隔參數
- 參數資料型態: `String`
- 參數名稱: `name`

## 回傳值
- 只能有一個
- 回傳值資料型態: `return str;`

## 修飾子 modefier

### 存取權限控制 (access level modifier)
	- public: 誰都能用
	- default: 封裝(package)內有效
	- private: 僅類別(class)內有效
	- protected: 封裝(package)內及子類別(subclasses)內有效
	
### 非存取權限 (non access modifier)
	- static: 靜態，用於類別函數∕方法(methods)與變數。
	- final: 相當於常數化，用於類別，方法與變數的實作。
	- abstract: 用來建立抽像類別與方法。
	- synchronized: 執行緒(threads)專用，代表同時只能被一個執行緒取用。