package domain;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PointTest {
    @Test
    public void subtractPointTest() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);
        assertThat(p1.subtractXPoint(p2)).isEqualTo(-3);
        assertThat(p1.subtractYPoint(p2)).isEqualTo(-4);
    }
}
