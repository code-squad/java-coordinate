package domain;

import dto.ResultDto;
import util.PointException;

import java.util.*;

public abstract class Figure {
    /* 이 부분을 private 로 왜 구현을 해야하는지 모르겠음.. 공통적인 부분인데.. 상속관계에서 사용하는 로직이 공유할려면 protected를 해야하지 않나요? */
    protected List<Point> points;

    abstract public double evaluate() throws PointException;
    abstract boolean isComputable() throws PointException;

    protected ResultDto createDto() throws PointException {
        return new ResultDto(points, evaluate(), getPointCount());
    }

    protected double getLineLength(Point point1, Point point2) throws PointException {
        return point1.getDistance(point2);
    }

    public int getPointCount() {
        return points.size();
    }

}
