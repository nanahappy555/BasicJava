package chapter08Ex;

public class Circle extends Shape{
	private double radius;
	
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return radius * radius * Math.PI;
	}
	
	@Override
	public double perimeter() {
		return 2 * radius * Math.PI;
	}

	@Override
	public String toString() {
		return String.format("종류: 원, 둘레: %.2fcm, 넓이: %.2fcm^2", perimeter(), area());
	}
}
