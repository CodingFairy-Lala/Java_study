package sh.java.oop.field;

/**
 * 전역변수 : 클래스 영역에 작성
 * 	- 여러 메소드에서 사용 가능
 *  - Class Variable 클래스 변수 / static변수
 *  	static 키워드가 있다. 공유의 목적이 있음.
 *  	클래스당 하나만 선언한다.
 *  	클래스명.클래스변수 (객체를 통해 접근하지 않는다.)
 *  
 *  - Instance Variable 인스턴스 변수 / non-static변수 / 멤버변수
 *  	static 키워드가 없다.
 *  	생성된 객체(instance)마다 선언한다.
 *  	객체참조변수.필드명
 *  
 * 
 * 지역변수 : 메소드 영역에 작성 (매개변수도 지역변수다)
 *  - 메소드 내부에서만 사용 가능
 *  
 *  변수별 생명주기 Life Cycle
 *	- 지역변수 : 메소드 호출시 생성 ~ 메소드 리턴시 제거
 *  - 인스턴스변수 : 객체 생성시 생성 ~ 객체 제거시 제거 (객체는 GC가 지움)
 *  - 클래스변수 : 해당 클래스 최초 사용시 생성 ~ 프로그램 종료시 제거
 *
 */

public class IPhone14 {
	
	// 클래스 변수x
	public static final double WIDTH = 5.7;
	public static final double HEIGHT = 17.3;
	
	// 인스턴스 변수
	private String owner;
	private String number;
	
	// getter / setter
	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {  // 선언부 - 매개변수
		this.owner = owner;
	}
	
	public String getNumber() {
		return this.number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String info() {
		return "[" + this.owner + "]님의 아이폰입니다. 전화번호는 [" +this.number+ "]입니다.";
	}
	
	public void callTo(IPhone14 other) {
		String from = this.owner; // refactoring!
		String to = other.owner;
		System.out.printf("%s이 %s에게 전화를 겁니다.\n", from, to);
	}
	
	
}
