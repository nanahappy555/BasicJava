package chapter07Ex;

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

	public String toString() {
		return "도형의 종류: 원, 둘레: " + perimeter() + "cm, 넓이: " + area() + "cm^2";
	}
}
