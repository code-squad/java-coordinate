package domain;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;

    private List<Point> points;

    public Triangle(List<Point> points) {
        this.points = points;
    }

    //삼각형 길이 구하기
    private List<Double> calculateTriangleLength() {
        List<Double> length = new ArrayList<>();
        length.add(points.get(ZERO).calculateLength(points.get(ONE)));
        length.add(points.get(ONE).calculateLength(points.get(TWO)));
        length.add(points.get(ZERO).calculateLength(points.get(TWO)));
        return length;
    }

    //헤론 공식
    private double findS(List<Double> length) {
        double sum = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            length.add(points.get(i).calculateLength(points.get(i + 1)));
            sum += length.get(i);
        }
        length.add(points.get(ZERO).calculateLength(points.get(TWO)));
        sum += length.get(TWO);
        return (sum / 2);
    }

    public double calculateArea() {
        List<Double> length = calculateTriangleLength();
        double s = findS(length);
        return Math.sqrt(s * (s - length.get(ZERO)) * (s - length.get(ONE)) * (s - length.get(TWO)));
    }
}
