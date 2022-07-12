# ��H���O Abstract Classes
> �i�ѷ�8-2 OOP README.md

- �]�t��H��k�����O
- �i�H�]�t��H��k, �]�i�H�]�t��@��k
	�p�G�ܽT�w�n�����Ʊ��O�ݩ�ө�H���O, ���i�H�����b�ө�H���O�U��@��k, �Y�O�|���T�w�n�����άO�d���b���L���O, �N�����}, �b��H���O�U���ة�H��k, ��Ѩ�L����h��@
- �~�ө�H���O���l���O, ������@��H��k
- keyword: abstract

```java  
public abstract class Network{
	public abstract void connect();  
}  
```  

---

## Homework: SCJP�ҷӦ��D
```java   
interface Data {
	public void load(); 
}

abstract class Info {
	public abstract void load(); 
}
```  

### Which class correctly uses the Data interface and Info class?

A.  
```java  
public class Employee extends Info implements Data {
    public void load(){ /* do something */ }
}
```  

B.  
```java  
public class Employee implements Info extends Data {
    public void load(){ /* do something */ }
}
```  

C.  
```java  
public class Employee extends Info implements Data
    public void load(){ /* do something */ }
    public void Info.load(){ /* do something */ }
}
```  


D.```java  
public class Employee implements Info extends Data {
    public void Data.load(){ /* do something */ }
    public void load(){ /* do something */ }
}
```  


E.  
```java  
public class Employee implements Info extends Data {
    public void load(){ /* do something */ }
    public void Info.load(){ /* do something */ }
}
```  


F.  
```java  
public class Employee extends Info implements Data{
    public void Data.load(){ /* do something */ }
    public void Info.load(){ /* do something */ }
}
```  

ANS: A
Explanation: ��P�ɱq�@�өΦh�Ӥ����M��H���O�~�ӪŪ���k��, �g�k��Ӥ@���k, �S��Data.load() ��Info.load() ���g�k