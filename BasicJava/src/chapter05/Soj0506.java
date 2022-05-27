package chapter05;

public class Soj0506 {
	public static void main(String[] args) {
		int[] coinUnit = { 500, 100, 50, 10 };
		
		int money = 2680;
		System.out.println("money=" + money);
		
		for(int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원: " + money / coinUnit[i]); //동전갯수
			 money = money % coinUnit[i]; //잔액
			 
		}
	}
}
