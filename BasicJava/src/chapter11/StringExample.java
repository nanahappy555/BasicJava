package chapter11;

public class StringExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		if (subject.indexOf("프로") < 0) {
			System.out.println("찾는 글자가 없다.");
		} else {
			System.out.println("있다");
		}
		
		//요즘 많이 쓰는 메소드
		if (subject.contains("프로")) {
			//"프로"가 있으면 트루라서 부등호로 비교할 필요가 없음
		}
		
		subject.startsWith("자바"); //"자바"로 시작하면 true
	}
}
