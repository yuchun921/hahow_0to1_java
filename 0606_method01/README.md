# Method 

## ����n�ϥΤ�k
- �קK�{�����_���ƭ��g(�@�˪������b���P�a��@�����g)

```java  
public String sayHello(String name){
	String str = "Hello " + name;
	return str;
}
```

## ��k�W��
- ��k�W��: `sayHello`

## ��J�Ѽ�
- �����w�u���@��, �i�H�h�ӿ�J�Ѽ�, �γr�����j�Ѽ�
- �ѼƸ�ƫ��A: `String`
- �ѼƦW��: `name`

## �^�ǭ�
- �u�঳�@��
- �^�ǭȸ�ƫ��A: `return str;`

## �׹��l modefier

### �s���v������ (access level modifier)
	- public: �ֳ����
	- default: �ʸ�(package)������
	- private: �����O(class)������
	- protected: �ʸ�(package)���Τl���O(subclasses)������
	
### �D�s���v�� (non access modifier)
	- static: �R�A�A�Ω����O��ƢA��k(methods)�P�ܼơC
	- final: �۷��`�ƤơA�Ω����O�A��k�P�ܼƪ���@�C
	- abstract: �Ψӫإߩ⹳���O�P��k�C
	- synchronized: �����(threads)�M�ΡA�N��P�ɥu��Q�@�Ӱ�������ΡC