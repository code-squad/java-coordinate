package coordinate.domain.Figure;

import coordinate.domain.Point;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class FigureFactoryTest {
    @Test
    public void line() {
        List<Point> coordinates = Arrays.asList(
                Point.ofXY(1, 1),
                Point.ofXY(2, 2));

        Figure figure = FigureFactory.getInstance(coordinates);
        assertThat(figure).isInstanceOfAny(Line.class);
        assertThat(figure.getName()).isEqualTo("선");
    }

    @Test
    public void triangle() {
        List<Point> points = Arrays.asList(
                Point.ofXY(1, 1),
                Point.ofXY(5, 1),
                Point.ofXY(5, 4));

        Figure figure = FigureFactory.getInstance(points);
        assertThat(figure).isInstanceOfAny(Triangle.class);
        assertThat(figure.getName()).isEqualTo("삼각형");
    }

    @Test
    public void rectangle() {
        List<Point> points = Arrays.asList(
                Point.ofXY(1, 1),
                Point.ofXY(3, 1),
                Point.ofXY(1, 3),
                Point.ofXY(3, 3));

        Figure figure = FigureFactory.getInstance(points);
        assertThat(figure).isInstanceOfAny(Rectangle.class);
        assertThat(figure.getName()).isEqualTo("사각형");
    }
}
