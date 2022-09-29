package sh.java.oop.field;

/**
 * KH학생정보를 관리하기 위한 KHStudent 클래스 설계
 * - 우리반 학생정보만 관리
 * 
 * 교육원명 academy name "KH정보교육원"
 * 과정명 course name "JAVA 기반 공공데이터 융합 개발자 양성과정"
 * 강의장명 classroom 'M'
 * 학생명 name
 * 전화번호 phone
 *
 */

public class KHStudent {

	public static final String ACADEMY_NAME = "KH정보교육원";
	public static final String COURSE_NAME = "JAVA 기반 공공데이터 융합 개발자 양성과정";
	public static final char CLASSROOM = 'M';
	
	private String name;
	private String phone;
	
	// getter / setter
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String info() {
		return "교육원명 : " + ACADEMY_NAME + "\n" // 같은 클래스 내부에서는 클래스명을 생략하고 클래스변수 사용가능
				+ "과정명 : " + KHStudent.COURSE_NAME + "\n"
				+ "강의장 : " + KHStudent.CLASSROOM + "\n"
				+ "이름 : " + this.name + "\n"
				+ "전화번호 : " + this.phone + "\n";
	}
	
}
