package coordinate.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TriangleTest {
    private Triangle triangle;

    @Before
    public void setUp() {
        triangle = Triangle.ofTrianle(
                Arrays.asList(new Point(0, 0), new Point(0, 10), new Point(10, 0)));
    }

    @Test
    public void calculate() {
        assertEquals(50.0, triangle.calculate(), 0.001);
    }

    @Test
    public void isMatchTrue() {
        assertEquals(true, triangle.isMatch(0, 0));
        assertEquals(true, triangle.isMatch(0, 10));
        assertEquals(true, triangle.isMatch(10, 0));
    }

    @Test
    public void isMatchFalse() {
        assertEquals(false, triangle.isMatch(5, 5));
    }
}