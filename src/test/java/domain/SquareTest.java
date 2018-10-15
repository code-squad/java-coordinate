package domain;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SquareTest {
    List<Point> points = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        Point p1 = new Point(5, 7);
        Point p2 = new Point(12, 14);
        Point p3 = new Point(11, 3);
        Point p4 = new Point(6, 4);
        points.add(p1);
        points.add(p2);
        points.add(p3);
        points.add(p4);
    }

    @Test
    public void checkRectangle() {
        assertThat(Square.checkRectangle(points)).isEqualTo(true);
    }
}