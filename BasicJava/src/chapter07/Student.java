package chapter07;

public class Student extends People {
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); //부모생성자호출
		this.studentNo = studentNo;
	}
}
