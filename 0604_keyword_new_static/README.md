# Static and New

�t�O�b��**��ɦ��ڰO����**

- static:  
	�t�Τ@�}�l�N���ͥB�e�ڰO����  
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
	���͹��骫��A�ܼƤ~���ڰO����  
	```java
	public class Class2{
		public void function2(){
			Class1 class1 = new Class1();
			class1.function1();
		}
	}
	```