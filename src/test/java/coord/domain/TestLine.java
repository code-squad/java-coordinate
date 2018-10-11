package coord.domain;

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
        assertThat(Factory.of(points).size()).isCloseTo(5.0, Offset.offset(5.0));
    }
}
