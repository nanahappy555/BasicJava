package chapter06;

// Value Object(VO : 값을 가지고 있는 객체)
// Data Transfer Object(DTO: 데이터를 운반해주는 객체)
public class Lprod {
	private int lpordId;
	private String lprodGu;
	private String lprodNm;
	//private로 바꾸는 대신 메소드를 호출하는 방식으로 바꿈
	
	//lpordId를 가져오는 메소드. 읽기 Getter
	public int getLprodId() {
		return lpordId;
	}
	//쓰기.셋팅 Setter
	public void setLprodId(int lprodId) {
		this.lpordId = lprodId;
	}
	
	//읽기 getter
	public String getLprodGu() {
		return lprodGu;
	}
	//쓰기.셋팅 setter
	public void setLprodGu() {
		this.lprodGu = lprodGu;
	}
	
	
	//읽기
	public String getLprodNm() {
		return lprodGu;
	}
	//쓰기.셋팅
	public void setLprodNm() {
		this.lprodNm = lprodNm;
	}
}
