package net.kh.member.run;

import net.kh.member.model.Member;

public class Run {
	public static void main(String[] args) {
		Member member1 = new Member();
		member1.setMemberId("Zeze");
		member1.setMemberPwd("1004");
		member1.setMemberName("Hera");
		member1.setAge(31);
		member1.setGender('여');
		member1.setPhone("01095559354");
		member1.setEmail("blossom.vo.ov@gmail.com");
		
		member1.getMemberId();
		member1.getMemberPwd();
		member1.getMemberName();
		member1.getAge();
		member1.getGender();
		member1.getPhone();
		member1.getEmail();
	}
}
