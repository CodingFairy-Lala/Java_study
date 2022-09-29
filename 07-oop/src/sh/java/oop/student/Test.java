package sh.java.oop.student;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Test tt = new Test();
	tt.count();
}
	public void count() {
		Scanner sc = new Scanner(System.in );
		
		while(true) {
			System.out.print("문자열을 입력해주세요 : ");
			String str = sc.nextLine();
			if (str.equals("exit")) {
				break;
			} else {
				System.out.println(str.length()+"글자입니다.");
			}
		}
		System.out.println("시스템을 종료합니다.");
	}

}
