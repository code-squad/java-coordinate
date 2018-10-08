package domain;

import util.PointException;

import java.util.*;

public class Rectangle implements Figure {
    private List<Point> points;

    public Rectangle(List<Point> points) throws PointException {
        this.points = points;
        if(!isComputabble()) {
            throw new PointException("네점이 뒤뜰어진 형태의 사각형입니다.");
        }
        Collections.sort(points);
    }

    public boolean isComputabble() {
        return isComputableCoordinate(setPointsX()) && isComputableCoordinate(setPointsY());
    }

    private List<Integer> setPointsX() {
        List<Integer> pointsX = new ArrayList<>();
        for(Point point : points) {
            pointsX.add(point.getX());
        }
        return pointsX;
    }

    private List<Integer> setPointsY() {
        List<Integer> pointsY = new ArrayList<>();
        for(Point point : points) {
            pointsY.add(point.getY());
        }
        return pointsY;
    }

    private boolean isComputableCoordinate(List<Integer> pointsCoordinate) {
        Collections.sort(pointsCoordinate);
        if(pointsCoordinate.get(0) == pointsCoordinate.get(1) && pointsCoordinate.get(2) == pointsCoordinate.get(3)
                && pointsCoordinate.get(1) != pointsCoordinate.get(2)) {
            return true;
        }
        return false;
    }

    @Override
    public String evaluate() {
        return stringFormat((getAbs(points.get(3).getX() - points.get(0).getX())) * (getAbs(points.get(3).getY() - points.get(0).getY())));
    }

    private int getAbs(int num) {
        return Math.abs(num);
    }

    @Override
    public List<Point> getPoints() {
        return Collections.unmodifiableList(points);
    }

    @Override
    public String stringFormat(Number value) {
        return String.format("사각형의 넓이는 : %d", value);
    }
}

