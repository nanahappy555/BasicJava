package chapter09.verify.exam02;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.run(); // 자전거가 달립니다.
		anony.method1(); // 승용차가 달립니다.
		anony.method2(new Vehicle() {
			@Override // Vehicle에 정의된 메소드라 @Override 안써도 되긴한데 이름틀리면 큰일나니까 써주자
			public void run() {
				System.out.println("트럭이 달립니다.");
			}
		});
	}
}
