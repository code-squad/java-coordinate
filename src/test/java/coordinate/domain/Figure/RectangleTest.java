package coordinate.domain.Figure;

import coordinate.domain.Point;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

import static org.assertj.core.api.Java6Assertions.assertThat;


public class RectangleTest {
    Rectangle rectangle;
    List<Point> coordinates;

    @Before
    public void setUp() {
        coordinates = Arrays.asList(
                Point.ofXY(1,1),
                Point.ofXY(1,3),
                Point.ofXY(3,1),
                Point.ofXY(3,3));

        rectangle = Rectangle.ofCoordinate(coordinates);
    }

    @Test
    public void getAreaTest() {
        assertThat(rectangle.getArea()).isEqualTo(4);
    }

    @Test(expected = RuntimeException.class)
    public void isTrapezoidTest() {
        coordinates = Arrays.asList(
                Point.ofXY(1,1),
                Point.ofXY(1,3),
                Point.ofXY(3,1),
                Point.ofXY(3,10));

        rectangle = Rectangle.ofCoordinate(coordinates);
    }

    @Test(expected = RuntimeException.class)
    public void isDiamondTest() {
        coordinates = Arrays.asList(
                Point.ofXY(1,1),
                Point.ofXY(1,3),
                Point.ofXY(2,0),
                Point.ofXY(2,4));

        rectangle = Rectangle.ofCoordinate(coordinates);
    }

    @Test
    public void makeWidthSetTest() {
        assertThat(rectangle.makeWidthSet(coordinates).size()).isEqualTo(2);
    }

    @Test
    public void makeHeightSetTest() {
        assertThat(rectangle.makeHeightSet(coordinates).size()).isEqualTo(2);
    }

    @Test
    public void calculateWidthTest() {
        assertThat(rectangle.calculateWidth()).isEqualTo(2);
    }

    @Test
    public void calculateHeightTest() {
        assertThat(rectangle.calculateHeight()).isEqualTo(2);
    }
}
