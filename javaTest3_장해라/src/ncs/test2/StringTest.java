package ncs.test2;

public class StringTest {

    public static void main(String[] args) {
        String str = "1.22,4.12,5.93,8.71,9.34";
        double data[] = new double[5];
        double sum = 0;
        // str에서 데이터를 분리한다.
        String[] st = str.split(",");

        int i = 0;
        // for~each 문 사용한다.
        for (String val : st) {
            // 배열에 실수 데이터를 넣는다.
            data[i] = Double.parseDouble(val);
            // 배열 데이터의 합을 구한다.
            sum += data[i];
            i++;
        }

        // 결과 값을 출력 한다.
        System.out.printf("합계 : %.3f\n평균 : %.3f",
                sum, sum / data.length);

    }
}
