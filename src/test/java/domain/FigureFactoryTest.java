package domain;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FigureFactoryTest {
    @Test
    public void LineTest() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);
        List<Point> points = new ArrayList<>();
        points.add(point1);
        points.add(point2);

        Figure figure = FigureFactory.decideFigure(points);
        assertThat(figure.getPointsSize()).isEqualTo(2);
        assertThat(figure.name()).isEqualTo("라인의 길이는 ");
    }

    @Test
    public void TriangleTest() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);
        Point point3 = new Point(13, 5);
        List<Point> points = new ArrayList<>();
        points.add(point1);
        points.add(point2);
        points.add(point3);

        Figure figure = FigureFactory.decideFigure(points);
        assertThat(figure.getPointsSize()).isEqualTo(3);
        assertThat(figure.name()).isEqualTo("삼각형의 넓이는 ");
    }

    @Test
    public void RectangleTest() {
        Point point1 = new Point(10, 10);
        Point point2 = new Point(22, 10);
        Point point3 = new Point(22, 18);
        Point point4 = new Point(10, 18);
        List<Point> points = new ArrayList<>();
        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);

        Figure figure = FigureFactory.decideFigure(points);
        assertThat(figure.getPointsSize()).isEqualTo(4);
        assertThat(figure.name()).isEqualTo("사각형의 넓이는 ");
    }
}
