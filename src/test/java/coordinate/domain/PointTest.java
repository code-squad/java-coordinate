package coordinate.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class PointTest {

    @Test
    public void 좌표생성() {
        Point p = Point.of(1,1);
        assertThat(p).isEqualTo(Point.of(1,1));
    }

    @Test (expected = IllegalArgumentException.class)
    public void 좌표생성_입력범위초과_음수() {
        Point p = Point.of(-1, 23);
    }

    @Test (expected = IllegalArgumentException.class)
    public void 좌표생성_입력범위초과() {
        Point p = Point.of(4, 30);
    }


    @Test
    public void 두점거리계산() {
        Point p1 = Point.of(1,1);
        Point p2 = Point.of(2,2);
        double distance = p1.getDistance(p2);
        assertThat(distance).isEqualTo(1.414, offset(0.00099));

    }
}
