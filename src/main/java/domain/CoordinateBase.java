package domain;

import java.util.*;

public class CoordinateBase {
    ArrayList<Point> points;

    public CoordinateBase() {
        // for testcase
    }

    public CoordinateBase(List<String> numbers) {
        points = makePoints(numbers);
        sortDesc(points);
        for (Point point : points) {
            System.out.println(point.toString());
        }
    }

    private ArrayList<Point> makePoints(List<String> numbers) {
        ArrayList<Point> points = new ArrayList<>();
        int x, y;
        for (int i = 0; i < numbers.size(); i = i + 2) {
            x = Integer.parseInt(numbers.get(i));
            y = Integer.parseInt(numbers.get(i + 1));
//            System.out.println("x : " + x + " y : " + y);
            points.add(Point.getPoint(x, y));
        }
        return points;
    }

    private void sortDesc(ArrayList<Point> points) {
        Collections.sort(points, Point.descSort);
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public Boolean hasNull() {
        return this.points.contains(null);
    }
}
