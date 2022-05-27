package chapter06;

public class Car12 {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		Car12 myCar = new Car12();
		myCar.speed = 60;
		myCar.run();
	}
}
