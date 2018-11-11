package coordinate.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class TriangleTest {
    Triangle triangle;
    List<Point> coordinates;

    @Before
    public void setUp() {
        coordinates = Arrays.asList(Point.ofXY(1,1), Point.ofXY(5,1), Point.ofXY(5,4));
        triangle = Triangle.ofCoordinate(coordinates);
    }

    @Test
    public void getAreaTest() {
        assertThat(triangle.getArea()).isEqualTo(6);
    }

    @Test
    public void generateLinesDistanceTest() {
        List<Double> linesDistance = new ArrayList<>();
        linesDistance.add(4.0);
        linesDistance.add(3.0);
        linesDistance.add(5.0);

        assertThat(triangle.generateLinesDistance()).isEqualTo(linesDistance);
    }

    @Test
    public void generateLinesTest() {
        List<Line> lines = new ArrayList<>();
        lines.add(Line.ofCoordinate(Arrays.asList(Point.ofXY(1,1), Point.ofXY(5,1))));
        lines.add(Line.ofCoordinate(Arrays.asList(Point.ofXY(5,1), Point.ofXY(5,4))));
        lines.add(Line.ofCoordinate(Arrays.asList(Point.ofXY(1,1), Point.ofXY(5,4))));

        assertThat(triangle.generateLines()).isEqualTo(lines);
    }
}
