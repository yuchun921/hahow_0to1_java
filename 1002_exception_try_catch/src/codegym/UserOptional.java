package codegym;

import java.util.Optional;

public class UserOptional {

	private String name;
	private Integer age;
	
	public Optional<String> getName() {
		return Optional.ofNullable(name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
