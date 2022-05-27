package chapter05;

import java.util.Random;

public class Exercise54 {
	public static void main(String[] args) {
		Random random = new Random();

		int[] result = new int[6];

		for(int i=0; i<=10_000; i++) {
			int dice = random.nextInt(6) + 1;
			switch (dice) {
			case 1:
				result[0]++;
				break;
			case 2:
				result[1]++;
				break;
			case 3:
				result[2]++;
				break;
			case 4:
				result[3]++;
				break;
			case 5:
				result[4]++;
				break;
			case 6:
				result[5]++;
				break;
			}
		}	
		System.out.println("-------------");
		System.out.println("면       빈도");
		System.out.println("-------------");
		System.out.printf("1       %d \n", result[0]);
		System.out.printf("2       %d \n", result[1]);
		System.out.printf("3       %d \n", result[2]);
		System.out.printf("4       %d \n", result[3]);
		System.out.printf("5       %d \n", result[4]);
		System.out.printf("6       %d \n", result[5]);
	}
}