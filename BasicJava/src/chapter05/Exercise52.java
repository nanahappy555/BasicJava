package chapter05;

import java.util.Arrays;
import java.util.Random;

public class Exercise52 {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] lottos = new int[6];
		for(int i=0; i<lottos.length; i++) {
			lottos[i] = random.nextInt(45) + 1;	
			for (int j=0; j<i; j++) {
				if(lottos[i] == lottos[j]) {
					lottos[j] = random.nextInt(45) + 1;
					//i--; 두가지 방법 가능
					break;
				}
				
			}
			//System.out.println("lottery number: " + lottos[i]);				
			System.out.println(Arrays.toString(lottos));	//배열의 모든 요소 출력	 		
			System.out.println(Arrays.stream(lottos).distinct().count()); //중복되지않은숫자갯수				
		}		
	}
}
