package sh.java.polymorphism.basic;

public class Tiger extends Animal implements Runnable {

	@Override
	public void run() {
		System.out.println("타이거가 " + NUM_OF_LEGS + "발로 달립니다.");
	}

	@Override
	public void say() {
		System.out.println("저는 타이거 입니다.");
	}

	@Override
	public void attack() {
		punch();
	}

	public void punch() {
		System.out.println("타이거 펀치!");
	}

}
