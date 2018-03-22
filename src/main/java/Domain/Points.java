package Domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Points {

    public static final int LINE_POINT_NUMBER = 2;
    public static final int RECTANGLE_POINT_NUMBER = 4;
    private List<Point> points;
    private boolean line;

    private Points() {
    }

    private Points(List<Point> points) {
        this.points = points;
    }

    public static Points of() {
        return new Points();
    }

    public static Points of(List<Point> points) {
        return new Points(points);
    }

    static Points setCoordinates(List<String> coordinates) {
        ArrayList<Point> points = new ArrayList<>();
        for (String coordinate : coordinates) {
            String[] pair = coordinate.split(",");
            points.add(Point.of(Integer.parseInt(pair[0]), Integer.parseInt(pair[1])));
        }
        return Points.of(points);
    }

    public int getX(int i) {
        return points.get(i).getX();
    }

    public int getY(int i) {
        return points.get(i).getY();
    }

    public boolean contains(int x, int y) {
        return points.contains(Point.of(x, y));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Points points1 = (Points) o;
        return Objects.equals(points, points1.points);
    }

    @Override
    public int hashCode() {

        return Objects.hash(points);
    }

    public boolean isLine() {
        return points.size() == LINE_POINT_NUMBER;
    }

    public boolean isRectangle() {
        return points.size() == RECTANGLE_POINT_NUMBER;
    }
}
