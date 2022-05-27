package chapter08Ex.Book;

public abstract class Book {
	private int number; // 관리번호
	private String title; // 책의 제목
	private String author; // 책의 저자
	private static int countOfBooks; // 만들어진 Book 객체 개수

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		number = ++countOfBooks;
		// 문제가 약간 잘못됨 1번부터 나와야하니까 증가를 먼저함
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public abstract int getLateFee(int a);

	// Object : 최상위클래스. 모든 클래스는 Object를 상속받음. Object타입에는 모든 타입이 올 수 있음
	@Override //오버라이드는 타입과 이름이 같아야해서 equals(Book o) 이렇게 바꾸면 안됨. 무조건 Object
	public boolean equals(Object obj) { 
      if (!(obj instanceof Book)) {
         return false;
      }					
      if (title.equals(((Book) obj).title) && author.equals(((Book) obj).author)) {
    	//Object 타입의 obj를 Book타입으로 캐스팅(obj는 BookTest클래스에서 new Book으로 생성했기 때문에 Book클래스로 캐스팅가능
    	//Book으로 캐스팅한 인스턴스 ob의 필드 title을 가져옴
    	//Object타입이면 Object의 필드를 가져옴. (메소드는 인스턴스의 타입)
    	//Book타입이면 Book의 필드를 가져옴.
         return true;
      } else { 
         return false;
      }
//		내가 쓴 코드
//		if(this == obj) { //new생성자로 생성 안했으면 리터럴로 값을 넣어주기 때문에 true로 나옴
//			
//		} return true; //if문 밖에 true를 써서 조건문과 상관없이 true가 나옴
	}

	@Override
	public int hashCode() {
		return 0;
	}

	@Override
	public String toString() {
		return String.format("관리번호: %d, 제목: %s, 작가: %s(일주일 연체료: %,d원)", getNumber(), title, author, getLateFee(7));
	}

}
