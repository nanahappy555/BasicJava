package chapter05;

import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null; 
		//배열은 크기를 정하면 바꿀 수 없으니까
		//나중에 입력받은 값으로 배열을 만들기 위해 우선 선언&null로 초기화만해둠
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt(); //Q.자꾸오류나서 고쳤는데 스캐너는 nextLine으로 통일해야하나?
												// A. 스캐너의 타입은 숫자든 문자든 계속 통일되어야함 (오류남..)
												//섞여있으면 다 문자로 받고 문자->숫자로 캐스팅
			
			if (selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for(int i = 0; i<scores.length; i++) { //i<studentNum;으로 써도 됨
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();	
				}
			} else if (selectNo == 3) {
				for(int i = 0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);					
				}
			} else if (selectNo == 4) {
				int max = 0; //점수는 음수가 될 수 없으니까 0으로 초기화해도 됨
				int sum = 0;
				double avg = 0.0;
				
				for(int i = 0; i<scores.length; i++) {
					if(max<scores[i]) {
						max = scores[i];
					}
					sum+= scores[i];
				}
				avg = (double)sum / scores.length;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
			} else if (selectNo == 5) {
				run = false;
			}					
		}
		
		System.out.println("프로그램 종료");
	}
}
