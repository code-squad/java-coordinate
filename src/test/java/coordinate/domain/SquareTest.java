package coordinate.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SquareTest {
    private List<Point> points;
    private Square square;

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
        square = Square.ofSquare(points);
        assertEquals(10.0, square.calculateBase(), 0.001);
    }

    @Test
    public void calculateHeightTest() {
        square = Square.ofSquare(points);
        assertEquals(10.0, square.calculateHeight(), 0.001);
    }

    @Test
    public void isMatchTrue() {
        square = Square.ofSquare(points);
        assertEquals(true, square.isMatch(0, 0));
    }

    @Test
    public void isMatchFalse() {
        square = Square.ofSquare(points);
        assertEquals(false, square.isMatch(1, 1));
    }
}