package chapter02;

import java.util.Scanner;

public class InputExample {
	public static void main(String[] args) {
		// Quick Fix (Ctrl + 1)
		
		Scanner scanner = new Scanner(System.in);
		/*
		scanner.nextLine(); //문자를 입력받기(엔터가 입력된 부분까지) a b(엔터) -> a b
		scanner.next(); //문자를 입력받기(공백 또는 엔터가 입력된 부분까지) a b(엔터) -> a(엔터)
		scanner.nextInt(); //정수를 입력받기
		scanner.nextDouble(); //실수를 입력받기
		*/
		
		System.out.print("이름을 입력하세요: ");
		String name = scanner.next();
		
		System.out.print("나이를 입력하세요: ");
		
		int age = scanner.nextInt();
		System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "입니다.");
		System.out.println();
		System.out.printf("당신의 이름은 %s이고, 나이는 %d입니다.", name, age);
		
		System.out.printf("잔액: %0,20d\n", 100000);
		System.out.printf("잔액: %.2f\n", 10.12902);
		System.out.printf("%s-%s-%s", "010", "1234", "5678");
		
		/*
		System.out.print("직업을 입력하세요: ");
		String job = scanner.next();
		System.out.println("당신의 직업은 " + job + "입니다.");
		*/
	}
}
