package chapter04;

import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		//옛날 랜덤 공식			마지막숫자 - 처음숫자 + 1
		//	(int)(Math.random() * (추출할 숫자)) + 처음 숫자;
		
		//앞으로는 이걸로 쓰세요
		Random random = new Random(80); //new Random(seed);
		// 80 랜덤을 만들때 seed숫자임
		//80을 넣으면 80에 해당하는 랜덤.100을 넣으면 100에 해당하는 랜덤 
		//숫자를 안 쓰면, 명령이 실행되는 시각에 해당하는 seed값이 자동으로 들어감
		//근데 시각이 초단위가 아닌 나노초 1/10^9
		
		//random.nextInt(6); // 0부터 5까지 추출만. 출력x
		System.out.println(random.nextInt(6)); //
		System.out.println(random.nextInt(6));
		System.out.println(random.nextInt(6));
		System.out.println(random.nextInt(6));
		System.out.println(random.nextInt(6));
		System.out.println(random.nextInt(6));
		System.out.println(random.nextInt(6));
		System.out.println(random.nextInt(6));
		System.out.println(random.nextInt(6));
		System.out.println(random.nextInt(6));
		System.out.println(random.nextInt(6));
	}
}
