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
            printCoordinate(points);
            decideFigure(points);

        } catch (IllegalArgumentException e) {
            System.out.println("좌표값을 잘못 입력했습니다. 다시 입력하세요.");
            start();
        }
    }

    private static void decideFigure(List<Point> points) {
        if (points.size() == 4) {
            Rectangle rectangle = new Rectangle(points);
            printRectangleArea(rectangle.calculateArea());
        }
        if (points.size() == 3) {
            Triangle triangle = new Triangle(points);
            printTriangleArea(triangle.calculateArea());
        }
        if (points.size() == 2) {
            Line line = new Line(points);
            printLineLength(line.calculateLength());
        }
    }
}