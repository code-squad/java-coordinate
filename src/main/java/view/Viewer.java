package view;

import domain.point.Point;
import domain.point.Points;
import view.coordinate.Coordinate;
import view.util.ViewerUtils;

import java.util.ArrayList;

public class Viewer {

    public static void viewCoordinate(Points pointRepo) {
        Coordinate coordinate = new Coordinate(pointRepo);
        ArrayList<Point> points = pointRepo.getDrawPoints();
        for (Point point : points) {
            coordinate.drawPosition(point.getXPosition(), point.getYPosition());
        }
        String coordinateView = ViewerUtils.buildCoordinateView(coordinate);
        System.out.println(coordinateView);
    }

    public static void viewMessage(String message) {
        System.out.println(message);
    }

    public static void viewDistance(double distance) {
        String formattedDistance = String.format("%.3f", distance);
        System.out.println("두 점 사이 거리는 " + formattedDistance + " 입니다.");
    }
}
