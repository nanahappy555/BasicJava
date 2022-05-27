package chapter07.tire;

import java.util.concurrent.atomic.DoubleAccumulator;

public class Tire {
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	public Tire(String loaction, int maxRotation) {
		this.location = loaction;
		this.maxRotation = maxRotation;
	}
	
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}
