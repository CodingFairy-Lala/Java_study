package sh.java.oop.constructor;

import java.time.LocalDate;

/**
 * 생성자 메소드
 * - 객체 생성시에 new 연산자를 통해 호출하는 메소드.
 * - 객체의 필드값 초기화 처리를 할 수 있음.
 * - 클래스명과 생성자명은 똑같아야 한다.
 * - 리턴타입이 없어야 한다.
 * 
 * - JVM이 제공하는 기본생성자(매개변수 없음) 자동 생성가능
 * - 매개변수 있는 생성자를 하나라도 작성한다면 JVM은 기본생성자를 자동으로 만들어주지 않는다.
 * 		-> 직접 작성해야 한다.
 *
 * - 기본 생성자 / 모든 파라미터 생성자를 무조건 작성
 * 
 * 기본 생성자가 필요한 이유
 *	- 상속시 자식객체에서 부모 생성자를 호출함. 없으면 오류!
 *	- 웹서버 프로그램 사용자 기본 생성자를 호출해서 객체를 자동 생성함. 없으면 오류!
 *
 *
 */

public class User {

		// 필드
	private String userId;
	private String userPw;
	private String userName;
	private LocalDate createdAt;
	
		// 생성자
	public User() {
		System.out.println("User 생성자가 호출되었습니다.");
	}
	public User(String userId, String userPw) {
		this.userId = userId;
		this.userPw = userPw;
	}
	
	/**
	 * 다른 생성자 호출 this는 메소드 내에서 첫 줄에 단 한번만 가능하다.
	 * @param userId
	 * @param userPw
	 * @param userName
	 * @param createdAt
	 */
	
	public User(String userId, String userPw, String userName, LocalDate createdAt) {
		this(userId, userPw); // 다른 생성자 호출 - 첫 줄에 딱 한번만 쓸 수 있음
		this.userName = userName;
		this.createdAt = createdAt;
	}
	
	
	
		// 메소드
	public String userInfo() {
		return "userId = " + userId + ", userPw = " + userPw + ", userName = " 
				+ userName + ", createdAt = " + createdAt;
	}
	
	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return this.userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public LocalDate getCreatedAt() {
		return this.createdAt;
	}
	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
	
}
