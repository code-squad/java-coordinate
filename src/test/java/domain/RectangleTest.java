package domain;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RectangleTest {
    List<Point> points;

    @Before
    public void setUp() {
        points = new ArrayList<>();

        points.add(Point.init(1, 1));
        points.add(Point.init(10, 1));
        points.add(Point.init(10, 10));
        points.add(Point.init(1, 10));
    }

    @Test
    public void area() {
        Figure r = Figure.init(points);

        assertEquals(r.area(), 81.0, 0.1);
    }

    @Test
    public void searchSameXPoint() {
        Point p = points.get(0);

        assertEquals(p.isSameX(Rectangle.searchSameXPoint(points, p)), Boolean.TRUE);
    }

    @Test
    public void searchSameYPoint() {
        Point p = points.get(0);

        assertEquals(p.isSameY(Rectangle.searchSameYPoint(points, p)), Boolean.TRUE);
    }

}