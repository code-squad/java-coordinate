package view;

import domain.Line;
import domain.figure.Figure;
import domain.point.Point;
import view.coordinate.Coordinate;
import view.util.ViewerUtils;

import java.util.ArrayList;

public class Viewer {

    public static void viewCoordinate(ArrayList<Point> points) {
        Coordinate coordinate = new Coordinate();
        for (Point point : points) {
            coordinate.drawPosition(point.getXPosition(), point.getYPosition());
        }
        String coordinateView = ViewerUtils.buildCoordinateView(coordinate);
        System.out.println(coordinateView);
    }

    public static void viewMessage(String message) {
        System.out.println(message);
    }

    public static void viewDistance(Line line) {
        System.out.println("두 점 사이 거리는 " + ViewerUtils.formatDistance(line.calcDistance()) + " 입니다.");
    }

    public static void viewArea(Figure figure) {
        System.out.println(figure.getFigureName() + " 넓이는 " + ViewerUtils.formatWidth(figure.calcArea()));
    }
}
