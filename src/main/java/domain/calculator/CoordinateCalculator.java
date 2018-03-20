package domain.calculator;

import domain.point.Point;
import domain.point.Points;

import java.util.ArrayList;
import java.util.function.Function;

public class CoordinateCalculator {

    public static double calcDistance(Points pointRepo) {
        ArrayList<Point> calcPoints = pointRepo.getDistanceCalcPoints();
        double xDiffSquare = calcDiffSquare(calcDiffPosition(calcPoints, Point::getXPosition));
        double yDiffSquare = calcDiffSquare(calcDiffPosition(calcPoints, Point::getYPosition));
        return calcSquareRoot(xDiffSquare + yDiffSquare);
    }

    private static double calcSquareRoot(double num) {
        return Math.sqrt(num);
    }

    private static double calcDiffSquare(int positionDiff) {
        return Math.pow(positionDiff, 2);
    }

    private static int calcDiffPosition(ArrayList<Point> calcPoints, Function<Point, Integer> getPosition) {
        return calcPoints.stream().map(getPosition).reduce((x1, x2) -> x2 - x1).get();
    }
}
