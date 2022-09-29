package member.controller;

import member.model.vo.Member;

public class MemberManager {
	Member[] member = new Member[40];
	int index = 0;

	public void insertMember(Member member) {
		this.member[index++] = member;
	}

	public void printData() {
		System.out.println("----------------------------------------<<회원정보>>-----------------------------------------");
		System.out.printf("%-15s %-15s %-15s %-15s\n", "이름", "등급", "포인트", "이자포인트");
		System.out.println(
				"------------------------------------------------------------------------------------------------");
		for (int i = 0; i < index; i++) {
			System.out.printf("%-15s %-15s %-15d %-15.2f\n", member[i].getName(), member[i].getGrade(),
					member[i].getPoint(),
					member[i].getEjapoint());
		}
	}
}
