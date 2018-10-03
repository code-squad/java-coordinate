import domain.Axis;
import domain.Point;
import domain.Space;
import view.InputView;
import view.ResultView;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Point> points = InputView.getInput();
        Space space = new Space();
        space.setPoints(points);
        ResultView.drawAxis(space);
        ResultView.printDistance(points);
    }
}
