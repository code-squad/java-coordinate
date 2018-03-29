package domain;

import java.util.List;

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
        double s = (a + b + c) / 2;
        this.area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public Double getArea() {
        return this.area;
    }

    public static Boolean isTriangle(List<Line> lines) throws Exception {
        int pointsSize = lines.size(); //삼각형은 점의 개수와 라인의 개수가 동일하다.
        if (ShapeType.TRIANGLE.isTriangle(pointsSize)) {
            return true;
        }
        throw new Exception("(선, 삼각형, 직사각형)을 만들 수 없는 좌표입니다.");
    }
}
