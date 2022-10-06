package sh.java.io._byte.object;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * 객체 입출력 스트림을 통해 읽기/쓰기 할 클래스는 Serializable 인터페이스를 구현해야 한다.
 * 
 * - implements Serializable
 * - serialVersionUID 값을 지정 (지정하지 않으면 random하게 부여됨) - 필수는 아니나, 지정할 시 빈번하게 발생하는
 * 오류를 예방할 수 있다
 * 
 * 
 */

public class User implements Serializable {

    /**
     * 직렬화/역직렬화시에 동일한 클래스 검증용
     */
    private static final long serialVersionUID = 1L; // serialVersionUID 값 지정

    private String username;
    private transient String password; // 객체 직렬화(Serialize)하는 과정에 제외하고 싶은 경우 선언하는 키워드
    private LocalDate birthday;

    public User() {
        super();
    }

    public User(String username, String password, LocalDate birthday) {
        this.username = username;
        this.password = password;
        this.birthday = birthday;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getBirthday() {
        return this.birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "{" +
                " username='" + getUsername() + "'" +
                ", password='" + getPassword() + "'" +
                ", birthday='" + getBirthday() + "'" +
                "}";
    }

}
