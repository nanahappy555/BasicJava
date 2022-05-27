package chapter06;

public class LClass {
	String name = null;
	int age = 0;
	String nation = null;
	int ssn = 0;

		public LClass() { //1. 매개변수가 없는 기본생성자 default
			this(null, 0, null, 0);   // 클래스의 다른 생성자 호출
		}
		public LClass(String name) { 
			this(name, 0, null, 0);
		}

		public LClass(String name, int age) { 
			this(name, age, null, 0);//여기 있는 this는 맨 밑에 있는 Member의 this
		}

		public LClass(String name, int age, String nation) { 
			this(name,age, nation, 0); //여기 있는 this는 밑에 있는 Member의 this
		}

		public LClass(String name, int age, String nation, int ssn) { 
			this.name = name;
			this.age = age;
			this.nation = nation;
			this.ssn = ssn;
			System.out.println("Member가 만들어졌어요");
		}
}
