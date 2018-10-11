package coordinate.domain;

import coordinate.dto.PointDTO;

public class Point {
    private int xPoint;
    private int yPoint;

    public Point(int x, int y) {
        this.xPoint = x;
        this.yPoint = y;
    }

    public double calculateLIne(Point point) {
        int a = this.xPoint - point.xPoint;
        int b = this.yPoint - point.yPoint;
        return Math.sqrt((Math.pow(a,2) + Math.pow(b,2)));
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
}
