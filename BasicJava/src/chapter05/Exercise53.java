package chapter05;

import java.util.Random;
import java.util.Scanner;

public class Exercise53 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("가위 바위 보를 입력하세요: ");
		String gamer = scanner.next();
		System.out.println("게이머: " + gamer);
		
		//선생님 풀이 간단
		String[] coms = {"가위", "바위", "보"};
		String com = coms[random.nextInt(3)];
		
		//int[] coms = { 0, 1, 2 };
		//int i = random.nextInt(3); //0~2 배열의 인덱스값과 같음
		
		//String com = "";
		///if(coms[i] == 0) {
		//	com = "가위";
		//} else if(coms[i] == 1) {
		//	com = "바위";
		//} else if(coms[i] == 2) {
		//	com = "보";
		//}

		System.out.println("인공지능 컴퓨터: " + com);
		
		String result = "";
		if(gamer.equals(com)) {
			result = "무승부";
		} else if (gamer.equals("가위") && com.equals("바위")
				||gamer.equals("바위") && com.equals("보")
				||gamer.equals("보") && com.equals("가위")) {
			result = "컴퓨터 승리!";
		} else {
			result = "게이머 승리!";
		}
		System.out.println("결과: " + result);
	}
}
