package forth.homework.two;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Triangle extends Shape {
    private double a, b, c;

    @Override
    public void shapeDetect() {
        System.out.println(this);
    }

    @Override
    public double getArea() {
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }

    @Override
    public double getCircumference() {
        return (a + b + c);
    }

    @Override
    public String toString() {
        return "This is a Triangle and " +
                "a=" + a +
                ", b=" + b +
                ", c=" + c;
    }
}
