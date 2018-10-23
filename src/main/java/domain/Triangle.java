package domain;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;

    private List<Point> points;

    public Triangle(List<Point> points) {
        checkSize(points);
        this.points = points;
    }

    private void checkSize(List<Point> points) {
        if (points.size() != 3) {
            throw new IllegalArgumentException();
        }
    }

    //삼각형 길이 구하기
    private List<Double> calculateTriangleLength() {
        List<Double> lengths = new ArrayList<>();
        lengths.add(points.get(ZERO).calculateLength(points.get(ONE)));
        lengths.add(points.get(ONE).calculateLength(points.get(TWO)));
        lengths.add(points.get(ZERO).calculateLength(points.get(TWO)));
        return lengths;
    }

    //헤론 공식
    private double findS(List<Double> lengths) {
        double sum = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            lengths.add(points.get(i).calculateLength(points.get(i + 1)));
            sum += lengths.get(i);
        }
        lengths.add(points.get(ZERO).calculateLength(points.get(TWO)));
        sum += lengths.get(TWO);
        return (sum / 2);
    }

    public double calculateArea() {
        List<Double> lengths = calculateTriangleLength();
        double s = findS(lengths);
        return Math.sqrt(s * (s - lengths.get(ZERO)) * (s - lengths.get(ONE)) * (s - lengths.get(TWO)));
    }
}
