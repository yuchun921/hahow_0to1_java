# �ʸ� Encapsulation

![�ʸ�](https://i.imgur.com/IUHkjQy.png)

-  �N�u��@�v�P **�u�~������P���쪺�ާ@�����v** ���}
	```java  
	public class Test{
		// private�L�k�������~�����H�ϥ�
		// �z�L�U�C2��publice��k�Ӯ���name
		private String name; 
		
		public void setName(String str){
			name = str.trim();
		}
		
		public String getName(){
			return name;
		}
	}
	
	```
- �w�q���󪺾ާ@�����M���ù�@�Ӹ`
- �ϥ� private, public �� access modifiers