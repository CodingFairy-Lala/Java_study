package sh.java.polymorphism.basic;

import java.util.Random;

/**
 * 다형성
 * - 상속을 이용한 기술로, 자식 객체를 부모타입의 참조변수에 담아 제어할 수 있는 기술
 *
 */

public class AnimalMain {

	public static void main(String[] args) {
		AnimalMain main = new AnimalMain();
		// main.test1();
		// main.test2();
		// main.test3();
		// main.test4();
		// main.test5();
		// main.test6();
		// main.test7();
		main.test8();

	}

	/**
	 * @실습문제 : Eagle 클래스 (Animal 상속, Flyable 구현)
	 * 
	 *       Flyable인터페이스
	 *       - fly:void 추상메소드
	 *       - NUM_OF_WINGS:INT = 2 상수
	 */

	public void test8() {
		Eagle eagle = new Eagle();

		eagle.say();
		eagle.attack();
		eagle.fly();

	}

	/**
	 * 메소드 구현(override) 강제화
	 * - 추상클래스의 추상메소드
	 * -> 일반클래스 : 일반필드 / 메소드를 가질 수 있다.
	 * 
	 * - 인터페이스의 추상메소드
	 * -> 규격을 제공할 목겆ㄱ으로 만들 변형클래스
	 * -> 추상모세드와 상수(public static final)만 가질 수 있다.
	 * -> static메소드, default메소드 추가(1.8부터)
	 * 
	 */

	public void test7() {
		Animal tiger = new Tiger();
		Animal lion = new Lion();

		tiger.say();
		lion.say();

	}

	public void test6() {
		Animal[] animals = new Animal[3];
		for (int i = 0; i < animals.length; i++) {
			animals[i] = generateAnimal();
			animals[i].say();
			animals[i].attack();
		}
	}

	/**
	 * 다형성과 override
	 * 
	 * 정적 바인딩
	 * - 어떤 메소드를 호출할지 작성된 타입에 의해 결정
	 * 동적 바인딩
	 * - 다운캐스팅 없이 자식클래스의 override 된 메소드를 호출
	 * - override + 다형성
	 */

	public void test5() {
		Animal tiger = new Tiger();
		Animal lion = new Lion();

		tiger.say();
		lion.say();

		// downcasting 없이 Tiger#punch, Lion#kick 호출하기.
		tiger.attack();
		lion.attack();
	}

	/**
	 * 리턴타입에서 다형성 활용하기
	 */
	public void test4() {
		Animal animal = generateAnimal();
		System.out.println(animal);
	}

	/**
	 * Tiger 객체 또는 Lion 객체를 생성
	 * 
	 * @return
	 */

	public Animal generateAnimal() {
		return new Random().nextBoolean() ? new Tiger() : new Lion();
	}

	/**
	 * 매개변수부에서 다형성 활용하기
	 */
	public void test3() {
		Tiger tiger = new Tiger();
		Lion lion = new Lion();

		attack(tiger);
		attack(lion);
	}

	// public void attack(Tiger tiger) {}
	// public void attack(Lion lion) {}
	public void attack(Animal animal) {
		if (animal instanceof Tiger) {
			((Tiger) animal).punch();
		} else if (animal instanceof Lion) {
			((Lion) animal).kick();
		}
	}

	/**
	 * 부모타입의 변수에 자식타입의 객체를 모두 담아 처리할 수 있다.
	 */
	public void test2() {
		Tiger tiger = new Tiger();
		Lion lion = new Lion();

		Animal[] animals = new Animal[3];
		animals[0] = tiger;
		animals[1] = lion;
		animals[2] = tiger;

		for (int i = 0; i < animals.length; i++) {
			// System.out.println(animals[i]);
			animals[i].say();

			// 객체 instanceof 클래스 : boolean
			// instanceof 연산결과가 true라면, 해당 클래스로 무조건 형변환 할 수 있다. (ClassCastException 이 발생 안함)
			if (animals[i] instanceof Tiger) {
				((Tiger) animals[i]).punch();
			} else if (animals[i] instanceof Lion) {
				((Lion) animals[i]).kick();
			}

		}

	}

	/**
	 * - upcasting : 자식타입을 부모타입으로 변환 (자동)
	 * - downcasting : 부모타입을 자식타입으로 변환 (명시적 형변환)
	 * 
	 * 자식객체가 부모타입의 변수에 대입되면, 부모타입의 멤버(필드/메소드)만 사용 가능하다.
	 */

	public void test1() {
		Tiger tiger = new Tiger();
		Animal animal1 = tiger;

		tiger.say();
		tiger.punch();

		animal1.say();
		// anamal1.punch();

		// downcasting
		((Tiger) animal1).punch();
		Tiger anotherTiger = (Tiger) animal1;
		anotherTiger.say();
		anotherTiger.punch();

		Animal animal2 = new Lion();
		animal2.say();
		((Lion) animal2).kick();
		Lion anotherLion = (Lion) animal2;
		anotherLion.kick();

	}
}
