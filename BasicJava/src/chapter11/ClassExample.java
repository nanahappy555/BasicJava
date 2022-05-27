package chapter11;

import chapter07.Student;

public class ClassExample {
	public static void main(String[] args) {
		try {
			Class sClass = Class.forName("chapter07.Student");
			new Student().getClass();
			Class class1 = 
			
			System.out.println(sClass.getName());
			System.out.println(sClass.getSimpleName());
			System.out.println(sClass.isInterface());
			
			System.out.println("메소드 개수: " + sClass.getMethods().length);
			System.out.println("필드 개수: " + sClass.getFields().length); //상속된거포함
			System.out.println("필드 개수: " + sClass.getDeclaredFields().length); //본인것만
//			for (Field field = )
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
