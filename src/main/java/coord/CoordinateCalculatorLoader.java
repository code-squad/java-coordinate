package coord;

import coord.domain.Factory;
import coord.domain.Point;
import coord.util.GridPaper;
import coord.util.Parser;
import coord.util.Setting;
import coord.view.InputView;
import coord.view.OutputView;

import java.util.List;

public class CoordinateCalculatorLoader {
    public static void main(String[] args) {
        List<Point> points = Parser.parseToPoints(InputView.getCoord());

        GridPaper gridPaper = new GridPaper(Setting.MAXIMUM);
        gridPaper.draw(points);

        OutputView.printGridPaper(gridPaper.toString());
        OutputView.printSize(Factory.of(points));
    }
}
