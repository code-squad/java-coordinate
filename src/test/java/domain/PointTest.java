package domain;

import domain.Point;
import domain.PointFactory;
import org.junit.Test;
import util.PointException;

import static org.assertj.core.api.Assertions.assertThat;
public class PointTest {

    @Test
    public void factoryPointTest() throws PointException {
        Point point1 = PointFactory.create("(1,1)");
        Point point2 = PointFactory.create("(1,3)");
        assertThat(point1.getDistance(point2)).isEqualTo(2);
    }

    @Test
    public void getGradientTest() {
        Point point1 = new Point(1,1);
        Point point2 = new Point(2,2);
        assertThat(point1.getGradient(point2)).isEqualTo(1);


        Point point3 = new Point(1,1);
        Point point4 = new Point(1,3);
        assertThat(point3.getGradient(point4)).isEqualTo(0);
    }
}
