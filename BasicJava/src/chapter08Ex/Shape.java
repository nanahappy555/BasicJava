package chapter08Ex;

public abstract class Shape implements Comparable<Shape> {
	//Shape와 <Shape>를 비교
	
	public abstract double area(); //추상메소드
	public abstract double perimeter(); //추상메소드
	
	@Override
	public int compareTo(Shape o) {
		if (area() > o.area()) {
			return 1;
		} else if (area() < o.area()) {
			return -1;
		} else {
			return 0;
		}
	}
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return String.format("종류: , 둘레: %.2fcm, 넓이: %.2fcm^2", perimeter(), area());
//	} shpae에서 toString을 만들고 자식클래스들은 그대로 받아쓰게하고 종류만 반환하게 getClass()메소드
}
