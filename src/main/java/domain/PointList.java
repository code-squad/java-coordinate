package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PointList {
    private static ArrayList<Point> points = new ArrayList<>();

    public static ArrayList<Point> getPoints() {
        return points;
    }

    public static void makePoints(List<String> numbers) {
        int x, y;
        for (int i = 0; i < numbers.size(); i = i + 2) {
                x = Integer.parseInt(numbers.get(i));
                y = Integer.parseInt(numbers.get(i + 1));
                points.add(Point.getPoint(x, y));
        }
        sortDesc();
    }

    public static Boolean hasNull() {
        if (points.contains(null)) {
            return true;
        }
        return false;
    }

    private static void sortDesc() {
        Collections.sort(points, descSort);
    }

    // 이 comparator의 위치는 point와 pointList중 어디가 적절한가
    private static Comparator<Point> descSort = new Comparator<Point>() {
        @Override
        public int compare(Point o1, Point o2) {
            Integer o1Y = o1.getY();
            Integer o2Y = o2.getY();
            int compareResult = o1Y.compareTo(o2Y);

            if (compareResult != 0) {
                return compareResult * -1; // 기본값에 -1을 곱하면 descending
            }

            Integer o1X = o1.getX();
            Integer o2X = o2.getX();
            compareResult = o1X.compareTo(o2X);
            return compareResult;
        }
    };

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Point point : points) {
            sb.append(point.toString());
            sb.append('\n');
        }
        return sb.toString();
    }
}
