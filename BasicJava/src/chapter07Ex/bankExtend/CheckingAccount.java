package chapter07Ex.bankExtend;

public class CheckingAccount extends BankAccount {
	private SavingsAccount protectedBy;
	
	
	public CheckingAccount(int balance) {
		super(balance);
	}
	
	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}
	/**
	 * 만약 체크카드에 10000원, 저축계좌에 50000원 있다고 가정
	 * 물건이 35000 구매
	 * 35000 - 10000  = 25000원을 저축에서 출금
	 * 체크는 0원
	 */
	@Override
	public boolean withdraw(int amount) {
		if(balance-amount >= 0) {  //첫번째 뱅크문제의 withdraw와 같은 내용
			balance -= amount; //==super.withdraw(amount)
			return true; 
		} //else 잔액-인출액amount가 0보다 작을때 == 잔액보다 인출액이 클 때 (ex) S계좌 잔액:2000 / C계좌 잔액:1000 / 인출액: 1400
		int excess = amount - balance; //초과금 = 인출액 - 잔액 (ex) 400 = 1400 - 1000
		balance -= amount - excess; // C계좌 잔액에서 (인출액-초과금)할 출금    (ex)인출액-초과금 1400-400
		protectedBy.balance -= excess; // 초과금은 S계좌 잔액에서 초과금만큼 출금 (ex) 2000-400
		return false; //false를 반환
	} //너무 복잡하게 썼넹
	
	/**case 1.
	 * if(amount>balance) {
	 * 	protectedBy.withdraw(amount - balance); =>초과금을 S계좌에서 출금
	 * 	balance  = 0; => 초과금이 생기는 이유가 C계좌의 잔액보다 출금액이 큰거니까 C계좌 잔액은 항상 0이 됨
	 * }else {
	 * 	super.withdraw(amount);
	 * }
	 * return true; //항상트루
	 * 
	 * case.2
	 * if(amount>balance) {
	 * 	protectedBy.withdraw(amount - balance); =>초과금을 S계좌에서 출금
	 * 	balance  = 0; => 초과금이 생기는 이유가 C계좌의 잔액보다 출금액이 큰거니까 C계좌 잔액은 항상 0이 됨
	 * 	return true;
	 * }
	 * return super.withdraw(amount); //잔액이 더 크면 부모의 출금실행
	 * 
	 * 
	 * 보통은 true와 false의 결과가 명시되어있지만 지금은 참인 값만 반환하면 되니까 true만 있음
	 */

}
