package chapter02;

public class Exercise22 {
	public static void main(String[] args) {
		
		double distance = 40e12;
		double speed = 300000;
		// 3_0_0_0_0_0 or 300_000 이런식으로 적어도 결과에는 영향가지 않아서 읽기 편리
		
		double time = distance / (speed * 365 * 24 * 60 * 60);
		// distance / speed 는 초단위라서 /60*60*24*365를 하면 연 단위가 됨
		
		
		System.out.println("빛의 속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은 " + time + "광년이다.");
	}
}
