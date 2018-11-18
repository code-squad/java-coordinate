package coordinate.domain.Figure;

import coordinate.domain.Coordinate;
import coordinate.domain.Point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle extends AbstractFigure {
    private Triangle(List<Point> coordinate) {
        super(coordinate);
    }

    static Triangle ofCoordinate(List<Point> coordinate) {
        return new Triangle(coordinate);
    }

    @Override
    public int size() {
        return 3;
    }

    @Override
    public String getName() {
        return "삼각형";
    }

    @Override
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
        for (Figure line : generateLines()) linesDistance.add(line.getArea());

        return linesDistance;
    }

    List<Figure> generateLines() {
        List<Figure> lines = new ArrayList<>();
        lines.add(FigureFactory.getInstance(compareValue(Coordinate.ZERO, Coordinate.ONE)));
        lines.add(FigureFactory.getInstance(compareValue(Coordinate.ONE, Point.TWO)));
        lines.add(FigureFactory.getInstance(compareValue(Coordinate.ZERO, Point.TWO)));

        return lines;
    }

    private List<Point> compareValue(int firstValue, int compareValue) {
        return Arrays.asList(coordinate.get(firstValue), coordinate.get(compareValue));
    }
}
