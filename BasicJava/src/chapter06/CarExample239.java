package chapter06;

public class CarExample239 {
	public static void main(String[] args) {
		Car239 car1 = new Car239();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		Car239 car2 = new Car239("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.modle : " + car2.model);
		System.out.println();
		
		Car239 car3 = new Car239("자가용", "빨강");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.dolor : " +  car3.color);
		System.out.println();
		
		Car239 car4 = new Car239();
		System.out.println("car4.company : "+ car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxspeed : " + car4.maxSpeed);
	}
}
