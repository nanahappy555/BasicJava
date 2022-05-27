package chapter06Ex;

public class Circle {
	double radius; //필드가 private라서 필드값을 얻기 위해 getter setter가 있는것
	double x;
	double y;

	public double getRadius() { //getter는 필드값을 리턴해줘야해서 리턴타입
		return radius;
	}

	public void setRadius(double radius) { //setter는 void (return할 필요가 없음
		//if (radius < 0) {
		//	this.radius = 0;
		//} else {
		//	this.radius = radius;
		//}
		if(radius > 0) {
			this.radius = radius; //radius는 원래 0이라 0보다 작을 때 굳이 0을 셋팅할 필요가 없다
		}
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getArea() {
		//double area = radius * radius * Math.PI;
		//return area;
		return radius * radius * Math.PI;
	}
}