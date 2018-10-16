package domain;

import util.PointException;

import java.util.*;

public class Rectangle extends Figure {
    public Rectangle(List<Point> points) throws PointException {
        super(points);
        if(!isComputable()) {
            throw new PointException("네점이 뒤뜰어진 형태의 사각형입니다.");
        }
    }

    @Override
    public boolean isComputable() throws PointException {
        /* 직사각형 확인 --> (조건 : 두 직선이 평행이고, 평행인 직선의 길이가 같으면 직사각형) */
        if(isParallel() && isSameDistance()) {
            return true;
        }
        return false;
    }

    private boolean isSameDistance() throws PointException {
        return getLineLength(getPoint(0), getPoint(1)) == getLineLength(getPoint(2), getPoint(3));
    }

    private boolean isParallel() {
        for(int i = 0; i < getPointCount() - 1; i+=2) {
            if(!isRightAngle(getPoint(i), getPoint(i + 1))) {
                return false;
            }
        }
        return true;
    }

    protected boolean isRightAngle(Point point1, Point point2) {
        /* 테스트를 위해 protected 기울기가 0이면 수직이고, 사각형의 세로 직선이 수직이면 평행 */
        return point1.getGradient(point2) == 0;
    }

    @Override
    public double area() throws PointException {
        return getLineLength(getPoint(0), getPoint(1)) * getLineLength(getPoint(2), getPoint(3));
    }
}

