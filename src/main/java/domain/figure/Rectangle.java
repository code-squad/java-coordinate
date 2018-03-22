package domain.figure;

import domain.point.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Rectangle implements Figure {
    public static final int VALID_COORDINATE_NUM = 4;
    private List<Point> points;

    Rectangle(List<Point> points) {
        if(isInvalidPointNum(points)) {
            throw new IllegalArgumentException("좌표 입력 오류(" + VALID_COORDINATE_NUM + "개 되어야함)");
        }
        this.points = points;
    }

    public static boolean isInvalidPointNum(List<Point> points) {
        return points.size() != VALID_COORDINATE_NUM;
    }

    public static boolean isValidRectPoints(List<Point> points) {
        return verifyRectPoints(points, Point::getXPosition) && verifyRectPoints(points, Point::getYPosition);
    }

    private static boolean verifyRectPoints(List<Point> points, Function<Point, Integer> getPosition) {
        return points.stream().map(getPosition).distinct().count() == (VALID_COORDINATE_NUM / 2);
    }

    // TODO : 여기 바꾸기
    @Override
    public double calcArea() {

        return 0;
    }

    @Override
    public String getFigureName() {
        return "사각형";
    }
}
