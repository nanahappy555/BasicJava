package chapter06Ex;

public class NewCar {
	private double speed;
	private String color;
	private static final double MAX_SPEED = killoToMile(200.0) ;
	
	public NewCar() {
	}
	
	public NewCar(String color) {
		this.color = color;
	}
	
	
	public double getSpeed() {
		return mileToKillo(speed);
	}
	
	public void setSpeed(double speed) {
		this.speed =killoToMile(speed);
	}
	
	public String getColor() {
		return color;
	}
	
	public void setSpeed(String color) {
		this.color = color;
	}
	
	public boolean speedUp(double speed) {
		speed = killoToMile(speed);
		if(this.speed+speed >= 0 && this.speed+speed <= MAX_SPEED) {
			this.speed += speed; 
			return true;
		}
		return false;
	}
	
	public static double getMaxSpeed() {
		return mileToKillo(MAX_SPEED);
	}
	
	private static double killoToMile(double distance) {
		return distance / 1.6;
	}
	
	private static double mileToKillo(double distance) {
		return distance * 1.6;
	}
}
