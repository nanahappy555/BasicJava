package chapter06.package1;

public class A {

	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	public A(boolean b) {} //퍼블릭 접근 제한. 모든 패키지에서 제한x
	A(int b) {}				//디폴트 접근 제한. 같은 패키지에서만 제한x
	private A(String s) {} //프라이빗 접근 제한. 모든 패키지 호출x
}
