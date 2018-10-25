package domain;

import java.util.ArrayList;
import java.util.List;

public class PointsFactory {
    private static final int X_POSITION = 0;
    private static final int Y_POSITION = 1;

    public static List<Point> makePoints(List<Integer[]> positions) {
        List<Point> points = new ArrayList<>();
        for (Integer[] position : positions) {
            Point point = new Point(position[X_POSITION], position[Y_POSITION]);
            points.add(point);
        }
        return points;
    }
}