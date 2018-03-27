package domain;

import java.util.ArrayList;

public class Triangle extends Shape {
    private Double area;

    public Triangle(LineList lineList) {
        super(ShapeType.TRIANGLE);
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

    public static Boolean isTriangle(ArrayList<Line> lines) {
        int pointsSize = lines.size(); //삼각형은 점의 개수와 라인의 개수가 동일하다.
        if (ShapeType.TRIANGLE.isTriangle(pointsSize)) {
            return true;
        }
        return false;
    }
}
