class cal{
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	public int sum(int v1, int v2, int v3) {
		return this.sum(v1, v2)+v3;  // 자기 자신
	}
}

class cal3 extends cal{
	public int minus(int v1, int v2) {
		return v1-v2;
	}
	// Overriding
	public int sum(int v1, int v2) {
		System.out.println("cal3");
		return super.sum(v1,v2); // 부모 클래스의 생성자를 불러옴
	}
	// Overloading
	public int sum(int v1, int v2, int v3, int v4) {
		return v1+v2+v3+v4;
	}
} 

class Caal{
	int v1, v2;
	Caal(int v1, int v2){
		System.out.println("Cal init");
		this.v1=v1; this.v2=v2;
	}
	public int sum() {return this.v1+v2;}
}
class Caal2 extends Caal{

	Caal2(int v1, int v2) {
		super(v1, v2);
		System.out.println("Cal2 init");
	}
	public int minus() {return this.v1-v2;}
}

public class InheritanceApp {

	public static void main(String[] args) {
		cal c = new cal();
		System.out.println(c.sum(2, 1));
		System.out.println(c.sum(2, 1, 1));
		cal3 c3 = new cal3();
		System.out.println(c.sum(2, 1));
		System.out.println(c3.minus(2, 1));
		System.out.println(c3.sum(2, 1,1,1));

		Caal ccc = new Caal(2,1);
		Caal2 ccc2 = new Caal2(2,1);
		System.out.println(ccc2.sum()); //3
		System.out.println(ccc2.minus()); //1
		
	}

}
