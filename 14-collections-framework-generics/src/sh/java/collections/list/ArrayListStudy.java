package sh.java.collections.list;

import java.security.cert.TrustAnchor;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ArrayListStudy {

    public static void main(String[] args) {
        ArrayListStudy study = new ArrayListStudy();
        // study.test0();
        // study.test1();
        // study.test2();
        // study.test3();
        // study.test4();
        // study.test5();
        // study.test6();
        // study.test7();
        // study.test8();
        study.test9();
    }

    /**
     * List#contains
     */

    private void test9() {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "이순신"));
        list.add(new Student(4, "논개"));
        list.add(new Student(2, "신사임당"));
        Student honggd = new Student(1, "홍길동");
        list.add(honggd);

        System.out.println(list.contains(honggd)); // true
        System.out.println(list.contains(new Student(1, "홍길동")));

    }

    /**
     * Stack
     * - LIFO Last In First Out
     * - 마지막에 들어온 요소가 가장 먼저 제거된다.
     * - push / pop
     */

    private void test8() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);

        while (!stack.isEmpty()) { // 비워질 때까지 모든 요소를 제거
            System.out.println(stack.pop());
        }

    }

    /**
     * Queue
     * - FIFO First In First Out
     * - 먼저 들어온 요소가 먼저 제거되는 형태
     * 
     * - 요소 추가시 offer ( 맨 뒤에 추가)
     * - 요소 제거시 poll (맨 앞에서 제거)
     */

    private void test7() {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(5);
        queue.offer(2);
        queue.offer(3);
        queue.offer(7);

        System.out.println(queue.poll()); // 5 제거
        System.out.println(queue.poll()); // 2 제거

        queue.offer(4); // 4 추가
        queue.offer(1); // 1 추가

        System.out.println(queue.poll()); // 3 제거
        System.out.println(queue.poll()); // 7 제거

        System.out.println(queue);

        while (!queue.isEmpty()) { // 비워질 때까지 모든 요소를 제거
            System.out.println(queue.poll());
        }
    }

    /**
     * LinkedList
     * - 배열처럼 연속된 공간에 존재하지 않고, 요소와 다음 요소의 참조주소로 연결된 형태.
     * - 중간에 요소 추가/수정/삭제가 빈번하게 일어나는 데이터라면 ArrayList대비 성능이 좋다.
     * - 검색 기능에서는 ArrayList 대비 성능이 좋지 않다.
     */

    private void test6() {
        List<String> list = new LinkedList<>();

    }

    /**
     * 정렬
     * 
     * - 클래스별 기본정렬 (무조건 한가지)
     * -> 해당 클래스에서 Comparable 인터페이스 구현 - compareTo 메소드 오버라이드
     * 
     * - 기타 정렬 (n가지)
     * -> 정렬을 뒤집기 하는 Comparator 객체는 jdk에서 제공
     * -> 별도의 Comparator 구현 클래스를 작성 - compare 메소드 오버라이드
     */
    private void test5() {
        List<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(2);
        intList.add(1);
        intList.add(4);
        intList.add(3);

        // 오름차순 정렬
        intList.sort(null);
        // 내림차순 정렬
        Comparator<Integer> comp = Collections.reverseOrder();
        intList.sort(comp);
        System.out.println(intList);

        List<String> strList = new ArrayList<>();
        strList.add("홍길동");
        strList.add("이길동");
        strList.add("조길동");
        strList.add("고길동");

        // 오름차순 정렬 (사전 등재순)
        Collections.sort(strList);
        strList.sort(null);

        // 내림차순 정렬
        Collections.sort(strList, Collections.reverseOrder());
        strList.sort(Collections.reverseOrder());
        System.out.println(strList);

        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "이순신"));
        list.add(new Student(4, "논개"));
        list.add(new Student(2, "신사임당"));
        list.add(new Student(1, "홍길동"));

        // Collection.sort(list);
        // list.sort(null);
        Collections.sort(list, Collections.reverseOrder()); // no 기준 내림차순( 기본정렬 반대)

        Collections.sort(list, new StudentNameAscComparator()); // name 기준 오름차순
        list.sort(new StudentNameAscComparator()); // name 기준 오름차순

        System.out.println(list);

    }

    private void test4() {
        ArrayList<String> list = new ArrayList<>();

        // 추가
        list.add("안녕");
        list.add(0, "Hello");
        list.add("포크레인");
        list.add("머그컵");
        list.add("잘가");

        // 수정
        list.set(1, "잘가");
        System.out.println(list);

        // 제거
        // System.out.println(list.remove(1)); // 제거된 요소 반환
        System.out.println(list.remove("잘가가")); // 해당요소를 찾아서 제거한 경우 true

        // 가져오기
        System.out.println(list.get(0));

        // 요소 포함여부 확인
        System.out.println(list.indexOf("잘가")); // index 1
        System.out.println(list.indexOf("잘잘가")); // 요소가 없을 경우 index -1
        System.out.println(list.lastIndexOf("잘가")); // 뒤에서부터 확인 index 4

        System.out.println(list.contains("잘가")); // true

        // 다른 리스트의 요소를 한번에 추가
        List<String> another = new ArrayList<>();
        another.add("abc");
        another.add("def");
        another.add("xyz");
        // list.addAll(another);
        list.addAll(0, another); // 특정 index를 지정하여 추가할 수도 있음

        // 열람 (모든 요소에 접근)
        // 1. 일반 for문
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        // 2. for each문
        for (String str : list) {
            System.out.print(str + " ");
        }
        System.out.println();
        // 3. Iterator 객체
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String next = iter.next();
            System.out.print(next + " ");
        }
        System.out.println();

        // 모든 요소 제거
        list.clear();

        // 현재 list가 비어있는가
        System.out.println(list.isEmpty()); // true
        System.out.println(list);
    }

    /**
     * test0을 Student[] -> ArrayList<String>로 변환해서 같은 기능을 수행하기
     * Student[] students = {
     * new Student(1, "홍길동"),
     * new Student(2, "신사임당"),
     * new Student(3, "이순신")
     * };
     */

    private void test3() {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1, "홍길동"));
        list.add(new Student(2, "신사임당"));
        list.add(new Student(3, "이순신"));
        for (Object obj : list) {
            System.out.print(obj + " ");
        }

        System.out.println();
        // 학생 마지막에 추가
        list.add(new Student(4, "유관순"));
        for (Object obj : list) {
            System.out.print(obj + " ");
        }

        System.out.println();
        // 학생 중간에 추가
        list.add(2, new Student(22, "세종대왕"));
        for (Object obj : list) {
            System.out.print(obj + " ");
        }

        System.out.println();
        // 학생 중간에 삭제
        list.remove(1);
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
    }

    /**
     * generics
     * - compile-time에 타입 제한 가능
     * - 요소 추가시에 타입 체크 가능
     * - 요소를 꺼냈을 때 해당 타입의 값을 보장
     * 
     * jdk 1.7 부터는 우항의 제네릭은 생략가능!
     */
    private void test2() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("안녕");
        list.add("잘가");
        // list.add(123); // String이 아니므로 오류

        list.get(0);

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(1); // auto-boxing // 1 -> Integer.valueOf(1)
        list2.add(2);
        list2.add(3);
        list2.add(2);
        list2.add(1);

        for (Integer i : list2) {
            System.out.println(i);
        }

        System.out.println(list2.get(0) + list2.get(1)); // auto-unboxing // Integer + Integer -> Integer#intValue +
        // Integer#intValue -> int + int

    }

    /**
     * List - ArrayList / LinkedList
     * 
     * - 순서를 유지 / 저장
     * - 중복 허용
     */
    private void test1() {
        ArrayList list1 = new ArrayList();
        List list2 = new ArrayList();
        Collection list3 = new ArrayList();

        list2.add("안녕하세요");
        list2.add(123);
        list2.add(45.67);
        list2.add(true);
        list2.add(LocalDate.now());
        list2.add(true);
        list2.add(45.67);

        System.out.println(list2);
        System.out.println(list2.size()); // 현재 저장된 요소의 개수

        // System.out.println(list2.get(0));
        // System.out.println(list2.get(1));
        // System.out.println(list2.get(2));
        // System.out.println(list2.get(4));

        list2.add(2, "ㅋㅋㅋ"); // 특정 인덱스에 추가
        list2.remove(1); // 특정 인덱스 삭제시 내부 요소 정리
        list2.set(4, LocalDateTime.now()); // 특정 인덱스 덮어쓰기 (대체)

        for (int i = 0; i < list2.size(); i++) {
            System.out.println(i + " : " + list2.get(i));
        }

        for (Object obj : list2) {
            System.out.println(obj);
        }
    }

    /**
     * 배열의 한계
     */
    private void test0() {
        Student[] students = {
                new Student(1, "홍길동"),
                new Student(2, "신사임당"),
                new Student(3, "이순신")
        };

        // 학생 마지막에 추가
        // 확장된 크키의 배열을 생성/복사
        Student[] students2 = new Student[10];
        System.arraycopy(students, 0, students2, 0, students.length);
        students2[3] = new Student(4, "유관순");

        // 학생 중간에 추가
        students2[4] = students2[3];
        students2[3] = students2[2];
        students2[2] = new Student(22, "세종대왕");

        // 학생 중간에 삭제
        // students2[1] = students2[2];
        // students2[2] = students2[3];
        // students2[3] = students2[4];
        // students2[4] = null;

        // i 1 ~ 8
        int delIndex = 1; // 삭제할 인덱스
        for (int i = delIndex; i < students2.length - 1; i++) {
            students2[i] = students2[i + 1];
            if (i == students2.length - 2)
                students2[i + 1] = null;
        }

        System.out.println(Arrays.toString(students2));

    }
}
