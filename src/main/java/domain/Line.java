package domain;

import domain.point.Point;

import java.util.List;

public class Line {
    public static final int VALID_COORDINATE_NUM = 2;
    private Point aSide;
    private Point bSide;

    public Line(List<Point> points) {
        if (isInvalidPointNum(points)) {
            throw new IllegalArgumentException("좌표 입력 오류(" + VALID_COORDINATE_NUM + "개 되어야함)");
        }
        aSide = points.get(0);
        bSide = points.get(1);
    }

    public Line(Point aSidePoint, Point bSidePoint) {
        this.aSide = aSidePoint;
        this.bSide = bSidePoint;
    }

    public static boolean isInvalidPointNum(List<Point> points) {
        return points.size() != VALID_COORDINATE_NUM;
    }

    public double calcDistance() {
        return aSide.calcDistance(bSide);
    }
}
