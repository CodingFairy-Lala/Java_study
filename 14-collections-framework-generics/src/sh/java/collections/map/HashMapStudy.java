package sh.java.collections.map;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import sh.java.collections.list.Student;

public class HashMapStudy {

    public static void main(String[] args) {
        HashMapStudy study = new HashMapStudy();
        // study.test1();
        study.test2();

    }

    /**
     * Map 요소 열람하기
     * - keySet : key 값의 Set을 통해 map의 모든 요소 접근
     * - entrySet
     * - Entry 타입 - key/value를 묶어 관리하는 타입(인터페이스)
     */

    private void test2() {

        Map<Integer, String> map = new HashMap<>();
        map.put(123, "홍길동");
        map.put(456, "신사임당");
        map.put(789, "유관순");

        // 1. keySet
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
        System.out.println();
        // Iterator
        Iterator<Integer> iter = keySet.iterator();
        while (iter.hasNext()) {
            Integer key = iter.next();
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
        System.out.println();

        // 2. entrySet
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
        System.out.println();
        // Iterator
        Iterator<Map.Entry<Integer, String>> iter2 = entrySet.iterator();
        while (iter.hasNext()) {
            Map.Entry<Integer, String> entry = iter2.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        System.out.println();

        System.out.println(map);
    }

    /**
     * Map
     * - key / value 한쌍으로 요소를 관리
     * - key를 통해 value를 찾는 방식
     * - key는 중복될 수 없다.
     * - 동일한 key로 요소를 등록하면, 새로운 value로 덮어써진다. (대체)
     * 
     */

    private void test1() {
        HashMap<String, Object> map = new HashMap<>();
        Map<Integer, Student> map2 = new HashMap<>();

        // 요소 추가
        // 반환값 : 중복된 요소가 없다면, null 이 반환 / 중복된 요소가 있다면, 제거된 값 반환
        System.out.println(map.put("honggd", "홍길동"));
        map.put("sinsa", "신사임당");
        map.put("today", LocalDate.now());
        map.put("1234", 5678);
        // map.put(1234, 5678;
        map.put("honggd", "마길동");

        // 특정요소 가져오기
        System.out.println(map.get("honggd"));
        System.out.println(map.get("today"));

        // 특성요소 제거하기
        map.remove("today");

        // 저장된 요소의 개수
        System.out.println(map.size());

        // 확인
        System.out.println(map);

        // 기존 맵의 요소 추가
        // Map<String, Object> anotherMap = new HashMap<>(map); // 생성자에 추가
        // System.out.println(anotherMap);
        Map<String, Object> anotherMap = new HashMap<>();
        anotherMap.putAll(map);
        System.out.println(anotherMap);

        // equals 오버라이드 되어있음. -> 같은 요소를 가지고 있다면 true 반환
        System.out.println(map.equals(anotherMap));

    }

}
