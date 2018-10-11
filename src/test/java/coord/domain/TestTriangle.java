package coord.domain;

import org.assertj.core.data.Offset;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TestTriangle {
    @Test
    public void size() {
        List<Point> points = Arrays.asList(
                Point.of(1, 1),
                Point.of(2, 1),
                Point.of(1, 2)
        );
        Figure f = Factory.of(points);
        assertThat(f.size()).isCloseTo(0.5, Offset.offset(0.01));
    }
}
