package domain.figure;

import domain.point.Point;
import domain.point.Points;

import java.util.List;
import java.util.function.Function;

public class Rectangle {
    public static final int VALID_COORDINATE_NUM = 4;
    private Points pointRepo;

    public Rectangle(Points pointRepo) {
        this.pointRepo = pointRepo;
    }

    public static boolean isRectPointNum(Points pointRepo) {
        return pointRepo.getSavedSize() == VALID_COORDINATE_NUM;
    }

    public static boolean isValidRectPoints(Points pointRepo) {
        List<Point> points = pointRepo.getPoints();
        return verifyRectPoints(points, Point::getXPosition) && verifyRectPoints(points, Point::getYPosition);
    }

    private static boolean verifyRectPoints(List<Point> points, Function<Point, Integer> getPosition) {
        return points.stream().map(getPosition).distinct().count() == (VALID_COORDINATE_NUM / 2);
    }

    public int calcArea() {
        List<Point> points = pointRepo.getPoints();
        int length = getDiffPosition(points, Point::getXPosition);
        int height = getDiffPosition(points, Point::getYPosition);
        return length * height;
    }

    private int getDiffPosition(List<Point> points, Function<Point, Integer> getPosition) {
        return points.stream().map(getPosition).distinct().reduce((a, b) -> Math.abs(a - b)).get();
    }
}
