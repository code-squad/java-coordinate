package domain;

import domain.point.Point;
import domain.point.Points;

import java.util.List;
import java.util.function.Function;

public class Line {
    public static final int VALID_COORDINATE_NUM = 2;
    private Points pointRepo;

    public Line(Points points) {
        this.pointRepo = points;
    }

    public Line(Point aSidePoint, Point bSidePoint) {
        this(createPoints(aSidePoint, bSidePoint));
    }

    private static Points createPoints(Point aSidePoint, Point bSidePoint) {
        Points pointRepo = new Points();
        pointRepo.addPoint(aSidePoint.getXPosition(), aSidePoint.getYPosition());
        pointRepo.addPoint(bSidePoint.getXPosition(), bSidePoint.getYPosition());
        return pointRepo;
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
