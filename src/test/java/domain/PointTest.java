package domain;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class PointTest {
    List<Point> points = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        points = Arrays.asList(new Point(10, 10), new Point(14, 15));
    }

    @Test
    public void 예외처리() {
//        new Point(25, 2);  // 예외발생 확인
    }

    @Test
    public void 포인트간_거리() {
        assertThat(points.get(0).calculateLength(points.get(1))).isEqualTo(6.403124, offset(0.00099));
    }

    @Test
    public void 평균값_계산() {
        assertThat(Point.calculatePointsAverage(points)).isEqualTo(new Point(12, 12.5));
    }
}