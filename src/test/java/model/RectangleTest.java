package model;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RectangleTest {

    Point a = PointCreator.position("1,7");
    Point b = PointCreator.position("1,5");
    Point c = PointCreator.position("5,7");
    Point d = PointCreator.position("5,5");

    List<Point> points = new ArrayList<>();

    Rectangle square;

    @Before
    public void setUp() {
        points.add(a);
        points.add(b);
        points.add(c);
        points.add(d);
        square = new Rectangle(points);
    }

    @Test
    public void size() {

    }

    @Test
    public void minusX() {
        System.out.println(points.get(0).getX() - points.get(2).getX());
        assertThat(square.minusX(0)).isEqualTo(4);
    }

    @Test
    public void minusY() {
        System.out.println(points.get(0).getY() - points.get(1).getY());
        assertThat(square.minusY(0)).isEqualTo(2);
    }

    @Test
    public void area() {
        assertThat(square.area()).isEqualTo(3);
    }

    @Test
    public void differentFirst() {
        assertThat(square.differentFirst()).isEqualTo(3);
    }
}
