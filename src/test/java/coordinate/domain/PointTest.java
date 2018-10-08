package coordinate.domain;

import coordinate.domain.Point;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

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

}
