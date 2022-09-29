package sh.java.oop.constructor;

import java.time.LocalDate;

public class UserMain {

	public static void main(String[] args) {
		// 기본 생성자 + setter
		User user = new User();
		user.setUserId("sinsa");
		user.setUserPw("1234");
		user.setUserName("신사임당");
		user.setCreatedAt(LocalDate.now());
		System.out.println(user.userInfo());
		
		// 모든 파라미터 생성자를 이용
		User user2 = new User("honggd", "1234", "홍길동", LocalDate.now());
		System.out.println(user2.userInfo());

		User user3 = new User("blossom", "1234");
		System.out.println(user3.userInfo());

	}
}
 