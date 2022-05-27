package chapter02;

public class FloatDoubleExample {
	public static void main(String[] args) {
		//정수는 int 타입으로 간주해서 long은 L을 붙여야
		
		int a = 100000000;
		long l = 10000000000L; //소문자는 1이랑 헷갈리니까 대문자L로
		
		System.out.println(a);
		System.out.println(l);
		
		//소수는 double타입으로 간주해서 float는 f를 붙여야
		float var1 = 3.14f; 
		double var2 = 3.14;
		
		float var4 = 0.1234567890123456789f; //소수점 7자리까지만 정확하게 (딱 7자리까지 출력한다는 뜻x)
		double var5 = 0.1234567890123456789; //소수점 15자리까지만 정확하게 (딱 15자리까지 출력한다는 뜻x)
		
		System.out.println(var4);
		System.out.println(var5);
		
		// 수학 지수 (exponential)
		double var6 = 3e6; //3x10^6 3000000
		double var8 = 2e-3; //2x10^-3 0.002
	}
}
