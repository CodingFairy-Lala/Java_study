package sh.java.inheritance.shape;

public class RectangleMain {

    public static void main(String[] args) {
        Point[] points = { new Point(0, 0), new Point(200, 0), new Point(200, 100), new Point(0, 100) };
        Rectangle rect = new Rectangle(points);
        rect.draw();
        System.out.println("사각형의 너비는 " + rect.getArea() + "입니다.");
        System.out.println(rect);

        // 아래 생성자도 동일하게 처리되어야 한다.
        Rectangle rect2 = new Rectangle(new Point(0, 0), 200, 100);
        rect2.draw();
        System.out.println("사각형의 너비는 " + rect2.getArea() + "입니다.");
        System.out.println(rect2);
        Rectangle rect3 = new Rectangle(new Point(0, 0), new Point(200, 100));
        rect3.draw();
        System.out.println("사각형의 너비는 " + rect3.getArea() + "입니다.");
        System.out.println(rect3);

    }

}
