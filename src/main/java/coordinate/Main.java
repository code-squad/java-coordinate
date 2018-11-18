package coordinate;

import coordinate.domain.*;
import coordinate.domain.Figure.Figure;
import coordinate.domain.Figure.FigureFactory;
import coordinate.view.InputView;
import coordinate.view.ResultView;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Coordinate coordinate = Coordinate.of();

        try {
            coordinate.run(InputView.inputCoordinate());
        } catch(Exception e) {
            System.out.println(e.toString());
            main(args);
        }

        List<Point> coordinates = coordinate.getCoordinate();
        Figure figure = FigureFactory.getInstance(coordinates);

        ResultView.printCoordinate(coordinates, figure.getArea());
    }
}