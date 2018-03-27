package domain;

import java.util.ArrayList;

public class Triangle extends Shape {
    private static ShapeType shapeType;
    Double area;

    public Triangle(ArrayList<Point> points) {
        super(shapeType.TRIANGLE.getLineCount());
        calcArea(points);
    }

    private void calcArea(ArrayList<Point> points) {
        ArrayList<Line> lines = LineList.getLines(points);
        double a = lines.get(0).getDistance();
        double b = lines.get(1).getDistance();
        double c = lines.get(2).getDistance();
        double s = (a+b+c)/2;
        this.area =  Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public Double getArea() {
        return this.area;
    }
}
