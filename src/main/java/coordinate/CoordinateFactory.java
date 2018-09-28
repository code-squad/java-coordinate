package coordinate;

import coordinate.domain.Coordinate;
import coordinate.domain.Line;
import coordinate.view.ResultView;

import java.util.List;

public class CoordinateFactory {
    public static void main(String[] args) {
        List<Line> lines;
        lines = Coordinate.makeLines();
        ResultView.showCoordinate(lines);
    }
}
