package sh.java.inheritance.car;

import java.util.Objects;

public class Car {

    private String name;
    private String color;
    private int doorCnt;

    public Car() {
        super();
    }

    public Car(String name, String color, int doorCnt) {
        this.name = name;
        this.color = color;
        this.doorCnt = doorCnt;
    }

    /**
     * 복사생성자
     * 
     * @param other
     */
    public Car(Car other) {
        this.name = other.name;
        this.color = other.color;
        this.doorCnt = other.doorCnt;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoorCnt() {
        return this.doorCnt;
    }

    public void setDoorCnt(int doorCnt) {
        this.doorCnt = doorCnt;
    }

    @Override
    public String toString() {
        return "Car [ name='" + getName() + "'" +
                ", color='" + getColor() + "'" +
                ", doorCnt='" + getDoorCnt() + "'" +
                "]";
    }

    /**
     * 동등성 비교 (모든 컬럼값이 동일하다면 같은 객체로 간주한다.)
     * - name : String
     * - color : String
     * - doorCnt : int
     * 
     * 자바 약속 : equals 비교결과가 true라면, hashCode값이 같이야 한다.
     * (equals에 사용된 필드값 기준으로 hashCode를 재생성 해야한다.)
     * -equals와 hashCode는 같이 override 한다. (비교하는 필드가 동일해야 함.)
     */

    // @Override
    // public boolean equals(Object obj) {
    // Car other = (Car) obj; // Car 타입으로 강제 형변환
    // if(!this.name.equals(other.name))
    // return false;
    // if(!this.color.equals(other.color))
    // return false;
    // if(this.doorCnt != other.doorCnt)
    // return false;

    // return true;
    // }

    @Override
    public boolean equals(Object o) {
        if (o == this) // 주소값이 같은지 확인
            return true;
        if (!(o instanceof Car)) { // Car 객체가 아닌지 확인
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(color, car.color) && doorCnt == car.doorCnt;
    }

    @Override
    public int hashCode() { // 필드값 기준으로 hashCode를 재생성
        return Objects.hash(this.name, this.color, this.doorCnt);
    }

    /**
     * Method Overriding
     * - 상속받은 부모 메소드를 재작성하는 것
     * - 메소드 시그니쳐(접근제한자, 리턴타입, 메소드명, 매개변수 선언, 예외)이 모두 동일해야한다.
     * -> @Override 어노테이션을 통해 컴파일타임에 체크 가능. (오타 등등 확인해줌)
     * - 접근제한자는 상속받은 것보다 더 개방할 수 있다.
     * -> default < protected < public
     * - private/final 메소드는 override가 불가능하다.
     * - 선언부 예외를 일부만 던지거나, 제거할 수 있다.
     * - 공변반환타입 : 부모메소드의 반환타입을 자식 클래스의 타입으로 변환 가능
     * 
     * 복사생성자를 통한 clone 처리
     */

    @Override
    public Car clone() { // 공변반환타입
        return new Car(this);
    }

}
