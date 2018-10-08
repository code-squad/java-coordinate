package domain;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class PointTest {
    Point p1;
    Point p2;

    @Before
    public void setUp() throws Exception {
        p1 = new Point(10, 10);
        p2 = new Point(14, 15);
    }

    @Test
    public void 예외처리() {
//        new Point(25, 2);  // 예외발생 확인
    }

    @Test
    public void 포인트간_거리() {
        assertThat(p1.calculateLineDistance(p2)).isEqualTo(6.403124, offset(0.00099));
    }
}