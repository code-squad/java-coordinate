package coord.domain;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TestFactory {
    @Test
    public void factoryDotTest() {
        List<Point> points = Arrays.asList(Point.of(1, 2));
        Figure f = Factory.of(points);
        assertThat(f.getClass()).isEqualTo(Dot.class);
    }

    @Test
    public void factoryLineTest() {
        List<Point> points = Arrays.asList(Point.of(1, 1), Point.of(1, 2));
        assertThat(Factory.of(points).getClass()).isEqualTo(Line.class);
    }

    @Test
    public void factoryTriangleTest() {
        List<Point> points = Arrays.asList(Point.of(1, 1), Point.of(1, 2), Point.of(2, 2));
        assertThat(Factory.of(points).getClass()).isEqualTo(Triangle.class);
    }

    @Test
    public void factoryRectTest() {
        List<Point> points = Arrays.asList(Point.of(1, 1),
                Point.of(1, 2),
                Point.of(2, 1),
                Point.of(2, 2));
        assertThat(Factory.of(points).getClass()).isEqualTo(Rectangle.class);
    }

    @Test
    public void lineFactory() {
        List<Point> points = Arrays.asList(Point.of(1, 1), Point.of(1, 2));
        Figure f = Factory.of(points);
        assertThat(f.getClass()).isEqualTo(Line.class);
    }
}
