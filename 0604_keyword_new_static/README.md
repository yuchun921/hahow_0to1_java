# Static and New

差別在於**何時佔據記憶體**

- static:  
	系統一開始就產生且占據記憶體  
    ```java
    public class Class1{
        static int i = 123;
        String str = "Hello";
     
        public void function1(){
            int i =456;
        }
    }
    ```

	
- new:  
	產生實體物件，變數才佔據記憶體  
	```java
	public class Class2{
		public void function2(){
			Class1 class1 = new Class1();
			class1.function1();
		}
	}
	```
