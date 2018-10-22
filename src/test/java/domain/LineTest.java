package domain;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LineTest {
    @Test
    public void calcLengthTest() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);
        List<Point> pl = new ArrayList<>();
        pl.add(p1);
        pl.add(p2);
        Line line = new Line(pl);
        assertThat( line.calculateLength()).isEqualTo(5.0000);
    }
}
