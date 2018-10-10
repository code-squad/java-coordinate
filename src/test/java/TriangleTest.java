import domain.Point;
import domain.PointFactory;
import domain.Rectangle;
import domain.Triangle;
import org.junit.Test;
import util.PointException;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TriangleTest {
    @Test
    public void isComputableTest() throws PointException {
        Point p1 = new Point(1,1);
        Point p2 = new Point(2,2);

        assertThat(new Triangle().getGradient(p1, p2)).isEqualTo(1);
    }

    @Test
    public void getLineDistanceTest() throws PointException {
        List<Point> points = new ArrayList<>();
        points.add(new Point(1,1));
        points.add(new Point(4,1));
        points.add(new Point(4,5));

        assertThat(new Triangle(points).getLineDistance(points.subList(0, 2))).isEqualTo(3);
        assertThat(new Triangle(points).getLineDistance(points.subList(1, 3))).isEqualTo(4);
    }
}
