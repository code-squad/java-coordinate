package saru;

import org.junit.Before;
import saru.domain.*;

import java.util.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SquareTest {
    private Set<Point> points;

    @Before
    public void init() {
        points = new HashSet<>();
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidSquarePosition() {
        addSetIllegalValue();

        FigureCalc square = new Square(points);
        square.area();
    }

    private void addSetIllegalValue() {
        Point point1 = new Point(4, 3, true);
        Point point2 = new Point(5, 3, true);
        Point point3 = new Point(5, 7, true);
        Point point4 = new Point(3, 7, true);

        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);
    }

    @Test
    public void squareCalc() {
        addSetNormalValue();

        Square square = new Square(points);
        assertEquals(8, square.area(), 0.001);
    }

    private void addSetNormalValue() {
        Point point1 = new Point(3, 7, true);
        Point point2 = new Point(5, 7, true);
        Point point3 = new Point(5, 3, true);
        Point point4 = new Point(3, 3, true);

        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);
    }
}
