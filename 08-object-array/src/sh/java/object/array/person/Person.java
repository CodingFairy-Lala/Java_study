package sh.java.object.array.person;

/**
 * 데이터를 담는 용도의 클래스
 * - Entity
 * - DO domain object
 * - VO value object
 * - DTO data transfer object
 */

public class Person {
	
	private String name;
	private int age;
	private boolean married; // boolean getter는 get이 아닌 is로 시작한다.

	//생성자
	// generate constructor from supaer class
	public Person() {
		
	}
	// generate constructor using fields...
	public Person(String name, int age, boolean married) {
		this.name = name;
		this.age = age;
		this.married = married;
	}

	// getter / setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public String personInfo() {
		return name + ", " + age + ", " + married;
	}
	
	
}
