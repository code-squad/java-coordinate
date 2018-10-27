import additionalException.DuplicatePointException;
import domain.*;
import util.Parser;

import static view.InputView.getCoordinateValue;
import static view.ResultView.*;

public class MainCoordinate {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        try {
            Figure figure = FigureFactory.decideFigure(PointsFactory.makePoints(Parser.makePosition(getCoordinateValue())));
            printCoordinate(figure.getPoints());
            printArea(figure);
        } catch (IllegalArgumentException | DuplicatePointException e) {
            System.out.println(e.getMessage());
            start();
        }
    }
}