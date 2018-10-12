package coord.domain;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TestRectangle {
    @Test
    public void size(){
        List<Point> points = new ArrayList<>();
        points.add(Point.of(1, 1));
        points.add(Point.of(1, 4));
        points.add(Point.of(3, 1));
        points.add(Point.of(3, 4));
        assertThat(Factory.of(points).area()).isEqualTo(6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void validCheck(){
        List<Point> points = new ArrayList<>();
        points.add(Point.of(1, 1));
        points.add(Point.of(1, 2));
        points.add(Point.of(3, 1));
        points.add(Point.of(2, 2));
        Factory.of(points);
    }
}
