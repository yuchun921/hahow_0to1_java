# For 

## for loop
- 宣告變數, 且設定初始值: `int i = 0`
- 須設定結束條件: `i < 10`
- 調整變數的值: `i++`

```java  
for (int i = 0; i < 10; i++) {
	System.out.println(i);
}
```

## for each
- 簡化陣列與集合(把相似的東西放在同個物件)的存取方式

```java  
int[] array = {1, 2, 3};
for(int i : array){
	...
}
```