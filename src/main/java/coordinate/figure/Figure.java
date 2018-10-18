package coordinate.figure;

import coordinate.Point;

import java.util.*;

public abstract class Figure implements FigureMessage , FigureProperty{
    private List<Point> points;

    public Figure(List<Point> points) {
        this.points = points;
    }

    protected List<Double> eachLengthFromFirstPoint() {
        List<Double> lengths = new ArrayList<>();
        for (int i = 1; i < points.size(); ++i) {
            lengths.add(points.get(0).calculatorLength(points.get(i)));
        }
        return lengths;
    }

    protected Point getPoints(int index) {
        return points.get(index);
    }
}
