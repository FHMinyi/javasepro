package forth.homework.two;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle extends Shape{
    private double radius;

    @Override
    public void shapeDetect() {
        System.out.println(this);
    }

    @Override
    public double getArea() {
        return 2 * 3.14 * radius;
    }

    @Override
    public double getCircumference() {
        return 3.14 * 3.14 * radius;
    }

    @Override
    public String toString() {
        return "This is a Circle  and " +
                "radius=" + radius;
    }
}
