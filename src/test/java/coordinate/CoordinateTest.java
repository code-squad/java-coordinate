package coordinate;

import coordinate.domain.*;
import coordinate.inputview.InputView;
import coordinate.resultview.ResultView;
import coordinate.utils.Calculator;
import coordinate.utils.CoordinateString;
import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Java6Assertions.offset;

public class CoordinateTest {

    @Test
    public void pointCalculator() {
        String input = "(4,4) - (4,2)";
        ArrayList<Point> points = InputView.testInput(input);
        assertThat(Calculator.line(points)).isEqualTo((Math.sqrt(Math.pow(4 - 4, 2)
                + Math.pow(2 - 4, 2))), offset(0.00099));

        input = "(6,4) - (4,8)";
        points = InputView.testInput(input);
        assertThat(Calculator.line(points)).isEqualTo((Math.sqrt(Math.pow(4 - 6, 2)
                + Math.pow(8 - 4, 2))), offset(0.00099));
    }

    @Test
    public void inputTest() {
        String input = "(12,12) - (12, 22)";
        ArrayList<Point> points = InputView.testInput(input);
        assertThat(points.get(0).getXPoint()).isEqualTo(12);
        assertThat(points.get(0).getYPoint()).isEqualTo(12);
        assertThat(points.get(1).getXPoint()).isEqualTo(12);
        assertThat(points.get(1).getYPoint()).isEqualTo(22);
    }

    @Test
    public void coordinateLineSizeTest() {
        CoordinateLine coordinateLine = new CoordinateLine();
        assertThat(coordinateLine.getCoordinateLine().size()).isEqualTo(25);
        System.out.println(coordinateLine);
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
        String a = CoordinateString.makeString(4);
        assertThat(a).isEqualTo("  4");
        assertThat(CoordinateString.makeString(3)).isEqualTo("   ");
        assertThat(CoordinateString.makeString(6)).isEqualTo("  6");
    }
}
