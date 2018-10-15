package domain;

import org.junit.Test;
import util.PointException;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RectangleTest {
    @Test
    public void isComputableTest() throws PointException {
        List<Point> points1 = new ArrayList<>();
        points1.add(new Point(1,3));
        points1.add(new Point(3,3));
        points1.add(new Point(3,1));
        points1.add(new Point(1,1));

        assertThat(new Rectangle(points1).isComputable()).isTrue();
    }
}
