package chapter07;
//330확인5번
public class Parent {
	public String naiton;
	
	public Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public Parent(String nation) {
		this.naiton = nation;
		System.out.println("Parent(String nation) call");
	}
}
