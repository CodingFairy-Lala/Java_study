package sh.java.collections.set;

import java.security.cert.LDAPCertStoreParameters;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.LinkedBlockingDeque;

import sh.java.collections.list.Student;

public class HashSetStudy {

    public static void main(String[] args) {
        HashSetStudy study = new HashSetStudy();
        // study.test1();
        // study.test2();
        // study.test3();
        // study.test4();
        study.test5();

    }

    /**
     * Lotto 생성
     * - 1 ~ 45 사이의 중복없는 난수 6개를 생성
     * - 오름차순 정렬
     */

    private void test5() {
        Random rnd = new Random();
        Set<Integer> lottoSet = new TreeSet<>();
        for (;;) {
            lottoSet.add(rnd.nextInt(45) + 1);
            if (lottoSet.size() == 6)
                break;
        }
        System.out.println(lottoSet);

    }

    /**
     * LinkedHashSet
     * - 저장한 순서를 유지
     * 
     * TreeSet
     * - Comparable 을 규현한 요소에 대해 정렬기능 제공
     */
    private void test4() {
        Set<String> nameSet = new LinkedHashSet<>();
        nameSet.add("마동석");
        nameSet.add("송중기");
        nameSet.add("비비");
        nameSet.add("김다미");
        System.out.println(nameSet);

        Set<String> nameTreeSet = new TreeSet<>();
        nameTreeSet.add("마동석");
        nameTreeSet.add("송중기");
        nameTreeSet.add("비비");
        nameTreeSet.add("김다미");
        System.out.println(nameTreeSet);

    }

    /**
     * 커스텀 클래스 중복처리
     */

    private void test3() {
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student(1, "홍길동"));
        studentSet.add(new Student(2, "신사임당"));
        studentSet.add(new Student(1, "홍길동"));

        System.out.println(studentSet);

    }

    /**
     * List -> Set 중복을 제거하기 위해
     * 
     * Set -> List 순서를 사용하기 위해 (정렬)
     */

    private void test2() {
        List<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(1);
        System.out.println(list);

        Set<Integer> set = new HashSet<>(list); // List -> Set 전환
        System.out.println(set);

        list = new LinkedList<>(set);
        System.out.println(list); // Set -> List 전환
        System.out.println(list.get(2));

    }

    /**
     * Set
     * - 중복을 허용하지 않는다.
     * - 순서 유지 안함. (index 기능 없음)
     */

    private void test1() {
        HashSet<Integer> set = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Collection<Student> set3 = new HashSet<>();

        set2.add("안녕");
        set2.add("잘가");
        set2.add("가을");
        set2.add("하늘");
        set2.add("안녕");
        set2.add("안녕");
        set2.add("안녕");

        System.out.println(set2.size());

        // 요소 제거
        set2.remove("안녕");

        System.out.println(set2);

        // 요소 전체 열람
        // for each문
        for (String str : set2) {
            System.out.println(str);
        }
        System.out.println();
        // Iterator 객체
        Iterator<String> iter = set2.iterator();
        while (iter.hasNext()) {
            String next = iter.next();
            System.out.println(next);
        }

        // clear
        set2.clear();

        // isEmpty
        System.out.println(set2.isEmpty());

    }
}
