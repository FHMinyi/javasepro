package thrid.homework.fourth;

import thrid.homework.fourth.mypackage.Point;

public class Line {
    private Point start;
    private Point end;

    public Line(Point end, Point start) {
        this.end = end;
        this.start = start;
    }

    public Line(int x1, int y1, int x2, int y2) {
        start = new Point(x1,y1);
        end = new Point(x2,y2);
    }

    public double getLength() {
        return Math.sqrt(Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2));
    }

    @Override
    public String toString() {
        return "Line{" +
                "end=" + end +
                ", start=" + start +
                '}';
    }
}
