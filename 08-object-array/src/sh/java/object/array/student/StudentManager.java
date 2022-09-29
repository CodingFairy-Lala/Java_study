package sh.java.object.array.student;

import java.util.Scanner;

public class StudentManager {

	private static final int MAX_STUDENT = 100;
	private Student[] students;
	private int index;
	private Scanner sc = new Scanner(System.in);
	
	public StudentManager() {
		students = new Student [MAX_STUDENT];
	}

	public void inputStudents() {
		for(int i = 0; i < students.length; i++) {
			students[index++] = inputStudent();
			
			System.out.print("계속 입력하시겠습니까? (y/n) : ");
			if(sc.next().charAt(0) == 'n')
				break;
		}
	}

	public Student inputStudent() {
		Student student = new Student();
		System.out.print("번호 : ");
		student.setNo(sc.nextInt());
		System.out.print("이름 : ");
		student.setName(sc.next());
		System.out.print("전화번호 : ");
		student.setPhone(sc.next());
		return student;
	}
	
	public void printStudents() {
		for (int i = 0; i < index; i++) {
			System.out.println(students[i].studentInfo());
		}
	}
}
