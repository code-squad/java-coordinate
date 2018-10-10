import domain.Point;
import domain.PointFactory;
import domain.Rectangle;
import org.junit.Test;
import util.PointException;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class QuadrangleTest {
    @Test
    public void isComputableTest() throws PointException {
        List<Point> points1 = new ArrayList<>();
        points1.add(PointFactory.create("(2,2)"));
        points1.add(PointFactory.create("(2,4)"));
        points1.add(PointFactory.create("(5,5)"));
        points1.add(PointFactory.create("(5,6)"));

        assertThat(new Rectangle(points1).isComputable()).isTrue();

        List<Point> points2 = new ArrayList<>();
        points2.add(PointFactory.create("(1,2)"));
        points2.add(PointFactory.create("(2,4)"));
        points2.add(PointFactory.create("(5,5)"));
        points2.add(PointFactory.create("(5,6)"));

        assertThat(new Rectangle(points2).isComputable()).isFalse();

        List<Point> points3 = new ArrayList<>();
        points3.add(PointFactory.create("(1,2)"));
        points3.add(PointFactory.create("(2,4)"));
        points3.add(PointFactory.create("(2,5)"));
        points3.add(PointFactory.create("(5,6)"));

        assertThat(new Rectangle(points3).isComputable()).isFalse();
    }
}
