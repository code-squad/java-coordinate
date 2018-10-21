package coordinate.domain;

import java.util.HashSet;
import java.util.List;

public class Rectangle extends AbstractFigure {
    public Rectangle(List<Point> points) {
        super(points);
    }

    private int[] findBaseHeight() {
        int[] BaseAndHeight = new int[2];
        for (int i = 1; i < getPoints().size(); i++) {
            if (getPoint(0).compareXPoint(getPoint(i)).equals(true)) {
                BaseAndHeight[0] = getPoint(0).subtractionYPoint(getPoint(i));
            }
            if (getPoint(0).compareYPoint(getPoint(i)).equals(true)) {
                BaseAndHeight[1] = getPoint(0).subtractionXPoint(getPoint(i));
            }
        }
        return BaseAndHeight;
    }

    @Override
    protected boolean isFigure() {
        HashSet<Integer> base = new HashSet<>();
        HashSet<Integer> height = new HashSet<>();
        for (Point point : getPoints()) {
            base.add(point.getXPoint());
            height.add(point.getYPoint());
        }
        return base.size() == 2 && height.size() == 2;
    }

    @Override
    public String name() {
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
