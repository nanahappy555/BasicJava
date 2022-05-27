package chapter02;

import java.util.Scanner;

public class Exercise21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//입력부분(input)
		System.out.print("가로의 길이는?(단위는: m): ");
		double width = scanner.nextDouble();
		
		System.out.print("세로의 길이는?(단위는: m): ");
		double height = scanner.nextDouble();
		
		//데이터 처리부분(processing data)
		double area = width * height;
		double perimeter = (width + height) * 2;
		
		//출력부분(output)
		System.out.println("직사각형의 넓이: " + area);
		System.out.println("직사각형의 둘레: " + perimeter);
	}
}
