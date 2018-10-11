package coord.domain;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TestFigure {
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
    public void pointToLine() {
        Point point = Point.of(1, 2);
        Figure f = point.addPoint(Point.of(2, 3));
        assertThat(f.getClass()).isEqualTo(Line.class);
        System.out.println("LINE : " + f.size());
    }

    @Test
    public void LineToTriangle() {
        List<Point> points = Arrays.asList(Point.of(1, 1), Point.of(1, 2));
        Figure f = Factory.of(points);
        assertThat(f.getClass()).isEqualTo(Line.class);
        f = f.addPoint(Point.of(2, 2));
        assertThat(f.getClass()).isEqualTo(Triangle.class);
    }

    @Test
    public void TriangleToRectangle() {
        List<Point> points = Arrays.asList(Point.of(1, 1), Point.of(1, 2), Point.of(2, 1));
        Figure f = Factory.of(points);
        assertThat(f.getClass()).isEqualTo(Triangle.class);
        f = f.addPoint(Point.of(2, 2));
        assertThat(f.getClass()).isEqualTo(Rectangle.class);
    }
}
