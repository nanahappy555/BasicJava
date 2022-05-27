package chapter07.verify.exam04;

public class ChildExample {
	public static void main(String[] args) {
		Child c1 = new Child("이름", 10);
		System.out.println(c1.name);
//		System.out.println(c1.studentNo); private라 오류나는것... getter setter사용하면 문제x
	}
}
