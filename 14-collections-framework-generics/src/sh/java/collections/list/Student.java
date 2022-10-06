package sh.java.collections.list;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private int no;
    private String name;

    public Student() {
    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return this.no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                " no='" + getNo() + "'" +
                ", name='" + getName() + "'" +
                "}";
    }

    /**
     * 특정 필드를 기준으로 정수값 반환
     * - this.no < other.no 음수
     * - this.no == other.no 0
     * - this.no > other.no 양수
     * 
     * no 기준 오름차순 정렬
     */
    @Override
    public int compareTo(Student other) {
        return this.no - other.no;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Student)) {
            return false;
        }
        Student student = (Student) obj;
        return no == student.no && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, name);
    }

}
