package forth.homework.two;

public abstract class Shape {
    public void shapeDetect() {
        System.out.println("This is a shape");
    }

    public abstract double getArea();
    public abstract double getCircumference();
}
