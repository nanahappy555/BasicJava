package chapter11;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH:mm:ss z");
		String string = format.format(date);
		System.out.println(string);
		
		LocalDateTime now = LocalDateTime.now(); //현재시간
		System.out.println(now);
		
		//LocalDateTime 시간까지, LocalDate 날짜만
		String now2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh:mm:ss"));
		System.out.println(now2);
		String now3 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh:mm:ss"));
		System.out.println(now3);
	}
}
