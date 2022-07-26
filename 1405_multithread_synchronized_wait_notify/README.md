# Multithread: synchronized, wait, notify, notifyAll

## 同步化 synchronized
- 多執行緒再使用同一個資料時會出現資料不一致的情況  
	=> 因多執行緒的執行時間不一定
	
```java  
class User{
	private String name;
	// synchronized 可確保在同個時間只能"有一個執行緒"使用
	public synchronized setName(String name){
		this.name = name;
	}
	public getName(){
		return name;
	}
}

// ThreadA and ThreadB 共用物件User
ThreadA threadA = new ThreadA(user);
ThreadB threadB = new ThreadB(user);
```

### 同步化區塊
- 物件的鎖定(lock)，執行緒需取得lock才能執行
```java  
synchronized(this){
	...
}
```

![lock](https://i.imgur.com/n55taqI.png)

## wait(), notify(), notifyAll()
- 由Object類別提供的方法
- 需要在"同步化的方法or區塊"呼叫

### wait()
- 執行緒將進入物件等待池等待，直到時間到或是呼叫notify()

![blocked](https://i.imgur.com/0Iw29xl.png)
