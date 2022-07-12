# 抽象類別 Abstract Classes
> 可參照8-2 OOP README.md

- 包含抽象方法的類別
- 可以包含抽象方法, 也可以包含實作方法
	如果很確定要做的事情是屬於該抽象類別, 那可以直接在該抽象類別下實作方法, 若是尚未確定要做的或是責任在於其他類別, 就把其分開, 在抽象類別下先建抽象方法, 交由其他物件去實作
- 繼承抽象類別的子類別, 必須實作抽象方法
- keyword: abstract

```java  
public abstract class Network{
	public abstract void connect();  
}  
```  

---

## Homework: SCJP證照考題
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
Explanation: 當同時從一個或多個介面和抽象類別繼承空的方法時, 寫法比照一般方法, 沒有Data.load() 或Info.load() 的寫法