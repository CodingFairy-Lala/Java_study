package sh.java.polymorphism.basic;

public class Lion extends Animal implements Runnable {

	@Override
	public void run() {
		System.out.println("라이언이 " + NUM_OF_LEGS + "발로 달립니다.");
	}

	@Override
	public void say() {
		System.out.println("저는 라이언 입니다.");
	}

	@Override
	public void attack() {
		kick();
	}

	public void kick() {
		System.out.println("라이언킥!");
	}
}
