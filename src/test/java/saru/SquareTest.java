package saru;

import saru.domain.*;

import java.util.*;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SquareTest {
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
