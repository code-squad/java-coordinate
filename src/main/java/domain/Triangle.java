package domain;

import java.util.ArrayList;
import java.util.List;

public class Triangle extends Figure {
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int THREE = 3;

    Triangle(List<Point> points) {
        super(points);
        checkSize(THREE);
    }

    //삼각형 길이 구하기
    private List<Double> calculateTriangleLength() {
        List<Double> lengths = new ArrayList<>();
        lengths.add(getPoint(ZERO).calculateLength(getPoint(ONE)));
        lengths.add(getPoint(ONE).calculateLength(getPoint(TWO)));
        lengths.add(getPoint(ZERO).calculateLength(getPoint(TWO)));
        return lengths;
    }

    //헤론 공식
    private double findS(List<Double> lengths) {
        double sum = 0;
        for (int i = 0; i < getPointsSize() - 1; i++) {
            lengths.add(getPoint(i).calculateLength(getPoint(i + 1)));
            sum += lengths.get(i);
        }
        lengths.add(getPoint(ZERO).calculateLength(getPoint(TWO)));
        sum += lengths.get(TWO);
        return (sum / 2);
    }

    @Override
    public String name() {
        return "삼각형의 넓이는 ";
    }

    @Override
    public String area() {
        List<Double> lengths = calculateTriangleLength();
        double s = findS(lengths);
        return String.format("%.1f", Math.sqrt(s * (s - lengths.get(ZERO)) * (s - lengths.get(ONE)) * (s - lengths.get(TWO))));
    }
}
