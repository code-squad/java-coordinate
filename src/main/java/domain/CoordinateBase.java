package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CoordinateBase {
    ArrayList<Point> points;

    public CoordinateBase(List<String> numbers) {
        points = new ArrayList<>();
        this.points = makePoints(numbers);
    }

    private ArrayList<Point> makePoints(List<String> numbers) {
        ArrayList<Point> points = new ArrayList<>();
        int x, y;
        for (int i = 0; i < numbers.size(); i = i + 2) {
            x = Integer.parseInt(numbers.get(i));
            y = Integer.parseInt(numbers.get(i + 1));
            System.out.println("x : " + x + " y : " + y);
            points.add(Point.getPoint(x, y));
        }
        return points;
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    //    private void baseSetup(ArrayList<Point> points) {
//        this.lines = new ArrayList<>(Collections.nCopies(24, null));
//        for (Point point : points) {
//            Line.addLine(point.getX() - 1, point.getY() - 1, lines); // 0부터 시작하는 것 보정
//        }
//    }
//
//    public ArrayList<Line> getLines() {
//        return lines;
//    }
}
