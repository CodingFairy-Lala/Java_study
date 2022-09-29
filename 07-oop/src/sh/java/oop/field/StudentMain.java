package sh.java.oop.field;

public class StudentMain {

	public static void main(String[] args) {
		
		KHStudent student1 = new KHStudent();
		student1.setName("장해라");
		student1.setPhone("01095559254");
		System.out.println(student1.info());
		
		KHStudent student2 = new KHStudent();
		student2.setName("김수현");
		student2.setPhone("01012341234");
		System.out.println(student2.info());
		
		
	}
	
}
