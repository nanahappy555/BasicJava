package chapter11;

public class ByteToStringExample {
	public static void main(String[] args) {
		// byte배열
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 }; // 0~10, length 11

		String str1 = new String(bytes); // bytes를 String으로 변환해서 String타입 str1에 주소값저장
		System.out.println(str1); // str1 출력

		String str2 = new String(bytes, 6, 4); // bytes배열을,6번째 인덱스(74부터), 4개
		System.out.println(str2);

		// verify.exam06
		byte[] bytes2 = { 73, 32, 108, 111, 118, 101, 32, 121, 111, 117 };
		String str = new String(bytes2);
		System.out.println(str);
	}
}
