package coordinate;

import coordinate.domain.*;
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
        ResultView.printCoordinate(coordinates, countCoordinate(coordinates));
    }

    private static double countCoordinate(List<Point> coordinates) {
        double figureResult = 0;

        if (coordinates.size() == 2) {
            Figure Lines = Line.ofCoordinate(coordinates);
            figureResult = Lines.getArea();
        }

        if (coordinates.size() == 3) {
            Figure Triangles = Triangle.ofCoordinate(coordinates);
            figureResult = Triangles.getArea();
        }

        if (coordinates.size() == 4) {
            Figure Rectangles = Rectangle.ofCoordinate(coordinates);
            figureResult = Rectangles.getArea();
        }

        return figureResult;
    }
}