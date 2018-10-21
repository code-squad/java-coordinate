package coordinate.domain;

import java.util.List;

public class Triangle extends AbstractFigure {
    public Triangle(List<Point> points) {
        super(points);
    }

    private double[] findLine() {
        double[] lines = new double[3];
        for (int i = 0; i < 3; i++) {
            lines[i] = getPoint(i).calculateLIne(getPoint((i + 1) % 3));
        }
        return lines;
    }

    @Override
    public String name() {
        return "삼각형";
    }

    @Override
    protected int size() {
        return 3;
    }

    @Override
    public double area() {
        double[] a = findLine();
        double s = (a[0] + a[1] + a[2]) / 2;
        return Math.sqrt(s * (s - a[0]) * (s - a[1]) * (s - a[2]));
    }
}
