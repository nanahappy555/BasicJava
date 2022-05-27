package chapter06Ex;

public class Plane {
	private String manufacture;
	private String model;
	private int maxNumberOfPassengers;
	private static int numberOfPlanes;
	
	
	public Plane() {
		this(null, null, 0); //이렇게도 쓴다
		numberOfPlanes++;
	}
	
	public Plane(String manufacture, String model, int maxNumberOfPassengers) {
		numberOfPlanes++;
		this.manufacture = manufacture;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfPassengers;
	}
	
	
	public String getManufacture() {
		return manufacture;
	}
	
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}
	
	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		if(maxNumberOfPassengers > 0) {			
			this.maxNumberOfPassengers = maxNumberOfPassengers;
		} //else {			
			//this.maxNumberOfPassengers = 0;
		//}
	}
	
	public static int getNumberOfPlanes() {
		return numberOfPlanes;
	}
	
}
