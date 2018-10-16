package coordinate.figure;

import coordinate.Point;

import java.util.*;

public abstract class Figure {
    private List<Point> points;

    public Figure(List<Point> points) {
        this.points = points;
    }

    public abstract double area();

    public abstract String name();

    public List<Double> oneLength() {
        List<Double> lengths = new ArrayList<>();
        for (int i = 1; i < points.size(); ++i) {
            lengths.add(points.get(0).calculatorLength(points.get(i)));
        }
        return lengths;
    }

    public List<Point> getPoints() {
        return points;
    }

}
