package sh.java.inheritance.basic;

public class Main {

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.name = "고길동";
		parent.age = 33;
		parent.say();
		System.out.println(parent.info());
		
		Child child = new Child();
		child.name = "고새롬";
		child.age = 15;
		child.say();
		System.out.println(child.info());
		child.game();
		
		GrandChild grandChild = new GrandChild();
		grandChild.name = "고설";
		grandChild.age = 3;
		grandChild.say();
		System.out.println(grandChild.info());
		
		Child2 child2 = new Child2();
		child2.name = "고명재";
		child2.age = 20;
		child2.say();
		System.out.println(child2.info());
		
		
	}

}
