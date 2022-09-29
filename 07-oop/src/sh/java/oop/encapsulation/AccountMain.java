package sh.java.oop.encapsulation;

	/**
	 * 캡슐화 원칙
	 * 1. 모든 필드의 접근 제한자를 private 지정
	 * 2. 필드와 메소드를 클래스 내부에 함께 작성
	 * 3. 필드를 제어하는 메소드의 접근제한자를 public 지정
	 * 
	 * 캡슐화 적용 전의 객체 필드 접근 방식은 보안적으로 위험하다.
	 * -  클라이언트 코드 작성시 실수나 악의적 행동을 방지할 수 없다.
	 * 
	 *
	 */

public class AccountMain {

	public static void main(String[] args) {
		Account acc = new Account();
//		acc.name = "홍길동";
//		acc.balance = 1_000_000;
		acc.setName("홍길동");
		acc.setBalance(1_000_000);
		acc.status();
		
//		// 입금
//		acc.balance += 500_000;
//		System.out.printf("[%s]님의 현재 잔액은 [%d]입니다.\n", acc.name, acc.balance);
		acc.deposit(500_000);
		acc.deposit(-500_000);  // 입금액이 음수인 경우 입금 실패 해야한다.
		acc.status();
		
//		// 출금
//		acc.balance -= 700_000;
//		System.out.printf("[%s]님의 현재 잔액은 [%d]입니다.\n", acc.name, acc.balance);
		acc.withdraw(700_000);
		acc.withdraw(-700_000);   // 출금액이 음수인 경우 출금 실패 해야한다.
		acc.withdraw(1_000_000);  // 출금액이 잔액보다 많은 경우, 출금 실패해야 한다.
		acc.status();
		
		System.out.println(acc.getName());
		System.out.println(acc.getBalance());
		
	}
}
