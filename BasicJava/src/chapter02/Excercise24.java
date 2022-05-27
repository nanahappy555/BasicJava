package chapter02;

import java.util.Scanner;

public class Excercise24 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//입력부분
		System.out.print("원기둥의 밑변의 반지름을 입력하시오.(단위: cm) ");
		double radius = scanner.nextDouble();
		
		System.out.print("원기둥의 높이를 입력하시오.(단위: cm) ");
		double heigth = scanner.nextDouble();
		//처리부분
		double result1 = Math.PI * radius * radius;
		double result2 = result1 * heigth;
		
		//출력부분
		System.out.println("원기둥의 밑변의 넓이는 " + result1 + "cm^2이고, 원기둥의 부피는 " + result2 + "cm^2이다.");
		
		
	}
}
