package chapter05;

import java.util.Arrays;

public class Soj0504 {
	public static void main(String[] args) {
	 int[][] arr = {
			 {5,5,5,5,5},
			 {10,10,10,10,10},
			 {20,20,20,20,20},
			 {30,30,30,30,30}
	 };
	
	 int total = 0;
	 double avg = 0.0;
	
	 for(int i=0; i<arr.length; i++) {
		 for(int k=0; k<arr[i].length; k++) {
			 total += arr[i][k];
		 }
	 }
	
	 avg = (double)total / (arr.length * arr[0].length);
	
	 System.out.println("total=" + total);
	 System.out.println("avg=" + avg);
	}
}
