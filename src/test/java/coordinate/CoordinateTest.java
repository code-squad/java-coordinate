package coordinate;

import coordinate.domain.*;
import coordinate.resultview.ResultView;
import coordinate.utils.CoordinateString;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Java6Assertions.offset;

public class CoordinateTest {
    //
    //
    ///
   /* @Test
    public void pointtest() {
        Point point1 = new Point(-1,2);
        System.out.println(point1);
    }*/

    /*@Test
    public void squareFalseTest() {
        String input = "(12,12) - (13, 22) - (22,22) - (22,12)";
        ArrayList<Point> points = PointFactory.testInput(input);
        assertThat(new Rectangle(points).calculate()).isEqualTo("사각형이 아닙니다.");
    }*/
    @Test
    public void TriangleTest() {
        ArrayList<Point> points;
        String input = "(12,12) - (12, 22) - (22,22)";
        points = PointFactory.testInput(input);
        assertThat(new Triangle(points).calculate()).isEqualTo("삼각형의 면적은 50.0 입니다.");

        input = "(10,10)-(14,15)-(20,8)";
        points = PointFactory.testInput(input);
        assertThat(new Triangle(points).calculate()).isEqualTo("삼각형의 면적은 28.999999999999996 입니다.");
    }

    @Test
    public void squareTrueTest() {
        ArrayList<Point> points;
        String input = "(12,12) - (12, 22) - (22,22) - (22,12)";
        points = PointFactory.testInput(input);
        assertThat(new Rectangle(points).calculate()).isEqualTo("사각형의 면적은 100 입니다.");

        String input1 = "(4,3) - (4, 6) - (7,3) - (7,6)";
        points = PointFactory.testInput(input1);
        assertThat(new Rectangle(points).calculate()).isEqualTo("사각형의 면적은 9 입니다.");

        String input2 = "(5,5) - (10, 5) - (5,10) - (10,10)";
        points = PointFactory.testInput(input2);
        assertThat(new Rectangle(points).calculate()).isEqualTo("사각형의 면적은 25 입니다.");
    }

    @Test
    public void hashMapTests() {
        String input = "(12,12) - (12, 22)";
        ArrayList<Point> points = PointFactory.testInput(input);
        Coordinate coordinate = new Coordinate();

        ResultView resultView = new ResultView(coordinate.getCoordinatesAxis(), coordinate.getCoordinatePlane());
        resultView.toDo(points);
    }

    @Test
    public void pointCalculator() {
        String input = "(4,4) - (4,2)";
        ArrayList<Point> points = PointFactory.testInput(input);
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
        ArrayList<Point> points = PointFactory.testInput(input);
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
        // 배열을 만들어 0부터 24 한칸씩 띄워 배열을 생성
        // x 축에 0을 포함 y축 그릴땐 0번째 제외
        Coordinate coordinate = new Coordinate();
        ResultView resultView = new ResultView(coordinate.getCoordinatesAxis(), coordinate.getCoordinatePlane());
        resultView.displayTest();
    }

    @Test
    public void StringTest() {
        String a = CoordinateString.makeAxis(4);
        assertThat(a).isEqualTo("  4");
        assertThat(CoordinateString.makeAxis(3)).isEqualTo("   ");
        assertThat(CoordinateString.makeAxis(6)).isEqualTo("  6");
    }
}
