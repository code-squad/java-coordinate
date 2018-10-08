package coordinate;

import coordinate.domain.Point;
import coordinate.view.InputView;
import coordinate.view.ResultView;

public class CoordinateMain {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        String[] axis = InputView.inputCoordinate();
        Point firstPoint = Point.ofCommaSeparator(axis[0]);
        Point secondPoint = Point.ofCommaSeparator(axis[1]);

        ResultView.createLocationAxis(firstPoint,secondPoint);
        ResultView.distView(firstPoint.distance(secondPoint));
    }
}