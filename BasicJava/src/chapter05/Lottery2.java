package chapter05;

import java.util.Arrays;
import java.util.Random;

public class Lottery2 {
	public static void main(String[] args) {
	/* 1. 1~45까지 배열 생성
	 * 2. 배열 안의 숫자 셔플
	 * 3. 앞에서부터 6개만 출력
	 */
	Random random = new Random();
	
	int[] lottos = new int[45];
	for(int i = 0; i<45; i++) {
		lottos[i] = i+1;
	}
	
	//셔플
	for(int i = 0; i<lottos.length; i++) {
		int j = random.nextInt(45); 
	//  int j = random.nextInt(45) + 1;
	//  index값을 뽑는거라서 0~44까지 뽑아야함 (45)+1로 해서 length값을 넘어가서 ArrayIndexOutOfBoundsException예외가 나옴
			int temp = lottos[i];
			lottos[i] = lottos[j];
			lottos[j] = temp;
	}
	
	for(int i = 0; i<6; i++) {
		System.out.println("lottery number: " + lottos[i]);	 //앞에서부터 6개 숫자 출력
	}
	System.out.println(Arrays.toString(lottos)); //전체 배열 출력
	System.out.println(Arrays.stream(lottos).distinct().count()); //중복을 제외한 숫자 갯수
	
	}
}
