package chapter06;

public class MemberExample {
	public static void main(String[] args) {		
		Member mem1 = new Member();  //1.기본 생성자 호출1 기본생성자가 없으면 이 형태로 못 씀
		mem1.name = "최하얀";
		mem1.age = 23;
		
		Member mem2 = new Member(); //1.기본 생성자 호출2
		mem2.name = "이혜림";
		mem2.age = 32;
		
		Member mem3 = new Member("류관순", 15); //2.
	}
}
