package chapter10;
import java.util.InputMismatchException;

import java.util.Scanner;

public class Exam8_8 {

	public static void main(String[] args) {

		int result=(int) (Math.random()*100)+1;

		int guess=0, cnt=0;

		do{

			cnt++;

			System.out.print("1과 100사이의 값을 입력하세요 :");

			

			try{

				guess=new Scanner(System.in).nextInt();

       // Scanner클래스를 새로생성해서 다시 입력받도록 함

			}catch(InputMismatchException e){

				System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");

				continue;    // 밑에 로직을 실행하지 않고 다시 loop를 돌도록 continue;

			}



			if(guess>result){

				System.out.println("더 작은 수를 입력하세요.");

			}else if(guess<result){

				System.out.println("더 큰 수를 입력하세요.");

			}else{

				System.out.println("맞췄습니다.");

				System.out.println("시도횟수는 "+cnt+"번입니다.");

				break;    // break로 loop를 끝냄

			}

		}while(true);

	}

}



