import domain.FigureFactory;
import domain.Point;
import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FigureFactoryTest {
    @Test
    public void isDuplicationTest() {
        List<Point> points = new ArrayList<>();
        points.add(new Point(1,1));

        assertThat(FigureFactory.isDuplication(points, new Point(1,1))).isTrue();
        assertThat(FigureFactory.isDuplication(points, new Point(2,2))).isFalse();
    }
}
