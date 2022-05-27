package chapter05;

public class Soj0507 {
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("USAGE: java Soj0507 3120");
			System.exit(0);
		}
		
		//문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외발생
		int money = Integer.parseInt(args[0]);
		
		System.out.println("money=" + money);
		
		int[] coinUnit = { 500, 100, 50, 10 }; //동전단위
		int[] coin = { 5, 5, 5, 5 }; //단위별 동전갯수
		
		
		for(int i = 0; i < coinUnit.length; i++) {
			int coinNum = 0;
			//1.금액을 동전단위로 나눠서 필요한 동전개수 구하기
			//System.out.println(coinUnit[i] + "원: " + money / coinUnit[i]);//동전갯수출력
			//money = money % coinUnit[i]; //잔액갱신
			coinNum = money / coinUnit[i]; //필요한 동전갯수
			if(coin[i] >= coinNum) {
				coin[i] -= coinNum;
			} else {
				coinNum = coin[i];
				coin[i] = 0;
			}
			money -= coinNum * coinUnit[i];
			
			//if(coin[i] >0) {
			//	coin[i] -= coinNum;
			//} else {
		//		break;
		//	}
		//money -= coinNum * coinUnit[i];
			
		//	System.out.println(coinUnit[i] + "원: " + coinNum);
		}
		
		if(money > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0);
		}
		
		System.out.println("=남은 동전의 개수 =");
		
		for(int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원: " + coin[i]);
		}
	}
}
