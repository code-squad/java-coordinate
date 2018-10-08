package coord.domain;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TestFigure {
    @Test
    public void factoryTest(){
        List<Point> points = new ArrayList<>();
        points.add(Point.of(1, 1));
        points.add(Point.of(1, 1));

        assertThat(Factory.of(points).getClass()).isEqualTo(Line.class);
        points.add(Point.of(1, 1));
        points.add(Point.of(1, 1));
        assertThat(Factory.of(points).getClass()).isEqualTo(Rectangle.class);
    }

    @Test
    public void ascension(){
        Point point = Point.of(1, 2);

        Figure f = point.addPoint(Point.of(2, 3));
        assertThat(f.getClass()).isEqualTo(Line.class);
        System.out.println("LINE : " + f.size());

        f = f.addPoint(Point.of(3, 4));
        assertThat(f.getClass()).isEqualTo(Triangle.class);
        System.out.println("TRIANGLE : " + f.size());

        f = f.addPoint(Point.of(4, 5));
        assertThat(f.getClass()).isEqualTo(Rectangle.class);
        System.out.println("RECT : " + f.size());
    }

    @Test
    public void factory(){
        List<Point> points = new ArrayList<>();
        points.add(Point.of(1, 2));
        points.add(Point.of(1, 1));
        points.add(Point.of(2, 2));
        points.add(Point.of(2, 1));
        Figure f = Factory.of(points);
        System.out.println(f.size());
    }
}
