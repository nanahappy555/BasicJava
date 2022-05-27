package chapter05;

public class Exercise51 {
	public static void main(String[] args) {
		int[] arr = { 38, 94, 16, 3, 76, 94, 82, 47, 59, 8 };
		
		int max = Integer.MAX_VALUE; //int타입의 최댓값
		int min = Integer.MIN_VALUE; //int타입의 최솟값
		
		for(int i = 0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i]; 
			}
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.printf("max : %d \n", max);
		System.out.printf("min : %d \n", min);
	}
}
