package coordinate;

import coordinate.domain.CoordinatePlane;
import coordinate.domain.FigureAbstract;
import coordinate.domain.Point;
import coordinate.util.InputException;
import coordinate.view.InputView;
import coordinate.view.ResultView;

import java.util.List;

public class CoordinateMain {
    public static void main(String[] args) {
        run();
    }

    static void run() {
        try{
            List<Point> points  = CoordinatePlane.enterPoints(InputView.getPoint());
            CoordinatePlane coordinatePlane = new CoordinatePlane();

            FigureAbstract figureAbstract = coordinatePlane.createFigure(points);

            ResultView.drawCoordinatePlane(coordinatePlane, points);
            ResultView.showCalculation(figureAbstract) ;
        }  catch (InputException | IllegalArgumentException e) {
            CoordinateMain.run();
        }
    }
}
