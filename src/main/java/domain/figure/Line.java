package domain.figure;

import domain.point.Point;
import domain.point.Points;

import java.util.List;
import java.util.function.Function;

public class Line {
    public static final int VALID_COORDINATE_NUM = 2;
    private Points pointRepo;

    public Line(Points points) {
        if (isInvalidCoordinateNum(points.getSavedSize())) {
            throw new IllegalArgumentException(VALID_COORDINATE_NUM + "개 좌표가 입력되어야합니다");
        }
        this.pointRepo = points;
    }

    private static boolean isInvalidCoordinateNum(int pointNum) {
        return pointNum != VALID_COORDINATE_NUM;
    }

    public double calcDistance() {
        List<Point> calcPoints = pointRepo.getPoints();
        double xDiffSquare = calcDiffSquare(calcDiffPosition(calcPoints, Point::getXPosition));
        double yDiffSquare = calcDiffSquare(calcDiffPosition(calcPoints, Point::getYPosition));
        return calcSquareRoot(xDiffSquare + yDiffSquare);
    }

    private double calcSquareRoot(double num) {
        return Math.sqrt(num);
    }

    private double calcDiffSquare(int positionDiff) {
        return Math.pow(positionDiff, 2);
    }

    private static int calcDiffPosition(List<Point> calcPoints, Function<Point, Integer> getPosition) {
        return calcPoints.stream().map(getPosition).reduce((x1, x2) -> x2 - x1).get();
    }
}
