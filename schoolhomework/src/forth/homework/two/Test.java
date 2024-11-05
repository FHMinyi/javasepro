package forth.homework.two;

public class Test {
    public static void getMaxArea(Shape[] shapes) {
        double maxArea = 0;
        int maxi = 0;
        for (int i = 0; i < shapes.length; i++) {
            if(shapes[i].getArea() > maxArea) {
                maxArea = shapes[i].getArea();
                maxi = i;
            }
        }
        System.out.println("最大面积的是:" + "Shap[" + maxi + "]，" + "面积是" + maxArea);
    }

    public static void getMaxCircumference(Shape[] shapes) {
        double maxCircumference = 0;
        int maxi = 0;
        for (int i = 0; i < shapes.length; i++) {
            if(shapes[i].getCircumference() >= maxCircumference) {
                maxCircumference = shapes[i].getCircumference();
                maxi = i;
            }
        }
        System.out.println("最大周长的是:" + "Shap[" + maxi + "]，" + "周长是" + maxCircumference);
    }
    public static void printShape(Shape[] shapes) {
        for (Shape shape : shapes) {
            shape.shapeDetect();
        }
    }
    public static void main(String[] args) {
        Shape[] shaps = new Shape[9];

        shaps[0] = new Rectangle(5, 6);
        shaps[1] = new Rectangle(7, 8);
        shaps[2] = new Rectangle(9, 10);

        shaps[3] = new Triangle(5, 6, 7);
        shaps[4] = new Triangle(7, 8, 9);
        shaps[5] = new Triangle(9, 10, 11);

        shaps[6] = new Circle(5);
        shaps[7] = new Circle(7);
        shaps[8] = new Circle(9);

        printShape(shaps);
        System.out.println("--------------------------------------------------------");
        getMaxCircumference(shaps);
        getMaxArea(shaps);
    }
}
