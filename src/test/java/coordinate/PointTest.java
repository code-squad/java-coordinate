package coordinate;

import coordinate.domain.Point;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class PointTest {
    @Test
    public void 두점사이의거리() {
        Point point = Point.of(1,2);
        Point point2 = Point.of(3,4);

        assertThat(point.distance(point2)).isEqualTo(2.828,offset(0.001));
    }

    @Test
    public void 정렬() {
        Point point = Point.of(3,2);
        Point point2 = Point.of(1,4);

        assertThat(point.sort(point2)[0]).isEqualTo(1);
    }
}
