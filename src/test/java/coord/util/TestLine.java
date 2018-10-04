package coord.util;

import coord.domain.Line;
import coord.domain.Point;
import org.assertj.core.data.Offset;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TestLine {
    @Test
    public void length() {
        List<Point> points = new ArrayList<>();
        points.add(Point.of(1, 1));
        points.add(Point.of(4, 5));
        assertThat(Line.of(points).length()).isCloseTo(5.0, Offset.offset(5.0));
    }
}
