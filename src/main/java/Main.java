import domain.Figure;
import domain.Points;
import domain.Utils;
import view.InputView;
import view.ResultView;

import java.util.List;

public class Main {

    private static Figure initFigure() {
        List<String> coordinates;
        try {
            coordinates = Utils.checkReturnCoordinates(InputView.initCoordinate());
            return Figure.of(coordinates);
        } catch (RuntimeException e) {
            return initFigure();
        }
    }

    public static void main(String[] args) {
        Figure figure;
        System.out.println("Input coordinates. ex. (1,2)-(3,4)-(5,1)");
        figure = initFigure();
        figure.calculate();
        ResultView.printBoard(figure);
        ResultView.printCalculationResult(figure);
    }
}