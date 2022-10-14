package com.sh.thread.sleep;

public class SleepTest1 {
	public static void main(String args[]) throws InterruptedException {
		new SleepTest1().sendAphorism();

		System.out.println("프로그램 종료!!");
	}

	public void sendAphorism() {
		String messages[] = { 
				"Pride will have a fall.", 
				"Power is dangerous unless you have humility.",
				"Office changes manners.", 
				"Empty vessels make the most sound.",
				"Heaven helps those who help themseleves.", 
				"Things change.",
				"Forgive yorself before you die. Then forgive others.",
				"Don't let go too soon, but don't hang on too soon.",
				"Accept what you are able to do and what you are not able to do.",
				"Accept what past as past, whthout denying or discarding it." 
			};

		for (int i = 0; i < 10; i++) {
			int index = (int) (Math.random() * 10);
			System.out.println(messages[index]);
//			System.out.flush();
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
