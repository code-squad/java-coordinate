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
        Point aSidePoint = calcPoints.get(0);
        Point bSidePoint = calcPoints.get(1);
        return aSidePoint.calcDistance(bSidePoint);
    }
}
