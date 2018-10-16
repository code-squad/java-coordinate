package domain;

import org.junit.Test;
import util.PointException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RectangleTest {
    @Test
    public void isComputableTest() throws PointException {
        Point[] pointArr = {new Point(1,3), new Point(3,1), new Point(3,3), new Point(1,1)};

        List<Point> points1 = new ArrayList<Point>(Arrays.asList(pointArr));

        assertThat(new Rectangle(points1).isComputable()).isTrue();
    }
}
