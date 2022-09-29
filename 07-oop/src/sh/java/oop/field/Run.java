package sh.java.oop.field;

public class Run {

	public static void main(String[] args) {
		IPhone14 phone1 = new IPhone14();
		phone1.setOwner("홍길동"); // 호출부 - 매개인자
		phone1.setNumber("01000000000");
		System.out.println(phone1.info());
		
		IPhone14 phone2 = new IPhone14();
		phone2.setOwner("신사임당");
		phone2.setNumber("010012341234");
		System.out.println(phone2.info());
		phone1.callTo(phone2); // 홍길동이 신사임당에게 전화를 겁니다.

		/**
		 * @실습문제 : 내 전화기객체 생성
		 * 장해라가 홍길동에게 전화를 겁니다.
		 * 홍길동이 장해라에게 전화를 겁니다.
		 */
		
		IPhone14 phone3 = new IPhone14();
		phone3.setOwner("장해라");
		phone3.setNumber("01095559254");
		phone3.callTo(phone1);
		phone1.callTo(phone3);
		
		// static변수 사용법
		System.out.println("아이폰14의 너비는 " + IPhone14.WIDTH + "cm입니다.");
		System.out.println("아이폰14의 높이는 " + IPhone14.HEIGHT + "cm입니다.");
		
	}
}
