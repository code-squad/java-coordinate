package coordinate;

import coordinate.domain.CoordinatePlane;
import coordinate.domain.Figure;
import coordinate.domain.Point;
import coordinate.util.InputException;
import coordinate.view.InputView;
import coordinate.view.ResultView;

import java.util.ArrayList;


public class CoordinateMain {
    public static void main(String[] args) {
        run();
    }

    static void run() {
        try{
            ArrayList<Point> points  = CoordinatePlane.enterPoints(InputView.getPoint());
            CoordinatePlane c = new CoordinatePlane();
            c.checkDuplicate(points);
            Figure figure = c.checkFigure(points);

            ResultView.drawCoordinatePlane(c, points);
            ResultView.showCalculation(figure) ;
        }  catch (InputException | IllegalArgumentException e) {
            CoordinateMain.run();
        }
    }
}
