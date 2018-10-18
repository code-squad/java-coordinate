package coordinate.figure;

import coordinate.Point;

import java.util.List;

public class Triangle extends Figure {
    public Triangle(List<Point> points) {
        super(points);
    }

    double calculatorTriangle() {
        List<Double> lengths = eachLengthFromFirstPoint();
        lengths.add(getPoints(1).calculatorLength(getPoints(2)));
        double halfSumAllLength = sumAllLength(lengths);
        double triangleLength = heronFormula(lengths, halfSumAllLength);
        return Math.sqrt(triangleLength * halfSumAllLength);
    }

    private double sumAllLength(List<Double> lengths) {
        double sumAllLength = 0;
        for (Double length : lengths) {
            sumAllLength += length;
        }
        return sumAllLength / 2;
    }

    private double heronFormula(List<Double> lengths, double halfSumAllLength) {
        double triangleLength = 1;
        for (Double length : lengths) {
            triangleLength *= halfSumAllLength - length;
        }
        return triangleLength;
    }

    @Override
    public String outputMessage() {
        return name() + area();
    }

    @Override
    public double area() {
        return Math.round(calculatorTriangle());
    }

    @Override
    public String name() {
        return "삼각형의 넓이는 ";
    }
}
