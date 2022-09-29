package sh.java.object.array.student;

public class Student {
	
	private int no;
	private String name;
	private String phone;
	
	// 생성자
	public Student() {

	}
	public Student(int no, String name, String phone) {
		this.no = no;
		this.name = name;
		this.phone = phone;
	}

	// getter / setter 
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String studentInfo() {
		return no + "번 " + name + ", " + phone;
	}
	
}
