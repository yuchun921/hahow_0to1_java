# ����ɦV Objected-oriented programming

- �����n�骺���Ω�(Reuse), �F����, �X�R�\���
- �{��������i�H���ۦs���������

## ���X�� Coupling or Dependency
- ���󥻨��i�H�ۥѭק�P�ܤ�, �B���v�T��L����
- �~���{���ק�]���|�v�T�쪫�󥻨����\��ιB�@
- ���󤧶��٭n�i�H���ۦX�@

```text
�ڷ�:
	�����X�ײ�´
	�ϥΦP�سf��, ��U�Ӱ�a���Y�Ԫ��ܺ�K, �Y����@���]�ȦM����, ��l�|����]�|�����Y���l�`
WTO
	�C���X�ײ�´
	�u�W�d�����з�, �]���U�ꤧ���u�n�ŦX��ʷ�����, �N�i�H���ۦX�@
```


## ���O�P���� Object and Class
- ���O�O�w�q���󪺤@�اκA, �S������ --> �]�p��(�Ź�)
	- ���O�U���ۤv���ݩʩM��k
- ����O�Y�����O������(instance) --> �̷ӳ]�p�ϰ��X�Ӫ��F��


## �ʸ� Encapsulation
1.  �N�u��@�v�P **�u�~������P���쪺�ާ@�����v** ���}
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
2. �w�q���󪺾ާ@�����M���ù�@�Ӹ`
3. �ϥ� private, public �� access modifiers

## �~�� Extends
1. ���Y�Ӥ����O�磌�󪺩w�q�X�R
2. �i�H�W�[�s����k�]�i�H�мg�����O����k
```java
class B extends A{ }
```

## ���� Interface
1. �y�z���P���O���ۦP���欰
2. ��@�P�������}, �H�K���P�Ӥ��������P����@�������Τ@�˪��������~�ɨϥ�
	```java
	public interface Car{ // �o�Ӥ����W�٬�Car
		// ����Ӥ�k, ���S����@(�����[();),
		// ���O�}�X�@�ӳW�� => �o�Ө��@�w�n���o��Ӥ�k 
		public void goAhead();
		public void goBack();
	}
	
	// ���U��@ ==> �~�T�w�o��Ӥ�k�n������欰
	publice class Ford implements Car{ // keyword: implements
		// ��@goAhead(), goBack()
	}
	
	publice class Mazda implements Car{ // keyword: implements
		// ��@goAhead(), goBack()
	}
	```
3. �����S����@��k�A�ҥH�S��k���X����(No implements and instances in interface)
	
## �h�� Polymorphism
1. �P�@�Ӹ�ƫ��A, �ާ@���P������ ==> �]���i���C���ƫ��A�ާ@���̿��
2. �i�άɭ��M�����O�ӫŧi���󫬺A
```java
/* �� interface ���d�� */

// ����Car���� new�X��
// �b���d�Ҥ��e���� => �|new���ƫ��A�@�˪� Ex: TestDemo demo = new TestDemo();
// ���]���e���Ҵ�: "�����S����@��k, ��������͹���"
// �n���͹���, ���n���@��class�~�ಣ�͹��骫��
Car ford = new Ford(); // �o����new�X�Ӫ�����, �O��Ford�o��class��{�� (interface��Ford Class)
Car mazda = new Mazda(); // �PFord
// ���ݭn�]���Oford�٬Omazda�Ӽg����Ӥ�k�A�u�n�� "interface" car �ާ@�N��F

public void process(Car car){
	car.goAhead();
	car.goBack();
	car.goAhead();
}
```

## ��H���O Abstract class
1. �i�]�t��@��k�M����@��k 
    - ���Y�t����@��k => ���i�H�Q�����(���i�H�Qnew)
    - �Y�n�t����@��k�B�n�Q�����, �����ؤ@�Ӥl���O�M���~�Ӧ���H���O, �B������@����@����k
2. �l���O������@��H���O����H��k
```java
public abstract class Ford{
    public void goAhead(){
        // �����갵
    }
    
    // ����@
    public void openDoor(); // ����();����, �èS����@
}
```

## �x�� Generic
1. �h�����@�اޥ�
2. �sĶ�����L�k�T�w�{�������g�覡, �ӫ��Ӱ�����������p�M�w
3. ���Φ]����ƫ��A����ӹ�@�h�ؤ�k, �u�ݭn��@�@�اY�i
4. keyword: <T> & T : T means Data "Type"

```java
public class numbers<T>{
    public void add(T num1, T num2){
        System.out.println(num1+num2);
    }
}
// T �����O�ǤJ����ƫ��A
/*
 * �@�뱡�p�Ө��Y�ڭn�ǤJ���, �N�����g�@�� (int num1, int num2) ����k
 * �Y���ѭn�ǤJ�B�I��, �n�t�~�A�g�@�� (double num1, double num2) ����k
 * ���ϥΪx������, �u�n�g (T num1, T num2) �@��, �ӵ{���|���Ӱ���ɧA�ǤJ���h���M�w
 */
```

---

# UML (Undefined Modeling Language)

IT ����\Ū�B�ǹF�t�β�´�[�c���]�p�W��
- �ϥήרҹ� (Use-case diagram)  
  1. Actor(�ѻP��) : �U�ȡB�Ȧ�D��  
  2. Use Case (�ϥήר�) : �|�Ψ� �d�߾l�B�B���ڡB��b  
    ![](https://i.imgur.com/8sNSaAy.png)  
- ���O�� (Class diagram)  
    ![���O��](https://s4.itho.me/sites/default/files/images/%E5%9C%9617(5).jpg)  
  �Ѧ�: https://www.ithome.com.tw/node/62186  
- �`�ǹ� (Sequence diagram)  
    ![�`�ǹ�](https://3.bp.blogspot.com/-Y3avfHLEMc8/XIHl-cNpDOI/AAAAAAAAJTE/dW0OYYqFJZ0xUozFfzGj-4GFlsTfws57wCEwYBhgL/s1600/sequence-diagrams-2.png)  
    �Ѧ�: https://terryjryeh.blogspot.com/2019/03/uml-sequence-diagrams-8.html  
- ���A�� (Statechart diagram)  
    ![���A��](https://online.visual-paradigm.com/repository/images/e6ef1cbb-8cf6-40e3-8bae-aa4859f0d12f/state-machine-diagram-design/state-machine-diagram-for-online-bookstore.png)  

---

# �]�p�Ҧ� Design pattern
�n���ϥΪ���ɦV�ӸѨM�n��u�{�����D�H
1. �]�p�Ҧ��O�b�ѨM�U�ذ��D�����g��J��
2. �N���ХX�{���U�ذ��D���X���ѨM���
3. GoF ���X 23 �ظg�媺�]�p�Ҧ�
