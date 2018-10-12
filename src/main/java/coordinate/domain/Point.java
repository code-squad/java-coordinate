package coordinate.domain;

import coordinate.dto.PointDTO;

import java.util.Objects;

public class Point {
    private int xPoint;
    private int yPoint;

    public Point(int x, int y) {
        this.xPoint = isException(x);
        this.yPoint = isException(y);
    }

    public double calculateLIne(Point point) {
        int a = this.xPoint - point.xPoint;
        int b = this.yPoint - point.yPoint;
        return Math.sqrt((Math.pow(a,2) + Math.pow(b,2)));
    }

    public Boolean commpareXPoint(Point point) {
        if (this.xPoint == point.xPoint)  {
            return true;
        }
        return false;
    }

    public Boolean commpareYPoint(Point point) {
        if (this.yPoint == point.yPoint)  {
            return true;
        }
        return false;
    }

    public int subtractionXPoint(Point point) {
        return Math.abs(this.xPoint - point.xPoint);
    }
    public int subtractionYPoint(Point point) {
        return Math.abs(this.yPoint - point.yPoint);
    }


    public int isException(int num) {
        if (num >25 || num < 0) {
            throw new IllegalArgumentException("유효한 범위를 초과 합니다.");
        }
        return num;
    }
    public PointDTO makePointDTO() {
        return new PointDTO(this.xPoint,this.yPoint);
    }

    public int getXPoint() {
        return xPoint;
    }

    public int getYPoint() {
        return yPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return xPoint == point.xPoint &&
                yPoint == point.yPoint;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xPoint, yPoint);
    }
}
