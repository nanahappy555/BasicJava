package chapter11;

public class WrapperExample {
	public static void main(String[] args) {
		int age1 = 10;
		int age2 = 20;
		int result = age2 - age1; //기본타입은 연산자로 계산
		String a = "abc";
		String b = "def";
		String result2 = b - a; //참조타입은 연산자를 사용할 수 없음
		//def에서 abc를 제거한다는 건 안될까?
		//메소드를 이용해서 원하는 데이터를 가공
		
		Integer integer = new Integer(10); //boxing
		int value = integer.intValue(); //unboxing
		Integer sum = 0;
		for(int i = 0; i<=100; i++) {
			sum+=i; //sum = sum + i; =>언박싱
			//sum을 int타입으로 언박싱
			//sum+i의 결과를 다시 박싱해서 sum에 대입
		}
		System.out.println(sum);
	}
}
