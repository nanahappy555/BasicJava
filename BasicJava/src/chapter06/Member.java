package chapter06;
//230p 확인문제 2,3 두사람의 정보를 저장하게 만들어보자
public class Member {
	String name;
	int age;
	public Member() { //1. 기본생성자 default
		
	}
	
	public Member(String name, int age) { //2.
		this.name = name;
		this.age = age;
	}
}

//생성자가 아무것도 없으면 컴파일러가 자동으로 만들어줌
// 2만 있으면 기본 생성자를 자동으로 만들어 주지 않아서 1도 있어야 됨