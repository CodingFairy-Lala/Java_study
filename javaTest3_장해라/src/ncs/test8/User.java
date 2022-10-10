package ncs.test8;

import java.util.Objects;

public class User {

    private String id;
    private String password;
    private String name;
    private int age;
    private char gender;
    private String phone;

    public User() {
    }

    public User(String id, String password, String name, int age, char gender, String phone) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
    }

    // 복사 생성자
    public User(User other) {
        this.id = other.id;
        this.password = other.password;
        this.name = other.name;
        this.age = other.age;
        this.gender = other.gender;
        this.phone = other.phone;
    }

    @Override
    public String toString() {
        return getId() + " " + getPassword() + " " + getName() + " " + getAge() + " " +
                getGender() + " " + getPhone();
    }

    @Override
    public User clone() { // 공변반환타입
        return new User(this);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(password, user.password) && Objects.equals(name, user.name)
                && age == user.age && gender == user.gender && Objects.equals(phone, user.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, password, name, age, gender, phone);
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
