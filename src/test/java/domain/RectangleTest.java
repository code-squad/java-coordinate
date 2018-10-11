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

    public void isSameZeroGradientTest() {
        //return points.get(0).getGradient(points.get(1)) == 0 && points.get(2).getGradient(points.get(3)) == 0;
    }

    @Test
    public void isSameLengthTest() throws PointException {
        List<Point> points = new ArrayList<>();
        points.add(new Point(1,1));
        points.add(new Point(3,3));
        points.add(new Point(3,1));
        points.add(new Point(1,3));

        assertThat(new Rectangle(points).isSameLength()).isTrue();
    }

    @Test
    public void getLineLengthTest() throws PointException {
        List<Point> points1 = new ArrayList<>();
        points1.add(new Point(1,1));
        points1.add(new Point(1,3));

        assertThat(new Rectangle().getLineLength(points1)).isEqualTo(2);
    }
}
