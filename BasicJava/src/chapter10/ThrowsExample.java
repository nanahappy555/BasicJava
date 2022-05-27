package chapter10;

public class ThrowsExample {
	public static void main(String[] args) {
		//throw명령어 개발자가 에러를 만들어 에러를 던진다
//		throw new Exception(); //새로운 에러를 던져라
		
		try {
			throw new Exception("내가 만든 에러"); //에러를 만들어서 
		} catch (Exception e) { //에러가 발생하면 에러를 던져라
			System.out.println(e.getMessage());
		}
	}
}
