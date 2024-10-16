package thrid.homework.thrid;

public class Test {
    public static void main(String[] args)
    {
        Circle circle = new Circle(5);
        System.out.println("圆的面积是：" + circle.getArea());
        System.out.println("圆的周长是：" + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(5, 6);
        System.out.println("矩形的面积是：" + rectangle.getArea());
        System.out.println("矩形的周长是：" + rectangle.getPerimeter());
    }
}
