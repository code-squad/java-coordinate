package coordinate.domain;

import java.util.ArrayList;
import java.util.HashSet;

public class Rectangle {
    private ArrayList<Point> points;
    private HashSet<Integer> base = new HashSet<>();
    private HashSet<Integer> height = new HashSet<>();

    public Rectangle(ArrayList<Point> points) {
        this.points = points;
        for (Point point : this.points) {
            this.base.add(point.getXPoint());
            this.height.add(point.getYPoint());
        }
    }

    public String calculate() {
        if (this.points.size() < 4) {
            return "사각형이 아닙니다.";
        }
        if (isRectangle().equals(false)) {
            throw new IllegalArgumentException("사각형이 아닙니다.");
        }
        int[] a = findBaseHeight();
        return "사각형의 면적은 " + (a[0] * a[1]) + " 입니다.";
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

    private Boolean isRectangle() {
        return (this.base.size() == 2 && this.height.size() == 2);
    }
}
