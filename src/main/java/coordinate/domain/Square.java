package coordinate.domain;

import java.util.List;


// 4개의 포인트를 받고 포인트객체에로 넘겨 각 포인트값을 구하고 사각형 넓이를 구한다.
public class Square {
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    public Square(List<String> points) {
        point1 = new Point(points.get(0));
        point2 = new Point(points.get(1));
        point3 = new Point(points.get(2));
        point4 = new Point(points.get(3));
    }

    public int width() {
        return Math.abs(point1.getPointX() - point2.getPointX());
    }

    public int height() {
        return Math.abs(point3.getPointY() - point2.getPointY());
    }

    public int getSquareArea() {
        return width() * height();
    }
}
