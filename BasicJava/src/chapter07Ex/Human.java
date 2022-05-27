package chapter07Ex;

public class Human {
	private String name; //이름
	private int age; //나이
	
	
	public Human() {
	}
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "이름: " + name + ", 나이: " + age;
	}
}
