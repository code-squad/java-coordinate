package saru;

import saru.domain.*;

import java.util.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {
    @Test(expected = IllegalArgumentException.class)
    public void invalidSquareCount() {
        Point point1 = new Point(4, 3, true);
        Point point2 = new Point(5, 3, true);
        Point point3 = new Point(5, 7, true);

        Set<Point> points = new HashSet<>();
        points.add(point1);
        points.add(point2);
        points.add(point3);

        CoordinateCalc coordinateCalc = new CoordinateCalc(points);
        coordinateCalc.calcProc();
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidSquarePosition() {
        Point point1 = new Point(4, 3, true);
        Point point2 = new Point(5, 3, true);
        Point point3 = new Point(5, 7, true);
        Point point4 = new Point(3, 7, true);

        Set<Point> points = new HashSet<>();
        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);

        Square square = new Square(points);
        square.area();
    }

    @Test
    public void getMinMaxValue() {
        Point point1 = new Point(3, 3, true);
        Point point2 = new Point(5, 3, true);
        Point point3 = new Point(5, 7, true);
        Point point4 = new Point(3, 7, true);

        Set<Point> points = new HashSet<>();
        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);

        double minX = SquareUtil.getMinXValue(points);
        assertEquals(3, minX, 0.001);

        double minY = SquareUtil.getMinYValue(points);
        assertEquals(3, minY, 0.001);

        double maxX = SquareUtil.getMaxXValue(points);
        assertEquals(5, maxX, 0.001);

        double maxY = SquareUtil.getMaxYValue(points);
        assertEquals(7, maxY, 0.001);
    }

    @Test
    public void squareCalc() {
        Point point1 = new Point(3, 7, true);
        Point point2 = new Point(5, 7, true);
        Point point3 = new Point(5, 3, true);
        Point point4 = new Point(3, 3, true);

        Set<Point> points = new HashSet<>();
        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);

        Square square = new Square(points);
        assertEquals(8, square.area(), 0.001);
    }
}
