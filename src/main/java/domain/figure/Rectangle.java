package domain.figure;

import domain.point.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Rectangle implements Figure {
    public static final int VALID_COORDINATE_NUM = 4;
    private ArrayList<Point> points;

    Rectangle(ArrayList<Point> points) {
        if(isInvalidPointNum(points)) {
            throw new IllegalArgumentException("좌표 입력 오류(" + VALID_COORDINATE_NUM + "개 되어야함)");
        }
        this.points = points;
    }

    public static boolean isInvalidPointNum(ArrayList<Point> points) {
        return points.size() != VALID_COORDINATE_NUM;
    }

    public static boolean isValidRectPoints(ArrayList<Point> points) {
        return verifyRectPoints(points, Point::getXPosition) && verifyRectPoints(points, Point::getYPosition);
    }

    private static boolean verifyRectPoints(List<Point> points, Function<Point, Integer> getPosition) {
        return points.stream().map(getPosition).distinct().count() == (VALID_COORDINATE_NUM / 2);
    }


    // TODO : 여기 바꾸기
    @Override
    public double calcArea() {
        List<Point> diffXPoints = diffXPositionPoint(points);
        List<Point> diffYPoints = diffYPositionPoint(points);
        for (Point point : diffXPoints) {
            System.out.println(point.toString());
        }
        for (Point point : diffYPoints) {
            System.out.println(point.toString());
        }
        return 0;
    }

    private List<Point> diffXPositionPoint(List<Point> points) {
        List<Point> diffPoints = new ArrayList<>();
        int stdPosition = -1;
        for (Point point : points) {
            if (!point.isMatchXPosition(stdPosition)) {
                diffPoints.add(point);
                stdPosition = point.getXPosition();
            }
        }
        return diffPoints;
    }

    private List<Point> diffYPositionPoint(List<Point> points) {
        List<Point> diffPoints = new ArrayList<>();
        int stdPosition = -1;
        for (Point point : points) {
            if (!point.isMatchYPosition(stdPosition)) {
                diffPoints.add(point);
                stdPosition = point.getYPosition();
            }
        }
        return diffPoints;
    }


    @Override
    public String getFigureName() {
        return "사각형";
    }
}
