import additionalException.DuplicatePointException;
import domain.*;
import util.Parser;

import java.util.List;

import static view.InputView.getCoordinateValue;
import static view.ResultView.*;

public class MainCoordinate {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        try {
            List<Point> points = PointsFactory.makePoints(Parser.makePosition(getCoordinateValue()));
            Figure figure = FigureFactory.decideFigure(points);
            printCoordinate(figure.getPoints());
            printArea(figure);
        } catch (IllegalArgumentException | DuplicatePointException e) {
            System.out.println(e.getMessage());
            start();
        }
    }
}