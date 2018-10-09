package coordinate.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class LineSegmentTest {
    @Test
    public void 두점거리계산() {
        Coordinate a = Coordinate.of(1,1);
        Coordinate b = Coordinate.of(2,2);
        LineSegment c = new LineSegment(a, b);
        double distance = c.getDistance();
        assertThat(distance).isEqualTo(1.414, offset(0.001));
    }
}
