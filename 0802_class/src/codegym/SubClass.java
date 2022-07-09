package codegym;

public class SubClass extends SuperClass{
	public String nickName;
	
	public SubClass() {
		// super.name: 父類別的屬性
		this.nickName = "little " + super.name;
	}

}
