package com.sh.oop.emp.run;

import java.util.Scanner;

import com.sh.oop.emp.model.Employee;

/**
 * * 실행용 클래스 : com.sh.oop.emp.run.EmpTest
메뉴작성 : 메소드 작성

=>메뉴 화면의 예
public void mainMenu(){}
******* 사원 정보 관리 프로그램 ************

    1. 새 사원 정보 입력  => empInput() 메소드 실행
    2. 사원 정보 삭제 => 사원객체 참조변수에 null대입할  것.
    3. 사원정보 출력 =>  empOutput() 메소드 실행
    9. 끝내기
********************************************
 *
 */

public class EmpTest {
	public static void main(String[] args) {
		EmpTest tt = new EmpTest();
		tt.mainMenu();
		
	}

	public void mainMenu(){
		Scanner sc = new Scanner(System.in);
		Employee[] arr = new Employee[2];
		int n = arr.length;
		String menu = "******* 사원 정보 관리 프로그램 ************\n"
				+ "\n"
				+ "    1. 새 사원 정보 입력\n"
				+ "    2. 사원 정보 삭제\n"
				+ "    3. 사원정보\n"
				+ "    9. 끝내기\n"
				+ "********************************************\n"
				+ "메뉴를 선택하세요. : ";

		do {
			System.out.print(menu);
			String choice = sc.next();
			switch(choice) {
			case "1" : { 
				// 새 사원 정보 입력
				for (int i = 0; i < n; i++) {
					n++;
					arr[i] = new Employee();
					arr[i].empInput();
					break;
				}
			}break;
			
			case "2" : {
				System.out.print("정보를 삭제할 사원의 사원번호를 입력하세요. : ");
				int delNum = sc.nextInt();
				for (int i = 0; i < n; i++) {
					int num = arr[i].getEmpNo();
					if (num == delNum) {
						System.out.print(arr[i].getEmpName() 
							+ "님의 정보를 삭제 하시겠습니까? (y / n) : ");
						String answer = sc.next();
						if (answer.equals("y")) {
							arr[i] = null;
							System.out.println("사원 정보가 삭제 되었습니다.");
							break;
						} else if (answer.equals("n")) {
							System.out.println("사원 정보 삭제를 취소합니다."); break;
						} else {
							System.out.println("잘못 입력하셨습니다."); break;
						}
					} else {
						System.out.println("사원번호 조회 실패"); break;
					}
				}
			} break;
			
			case "3" : {
				System.out.print("정보를 불러올 사원의 사원번호를 입력하세요. : ");
				int infoNum = sc.nextInt();
				for (int i = 0; i < n; i++) {
					int num = arr[i].getEmpNo();
					if (num == infoNum) {
						System.out.print(arr[i].getEmpName() 
							+ "님의 정보를 확인 하시겠습니까? (y / n) : ");
						String answer = sc.next();
						if (answer.equals("y")) {
							arr[i].empOutput();
							break;
						} else if (answer.equals("n")) {
							System.out.println("사원 정보 확인을 취소합니다."); break;
						} else 
							System.out.println("잘못 입력하셨습니다."); break;
					} else {
						System.out.println("사원번호 조회 실패"); break;
					}
				}
			} break;
			
			case "9" : System.out.println("종료합니다..."); break;
			default : System.out.println("잘못 입력하셨습니다.");
			}
				 
		} while(true);
		
	}
	
}
