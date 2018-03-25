import domain.Figure;
import domain.Utils;
import view.InputView;
import view.ResultView;

import java.util.List;

public class Main {

    private static List<String> initCoordinates() {
        System.out.println("Input coordinates. ex. (1,2)-(3,4)-(5,1)");
        try {
            return Utils.checkReturnCoordinates(InputView.getCoordinate());
        } catch (RuntimeException e) {
            return initCoordinates();
        }
    }

    public static void main(String[] args) {
        Figure figure;
        figure = Figure.createFigure(initCoordinates());
        figure.calculate();
        ResultView.printBoard(figure);
        ResultView.printCalculationResult(figure);
    }
}