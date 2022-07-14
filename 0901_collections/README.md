# 集合 Collection
- 將許多同種資料型態的物件集合在一起
- 會比陣列(Array)更有彈性且好處理

---

## List
- 將物件 **依序存放, 且依序取出**
- 可以重複物件
- List是一個interface
- [Oracle docs](https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/List.html)

```java
List<String> list = new ArrayList<String>();

list.add("t1");
list.add("t2");
```

## Set
- **不會依照順序儲存物件**
- 不可重複物件
- [Oracle docs](https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/Set.html)

```java
// Set is interface
// HashSet is class that implement Set
Set<String> set = new HashSet<String>();

list.add("t1");
list.add("t2");
list.add("t2"); // 這個不會被存到set, 因為重複
```

## Map
- 物件用 **key, value** 的方式儲存
- 用key來取得value
- Map(key, value)
- [Oracle docs](https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/Map.html)

```java
// Map is interface
// Hashmap is class that implement Map
Map<String, Interger> map = new HashMap<String, Integer>();
```  
