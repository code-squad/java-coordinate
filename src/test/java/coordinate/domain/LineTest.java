package coordinate.domain;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LineTest {
    private Line line;
    private List<Point> points;

    @Test
    public void calculateDistanceTest() {
        points = Arrays.asList(new Point(0, 0), new Point(10, 10));
        line = Line.ofLine(points);
        double expected = Math.sqrt(Math.pow(10, 2) + Math.pow(10, 2));
        assertEquals(expected, line.calculate(), 0.001);
    }

    @Test
    public void isMatchTrue() {
        points = Arrays.asList(new Point(0, 0), new Point(10, 10));
        line = Line.ofLine(points);
        assertEquals(true, line.isMatch(0, 0));
    }

    @Test
    public void isMatchFalse() {
        points = Arrays.asList(new Point(0, 0), new Point(10, 10));
        line = Line.ofLine(points);
        assertEquals(false, line.isMatch(5, 5));
    }

    @Test
    public void isLineTrue() {
        points = Arrays.asList(new Point(0, 0), new Point(10, 10));
        line = Line.ofLine(points);
        assertEquals(true, line.isLine());
    }

    @Test
    public void isLineFalseLessThanTwoPoints() {
        points = Arrays.asList(new Point(0, 0));
        line = Line.ofLine(points);
        assertEquals(false, line.isLine());
    }

    @Test
    public void isLineFalseMoreThanTwoPoints() {
        points = Arrays.asList(new Point(0, 0), new Point(10, 10), new Point(10, 0));
        line = Line.ofLine(points);
        assertEquals(false, line.isLine());
    }
}