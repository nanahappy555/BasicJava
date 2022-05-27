package chapter02;

import java.util.Scanner;

public class Page99Q03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("1. 이름: " );
		String name = scanner.next();
		
		System.out.print("2. 주민번호 앞 6자리: ");
		int intNum1 = scanner.nextInt();
		
		System.out.print("3. 전화번호: ");
		String phoneNum1 = scanner.next();
		
		System.out.println();
		
		System.out.println("[입력한 내용]");
		System.out.println("1. 이름: " + name);
		System.out.printf("2. 주민번호 앞 6자리: %6d\n", intNum1);
		System.out.printf("3. 전화번호: %s\n", phoneNum1);
		
	}
}
