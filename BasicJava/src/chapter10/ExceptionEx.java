package chapter10;

public class ExceptionEx {
	public static void main(String[] args) throws Exception { //메인메소드를 호출하는 놈한테 에러를 던짐
		//1.일반예외
		Class.forName("java.lang.String");
		//2.실행예외
		int[] nums = new int[5];
		nums[10] = 100;
		//이클립스상에서 빨간줄은 뜨지 않지만 실행했을때 에러가 나옴
		//nums배열은 길이가 5라서 인덱스값 10은 에러
		
		//throw명령어
		throw new RuntimeException("내가만든에러"); //개발자가 직접 에러를 발생시킴
	}
}
