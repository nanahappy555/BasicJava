package chapter09.verify.exam02;

public class Anonymous {
	//필드 초기값으로 대입
	Vehicle field = new Vehicle() {
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
	}; // ->필드 선언과 초기값 대입

	void method1() {
		//로컬 변수값으로 대입
		Vehicle localVar = new Vehicle() {
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};//->로컬 변수 선언과 초기값 대입
		
		//로컬변수 사용
		localVar.run();
	}

	void method2(Vehicle v) {
		v.run();
	}
}
