package sh.java.oop.student;

public class StudentMain {

	/**
	 * OOP(객체)란 ? 
	 * - 클래스를 바탕으로 new연산자를 사용해 메모리에 적재된 결과물.
	 * 
	 * - 상태 : 정적인 값. field (이름, 나이, 키, 몸무게, 아이디, 비밀번호, 주소 ...)
	 * - 행위 : 동적인 처리를 담당. method (회원가입, 로그인, 상품주문, 정보설정, 정보 가져오기...)
	 * 
	 * 하나의 클래스를 가지고 n개의 객체를 생성 가능 (갯수 제한 없음)
	 * - Student 클래스를 가지고 철수 학생객체, 영희 학생객체 ... 를 만들 수 있다.
	 * 
	 * 클래스 설계하기
	 * 작성하고자 하는 프로그램에 따라 클래스는 특정 상태와 특정 행위를 가진다.
	 * - 학생 관리 프로그램 - 이름, 성별, 학년, 반, 번호, 과목별 점수...
	 * - 학생 인적성 프로그램 - 이름, 성별, 학년, 반, 번호, 취미, 가정 환경, 상담 내용...
	 * - 쇼핑몰 회원 관리 프로그램 - 아이디, 비밀번호, 이름, 나이, 구매내역, 배송지, 회원 등급 ...
	 * 
	 * Abstraction (추상화)
	 * - 사전적 의미 : 구체적 사물의 공통된 특징
	 * - 프로그래밍적 의미 : 프로그램에 필요한 기능/속성을 추출하고, 불필요한 것을 제거하는 과정
	 * 
	 */
	
	
	public static void main(String[] args) {
		Student student1 = new Student();
		// 상태
//		student1.name = "김철수";
//		student1.gender = '남';
//		student1.age = 15;
		student1.setName("홍길동");
		student1.setGender('남');
		student1.setAge(15);
		// 행위
		student1.study();
		student1.introduce();
		
		Student student2 = new Student();
//		student2.name = "이영희";
//		student2.gender = '여';
//		student2.age = 17;
		student2.setName("이영희");
		student2.setGender('여');
		student2.setAge(17);
		student2.study();
		student2.introduce();

		
	}
	
}
