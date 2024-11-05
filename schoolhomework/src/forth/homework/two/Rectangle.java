package forth.homework.two;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangle extends Shape {
    private double length, width;

    @Override
    public void shapeDetect() {
        System.out.println(this);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getCircumference() {
        return (length + width) * 2;
    }

    @Override
    public String toString() {
        return "This is a Triangle and " +
                "length=" + length +
                ", width=" + width;
    }
}
