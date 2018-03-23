package coordinate.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static coordinate.domain.Square.*;

public class SquareTest {
    private List<Point> points;

    @Before
    public void setUp() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(10, 0);
        Point p3 = new Point(0, 10);
        Point p4 = new Point(10, 10);
        points = Arrays.asList(p1, p2, p3, p4);
    }

    @Test
    public void calculateBaseTest() {
        assertEquals(10, calculateBase(points));
    }

    @Test
    public void calculateHeightTest() {
        assertEquals(10, calculateHeight(points));
    }

    @Test
    public void isSquareTrue() {
        assertEquals(true, isSquare(points)); //returns the same points list
    }

    @Test
    public void isSquareFalse() {
        Point p1 = new Point(0, 1); //supposed to be (0,0) here
        Point p2 = new Point(10, 0);
        Point p3 = new Point(0, 10);
        Point p4 = new Point(10, 10);
        List<Point> points = Arrays.asList(p1, p2, p3, p4);
        assertEquals(false, isSquare(points)); //returns the same points list
    }
}