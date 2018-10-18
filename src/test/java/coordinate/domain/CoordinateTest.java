package coordinate.domain;

import coordinate.resultview.ResultView;
import coordinate.utils.CoordinateString;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Java6Assertions.offset;

public class CoordinateTest {

    @Test
    public void HashSetArraysListTests() {
        List<Point> points;
        String input = "(12,12) - (12, 22) - (22,22)";
        points = PointFactory.testInput(input);
        HashSet<Point> list = new HashSet<>(points);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TriangleExceptionTest() {
        List<Point> points;
        String input = "(12,15) - (12, 22)";
        points = PointFactory.testInput(input);
        Triangle rectangle = new Triangle(points);
    }

    @Test
    public void TriangleTest() {
        List<Point> points;
        String input = "(12,12) - (12, 22) - (22,22)";
        points = PointFactory.testInput(input);
        assertThat(new Triangle(points).area()).isEqualTo(50.0);

        input = "(10,10)-(14,15)-(20,8)";
        points = PointFactory.testInput(input);
        assertThat(new Triangle(points).area()).isEqualTo(28.999999999999996);
    }

    @Test(expected = IllegalArgumentException.class)
    public void squareExceptionTest() {
        List<Point> points;
        String input = "(12,15) - (12, 22) - (22,22) - (22,12)";
        points = PointFactory.testInput(input);
        Rectangle rectangle = new Rectangle(points);
    }

    @Test
    public void squareTrueTest() {
        List<Point> points;
        String input = "(12,12) - (12, 22) - (22,22) - (22,12)";
        points = PointFactory.testInput(input);
        assertThat(new Rectangle(points).area()).isEqualTo(100.0);

        String input1 = "(4,3) - (4, 6) - (7,3) - (7,6)";
        points = PointFactory.testInput(input1);
        assertThat(new Rectangle(points).area()).isEqualTo(9.0);

        String input2 = "(5,5) - (10, 5) - (5,10) - (10,10)";
        points = PointFactory.testInput(input2);
        assertThat(new Rectangle(points).area()).isEqualTo(25.0);
    }

    @Test
    public void hashMapTests() {
        String input = "(12,12) - (12, 22)";
        List<Point> points = PointFactory.testInput(input);
        Coordinate coordinate = new Coordinate();

        ResultView resultView = new ResultView(coordinate.getCoordinatesAxis(), coordinate.getCoordinatePlane());
        resultView.displayResult(FigureFactory.create(points));
    }

    @Test(expected = IllegalArgumentException.class)
    public void pointExceptionTest() {
        String input = "(4,30) - (4,2)";
        List<Point> points = PointFactory.testInput(input);
    }

    @Test
    public void pointCalculator() {
        String input = "(4,4) - (4,2)";
        List<Point> points = PointFactory.testInput(input);
        assertThat(points.get(0).calculateLIne(points.get(1))).isEqualTo((Math.sqrt(Math.pow(4 - 4, 2)
                + Math.pow(2 - 4, 2))), offset(0.00099));

        input = "(6,4) - (4,8)";
        points = PointFactory.testInput(input);
        assertThat(points.get(0).calculateLIne(points.get(1))).isEqualTo((Math.sqrt(Math.pow(4 - 6, 2)
                + Math.pow(8 - 4, 2))), offset(0.00099));
    }

    @Test
    public void inputTest() {
        String input = "(12,12) - (12, 22)";
        List<Point> points = PointFactory.testInput(input);
        assertThat(points.get(0).getXPoint()).isEqualTo(12);
        assertThat(points.get(0).getYPoint()).isEqualTo(12);
        assertThat(points.get(1).getXPoint()).isEqualTo(12);
        assertThat(points.get(1).getYPoint()).isEqualTo(22);
    }

    @Test
    public void coordinateLineSizeTest() {
        CoordinateYLine coordinateYLine = new CoordinateYLine();
        assertThat(coordinateYLine.getCoordinateLine().size()).isEqualTo(25);
        System.out.println(coordinateYLine);
    }

    @Test
    public void displayTest() {
        Coordinate coordinate = new Coordinate();
        ResultView resultView = new ResultView(coordinate.getCoordinatesAxis(), coordinate.getCoordinatePlane());
        List<Point> points = PointFactory.testInput("(12,12) - (12, 22) - (22,22) - (22,12)");
        resultView.displayResult(new Rectangle(points));
        points = PointFactory.testInput("(12,12) - (12, 22) - (22,22)");
        resultView.displayResult(new Triangle(points));
        points = PointFactory.testInput("(12,12) - (12, 22)");
        resultView.displayResult(new Line(points));
    }

    @Test
    public void StringTest() {
        String a = CoordinateString.makeAxis(4);
        assertThat(a).isEqualTo("  4");
        assertThat(CoordinateString.makeAxis(3)).isEqualTo("   ");
        assertThat(CoordinateString.makeAxis(6)).isEqualTo("  6");
    }
}
