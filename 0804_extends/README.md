# �~��

���O����ϥΦh���~��  
-	�@�Ӥl���O�����~�Ө�ӥH�W�������O
  
```java
// �o�ˬO���檺  
public class B extends A, C {
	...
}
```

---

## �h��

�����O��reference�i�H����l���O������
```java
public class B extends A{
    ...
}
// �o�N�O�h���A�]�� a �� Type �O A�A���L�O�z�L B() �h new �X���骫���
A a = new B(); 
```

## �૬ casting

�� ���ު��󤤶����Q�V�W�૬�ΦV�U�૬�A�n�ݳ̶}�l **��ڤW����O�ѭ��@�����O��{** ���A����ҨϥΪ��ݩʩM��k�N�O�Ψ������O��

�ϥΦh����i�H�磌���૬
- �V�W�૬
- �V�U�૬

```java
public class B extends A{
	...
}

// �V�W�૬: �l���O����V�W�ǵ������O
B b = new B(); // new �X B����
A a = b; // new�X�� ����b assigned ��B�������O A

// �V�U�૬: �����O����V�U�ǵ��l���O
A a = new B(); // �����O��ƫ��A, �l���O������
B b = (B)a; // �����򥻸���૬, �@�˥�()�h��
```

![�૬����](https://img.uj5u.com/2020/09/15/72485151848591.png)
- https://www.uj5u.com/houduan/49411.html