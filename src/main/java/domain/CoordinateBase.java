package domain;

import java.util.*;

public class CoordinateBase {
    ArrayList<Point> points;

    public CoordinateBase() {
        // for testcase
    }

    public CoordinateBase(List<String> numbers) {
        points = new ArrayList<>();
        points = makePoints(numbers);
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

    public ArrayList<Point> getPoints() {
        return points;
    }

    public Boolean hasNull() {
        return this.points.contains(null);
    }

    public HashMap<Integer, LinkedList<Integer>> getPointsList(ArrayList<Point> points) {
        HashMap<Integer, LinkedList<Integer>> pointsList = new HashMap<>();
        LinkedList<Integer> xList = new LinkedList<>();
        for (Point point : points) {
            makeLine(pointsList, point);
            xList = pointsList.get(point.getY());
            xList.add(point.getX());
            Collections.sort(xList, Point.descSort);
        }
        return pointsList;
    }

    private void makeLine(HashMap<Integer, LinkedList<Integer>> pointsList, Point point) {
        if (pointsList.get(point.getY()) == null) {  // HashMap에 해당 Y축 라인이 없으면
            pointsList.put(point.getY(), new LinkedList<>()); // 해당 라인에 LinkedList생성
        }
    }
}
