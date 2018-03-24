package domain;

import java.util.*;

public class CoordinateBase {
    ArrayList<Point> points;

    public CoordinateBase() {

    }

    public CoordinateBase(List<String> numbers) {
        points = new ArrayList<>();
        points = makePoints(numbers);
//        this.points = sortDesc(points);
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

//    ArrayList<Point> sortDesc(ArrayList<Point> points) {
//        ArrayList<Point> newPoints = new ArrayList<>();
//        int originSize = points.size();
//        for (int i = 0; i < originSize; i++) {
//            Point big = findBiggest(points);
//            points.remove(big);
//            newPoints.add(big);
//        }
//        return newPoints;
//    }
//
//    private Point findBiggest(ArrayList<Point> points) {
//        Point big = points.get(0);
//        for (int i = 1; i < points.size(); i++) {
//            Point curr = points.get(i);
//            if (big.getY() < curr.getY()) {
//                big = curr;
//            }
//        }
//        return big;
//    }
//
    public ArrayList<Point> getPoints() {
        return points;
    }

    public HashMap<Integer, LinkedList<Integer>> getPointsList(ArrayList<Point> points) {
        HashMap<Integer, LinkedList<Integer>> pointsList = new HashMap<>();
        LinkedList<Integer> xList = new LinkedList<>();
        for (Point point : points) {
            isEmpty(pointsList, point);
            xList = pointsList.get(point.getY());
            xList.add(point.getX());
            Collections.sort(xList, Point.descSort);
        }
        return pointsList;
    }

    private Boolean isEmpty (HashMap<Integer, LinkedList<Integer>> pointsList, Point point) {
        if (pointsList.get(point.getY()) == null) {  // HashMap에 해당 Y축 라인이 없으면
            pointsList.put(point.getY(), new LinkedList<>()); // 해당 라인에 LinkedList생성
            return true;
        }
        return false;
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
