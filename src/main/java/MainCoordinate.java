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
            decideFigure(points);
            printCoordinate(points);
        } catch (IllegalArgumentException | DuplicatePointException e) {
            System.out.println(e.getMessage());
            start();
        }
    }

    private static void decideFigure(List<Point> points) {
        if (points.size() == 4) {
            Rectangle rectangle = new Rectangle(points);
            printRectangleArea(rectangle.area());
        }
        if (points.size() == 3) {
            Triangle triangle = new Triangle(points);
            printTriangleArea(triangle.area());
        }
        if (points.size() == 2) {
            Line line = new Line(points);
            printLineLength(line.area());
        }
    }
}