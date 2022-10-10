package ncs.test4;

import java.util.Scanner;

public class ProductTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product pd = new Product();

        System.out.print("상품명 입력 > ");
        pd.setName(sc.next());
        System.out.print("가격 입력 > ");
        pd.setPrice(sc.nextInt());
        System.out.print("수량 입력 > ");
        pd.setQuantity(sc.nextInt());

        System.out.println(pd.information());
        System.out.println("총 구매가격 : " + pd.getPrice() * pd.getQuantity() + "원");

    }
}
