package chapter03;

import java.util.Scanner;

public class Exercise33 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("윤년인지를 확인할 연도를 입력하세요:");
		int year = scanner.nextInt();
		
		//String result = ( (year%4 == 0) && !(year%100 ==0))? "윤년입니다." : ( (year%400 == 0)? "윤년입니다." : "윤년이 아닙니다.");
		String result = ( ((year%4 == 0) && !(year%100 ==0)) || (year%400 == 0) )? "윤년입니다." : "윤년이 아닙니다.";
		System.out.println(year + "년은 " + result);
	}
}
