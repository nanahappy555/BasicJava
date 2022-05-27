package chapter10Ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		while (true) {
			try {
				//입력
				System.out.print("어떤 수를 나누시겠습니까?>>");
				int dividend = scanner.nextInt();
				System.out.print("어떤 수로 나누시겠습니까?>>");
				int divisor = scanner.nextInt();
				
				//처리
				int result = dividend / divisor;
				
				//출력
				System.out.printf("%d/%d = %d", dividend, divisor, result);
				
				break;
				
			} catch (InputMismatchException e) {
				// 무슨값을출력할지
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
				scanner.next();
			} catch (ArithmeticException e) {
				// 무슨값을출력할지
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
			}
		}
	}
}
