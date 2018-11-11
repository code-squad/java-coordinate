package coordinate.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle {
    private List<Point> coordinate;

    private Triangle(List<Point> coordinate) {
        this.coordinate = coordinate;
    }

    public static Triangle ofCoordinate(List<Point> coordinate) {
        return new Triangle(coordinate);
    }

    public double getArea() {
        List<Double> linesDistance = generateLinesDistance();

        double a = linesDistance.get(Coordinate.ZERO);
        double b = linesDistance.get(Coordinate.ONE);
        double c = linesDistance.get(Point.TWO);
        double s = (a + b + c) / Point.TWO;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    List<Double> generateLinesDistance() {
        List<Double> linesDistance = new ArrayList<>();
        for (Line line : generateLines()) linesDistance.add(line.getLineLength());

        return linesDistance;
    }

    List<Line> generateLines() {
        List<Line> lines = new ArrayList<>();
        lines.add(Line.ofCoordinate(compareValue(Coordinate.ZERO, Coordinate.ONE)));
        lines.add(Line.ofCoordinate(compareValue(Coordinate.ONE, Point.TWO)));
        lines.add(Line.ofCoordinate(compareValue(Coordinate.ZERO, Point.TWO)));

        return lines;
    }

    private List<Point> compareValue(int firstValue, int compareValue) {
        return Arrays.asList(coordinate.get(firstValue), coordinate.get(compareValue));
    }
}
