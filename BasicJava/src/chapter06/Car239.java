package chapter06;

public class Car239 {

	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car239() {
		
	}
	
	Car239(String model) {
		this.model = model;
	}
	
	Car239(String model, String color) {
		this.model = model; // this:메모리에 올라간 자기자신
		this.color = color;
	}
	
	Car239(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
