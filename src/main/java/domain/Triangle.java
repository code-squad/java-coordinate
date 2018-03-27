package domain;

import java.util.ArrayList;

public class Triangle extends Shape {
    private static ShapeType shapeType;
    Double area;

    public Triangle(ArrayList<Point> points) {
        super(shapeType.TRIANGLE.getLineCount());
        LineList lineList = LineList.getInstance();
        lineList.makeLines(points);
        calcArea(lineList);
    }

    private void calcArea(LineList lineList) {
        double a = lineList.getLineDistance(0);
        double b = lineList.getLineDistance(1);
        double c = lineList.getLineDistance(2);
        double s = (a+b+c)/2;
        this.area =  Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public Double getArea() {
        return this.area;
    }
}
