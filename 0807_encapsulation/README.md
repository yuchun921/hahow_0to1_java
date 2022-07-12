# 封裝 Encapsulation

![封裝](https://i.imgur.com/IUHkjQy.png)

-  將「實作」與 **「外部物件感興趣的操作介面」** 分開
	```java  
	public class Test{
		// private無法直接給外部的人使用
		// 透過下列2個publice方法來拿到name
		private String name; 
		
		public void setName(String str){
			name = str.trim();
		}
		
		public String getName(){
			return name;
		}
	}
	
	```
- 定義物件的操作介面和隱藏實作細節
- 使用 private, public 等 access modifiers