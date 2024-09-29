package second_work;

public class circleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(3,4,5);
        c1.setX(6);
        c1.setY(7);
        c1.setRadius(8);
        System.out.println("c1:" + c1);
        System.out.println("c1面积是：" + c1.getArea());
        System.out.println("c1的周长是：" + c1.getPerimeter());
        System.out.println(" ");
        System.out.println("c2:"+"x="+c2.getX()+", y="+c2.getY()+", radius="+c2.getRadius());
        System.out.println("c2面积是：" + c2.getArea());
        System.out.println("c2的周长是：" + c2.getPerimeter());
    }
}
