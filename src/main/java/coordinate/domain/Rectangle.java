package coordinate.domain;

import java.util.ArrayList;
import java.util.HashSet;

public class Rectangle extends AbstractFigure {
    private HashSet<Integer> base = new HashSet<>();
    private HashSet<Integer> height = new HashSet<>();

    public Rectangle(ArrayList<Point> points) {
        super(points);
        for (Point point : this.points) {
            this.base.add(point.getXPoint());
            this.height.add(point.getYPoint());
        }
    }

    private int[] findBaseHeight() {
        int[] BaseAndHeight = new int[2];
        for (int i = 1; i < points.size(); i++) {
            if (points.get(0).compareXPoint(points.get(i)).equals(true)) {
                BaseAndHeight[0] = points.get(0).subtractionYPoint(points.get(i));
            }
            if (points.get(0).compareYPoint(points.get(i)).equals(true)) {
                BaseAndHeight[1] = points.get(0).subtractionXPoint(points.get(i));
            }
        }
        return BaseAndHeight;
    }

    @Override
    protected boolean isFigure() {
        return this.base.size() == 2 && this.height.size() == 2;
    }

    @Override
    protected String name() {
        return "사각형";
    }

    @Override
    protected int size() {
        return 4;
    }

    @Override
    public double area() {
        int[] a = findBaseHeight();
        return a[0] * a[1];
    }
}
