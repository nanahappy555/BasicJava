package chapter03;

import java.util.Scanner;

public class Page129Q09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//입력    									 "abc" => abc(x) 숫자로x
		System.out.print("첫 번째 수: ");				//123 => "123"(o)
		String num1 = scanner.next();
		
		System.out.print("두 번째 수: ");
		String num2 = scanner.next();
		
		//처리
		//double result1 = Double.parseDouble(num1) / Double.parseDouble(num2);
		//String result2 = (num2=="0" || num2=="0.0")? "무한대" : String.valueOf(result1);
		//double first = Double.parseDouble(num1)
		//double second = Double.parseDouble(num2)
		//String result = (second==0 || second==0.0)? "무한대" : String.valueOf(first/second);
		
		
		//출력
		System.out.println("------------------");
		//System.out.println("결과: " + result2);
		
	}
}