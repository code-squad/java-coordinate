package domain;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SquareTest {
    List<Point> points;
    List<String> stooges;

    @Before
    public void setUp() throws Exception {
        Point[] p = {new Point(5, 7), new Point(12, 14), new Point(11, 3), new Point(6, 4)};
        points = new ArrayList<>(Arrays.asList(p));
    }

    @Test
    public void checkRectangle() {
        assertThat(Square.checkRectangle(points)).isEqualTo(false);
    }
}