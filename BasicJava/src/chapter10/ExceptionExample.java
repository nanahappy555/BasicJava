package chapter10;

public class ExceptionExample {
	public static void main(String[] args) {
		//1. 일반 예외(Compiletime Exception)
		
		
		try {
			Class.forName("java.lang.Stirng");
		} catch (ClassNotFoundException e) { //에러가 발생했을때만 캐치해서 출력 => 어디에 문제가 생겼는지 확인하고 수정가능
//			e.printStackTrace();
		} //""안에 있는 클래스 파일을 메모리에 올림
		//문법적으로는 문제가 없으나 에러가 남
		//->컴파일 전에 해결하라고 빨간줄 뜸
		//예외처리를 위한 방법제시

		
		//2. 실행 예외(Runtime Exception)
		try {
			Class.forName("java.lang.String");
			int[] numbers = new int[5];
			numbers[10] = 100;
		//컴파일 할 때는 에러가 안 나는데 실행을 하면 에러가 남
		} catch (ClassNotFoundException e) {
			System.err.println("배열 갯수가 잘못됐습니다.");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("배열 갯수가 잘못됐습니다.");
		} finally { //catch가 끝나면 실행되도록
			System.out.println("프로그램 종료");
		}
	}
}
