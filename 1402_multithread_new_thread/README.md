# Multithread: Lifecycle

## 多執行緒
- 執行緒是作業系統分配處理器時間的基本單位 => 同一個時間可以做多件事情
	- EX: 現在cpu有雙核心、四核心, 可以同時做多件事情

![thread lifecycle](http://mahaljsp.asuscomm.com/wp-content/uploads/2016/10/java_thread_lifecycle.png)

1. new Thread
2. start()                   - 準備執行這個 thread  
3. 進去 Runnable 排隊          - 在「start()準備執行」後還沒有真的開始執行，「進去 Runnable 排隊」  
4. 等待 thread scheduler 叫號  - 進去排隊之後，等待thread scheduler排班器呼叫  
	-- 如果被 block (像time.sleep) 就要等到被 block 完之後，重新回到 Runnable 排隊  
5. run()                      - 就是到 Running 區，真的在執行  
6. Thread dead				 - 執行完後，thread結束  


[Oracle Doc]https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/Thread.html  
[Life cycle of a Thread]https://www.javatpoint.com/life-cycle-of-a-thread  
[執行緒基礎]http://mahaljsp.asuscomm.com/index.php/2018/12/01/java8_thread_basic/  
[執行緒的生命週期及執行緒控制方法詳解]https://iter01.com/506682.html  

### 產生Thread
- extends class Thread
	- java只能繼承一個物件, 所以繼承thread後就不能繼承其他物件
	- 要覆寫run(), 將實作放置其中
	- thread.start()
- implements interface Runnable
	- 可以繼承其他物件且能實作其他介面
	- 將物件放入Thread constructor
	- thread.start()