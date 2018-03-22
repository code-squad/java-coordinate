package domain;

import domain.point.Point;

import java.util.ArrayList;
import java.util.List;

public class Line {
    public static final int VALID_COORDINATE_NUM = 2;
    private Point aSidePoint;
    private Point bSidePoint;

    public Line(ArrayList<Point> points) {
        if (isInvalidPointNum(points)) {
            throw new IllegalArgumentException("좌표 입력 오류(" + VALID_COORDINATE_NUM + "개 되어야함)");
        }
        aSidePoint = points.get(0);
        bSidePoint = points.get(1);
    }

    public Line(Point aSidePoint, Point bSidePoint) {
        this.aSidePoint = aSidePoint;
        this.aSidePoint = bSidePoint;
    }

    public static boolean isInvalidPointNum(ArrayList<Point> points) {
        return points.size() != VALID_COORDINATE_NUM;
    }

    public double calcDistance() {
        return aSidePoint.calcDistance(bSidePoint);
    }
}
