package net.kh.member.model;

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	
	// memberId
	public void setMemberId(String memberId) {   // setter
		this.memberId = memberId;
	}
	public String getMemberId() {  // getter
		return this.memberId;
	}
	// memberPwd
	public void setMemberPwd(String memberPwd) {   // setter
		this.memberPwd = memberPwd;
	}
	public String getMemberPwd() {  // getter
		return this.memberPwd;
	}
	// memberName
	public void setMemberName(String memberName) {   // setter
		this.memberName = memberName;
	}
	public String getMemberName() {  // getter
		return this.memberName;
	}
	// age
	public void setAge(int age) {   // setter
		this.age = age;
	}
	public int getAge() {  // getter
		return this.age;
	}
	// gender
	public void setGender(char gender) {   // setter
		this.gender = gender;
	}
	public char getGender() {  // getter
		return this.gender;
	}
	// phone
	public void setPhone(String phone) {   // setter
		this.phone = phone;
	}
	public String getPhone() {  // getter
		return this.phone;
	}
	// email
	public void setEmail(String email) {   // setter
		this.email = email;
	}
	public String getEmail() {  // getter
		return this.email;
	}
	
}
