# �x�� Generic

- �h��(ploymorphism)���@�اޥ�
- �w�q"�w����"�x�����O(Generic class), ���ѽsĶ�ɴ��ˬd
- �sĶ�����L�k�T�w�{�������g�覡, �ӫ��Ӱ�����������p�M�w
- ���Φ]����ƫ��A����ӹ�@�h�ؤ�k, �u�ݭn��@�@�اY�i
- keyword: <T> & T : T means Data "Type"

```java
// Example1
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

```java  
// Example2
public class Foo<T>{
	private T f;
}

// �i�H�w�q�h��
public class Foo<T1, T2>{
	privete T1 f1;
	privete T2 f2;
}
```  
  
---

## �q�t�r�� Wildcard

- �@�ܩ�
- �~�ө�List���l���O �� ��@List���������O
	```java  
	Doo < ? extends List> // �n���Doo����ƫ��O�����O�~�ө�List���l���O
	```  
- List�������O
	```java  
	Doo < ? super List> // �n���Doo����ƫ��O�����OList�������O
	```  

---

## Homework �ҷ��D��
![�ҷӦ��D](https://i.imgur.com/8CMiYsP.png)  
==> answer in GenericB.java

