package chapter07;
//323~324예제
public class SportsCar extends Car {
	@Override
	public void speedUp() { speed += 10; }
	
//	@Override
////	public final void stop() {
//		System.out.println("스포츠카를 멈춤"); //부모Car클래스의 메소드stop()은 final클래스라 재정의할 수 없음
//		speed = 0;
//	}
}
