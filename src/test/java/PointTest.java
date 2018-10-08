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
}
