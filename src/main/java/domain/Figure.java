package domain;

import dto.ResultDto;
import util.PointException;

import java.util.*;

public abstract class Figure implements Coordinate {
    private List<Point> points;

    public Figure(List<Point> points) {
        this.points = points;
        Collections.sort(points);
    }

    public ResultDto createDto() throws PointException {
        return new ResultDto(points, area(), getPointCount());
    }

    protected double getLineLength(Point point1, Point point2)  {
        return point1.getDistance(point2);
    }

    protected int getPointCount() {
        return points.size();
    }

    protected Point getPoint(int index) {
        return points.get(index);
    }

}
