package chapter03;

public class SoJ03 {
	public static void main(String[] args) {
		/*
		//내가 푼 거
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = (numOfApples%sizeOfBucket == 0)? numOfApples/sizeOfBucket : numOfApples/sizeOfBucket+1;
		
		System.out.println("필요한 바구니의 수 :" + numOfBucket);  
		*/
		
		/*
		//해설
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = (numOfApples / sizeOfBucket) + ((numOfApples % sizeOfBucket > 0) ? 1 : 0); //(사과/바구니) + (사과%바구니>0)? 1 : 0)
																									// 사과/바구니의 나머지가 0보다 크면 1을 더하고 아니면 0을 더함 =>내가쓴거랑같음!
		
		System.out.println("필요한 바구니의 수 :" + numOfBucket);  
		
		/*
		int num = 10;
		System.out.println((num>0)? "양수" : ((num<0)? "음수" : "0")); // Q. 결과 변수 따로 쓰고 출력은 결과만 하는게 깔끔!!!!!!!!!
		*/
		
		/*
		int num = 456;
		System.out.println(num / 100 * 100);
		*/
		
		/*
		int num = 333;
		System.out.println(num / 10 * 10 + 1);
		*/
		
		/*
		int num = 24;
		System.out.println( ((num / 10 + 1) * 10) - num); // A. 10 - num%10
		*/
		
		/*
		char ch = 'z';
		boolean b = ( ( (ch>=65 && ch<=90) || (ch>=97 && ch<=122) ) || (ch>=48 && ch<=57) )? true : false;
		
		A. boolean b = ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z') || ('0' <= ch && ch <= '9');
			boolean 타입이라 true, false를 쓸 필요가....
		
		System.out.println(b);
		*/
		
		
		/*
		char ch = 'A';
		
		char lowerCase = (ch>=65 && ch<=90) ? (char)(ch+32) : ch;
		
		System.out.println("ch:" + ch);
		System.out.println("ch to lowerCase:" + lowerCase);
		*/
		
		/*
		float var1= 10f;
		double var2= (double)var1 / 100;
		if(var2 == 0.1) {
			System.out.println("10%입니다.");
		} else {
			System.out.println("10%가 아닙니다.");
		}
		*/
	}
}
