package view;

import domain.coordinate.Coordinate;

public class Viewer {

    public static void viewCoordinate(Coordinate coordinate) {
        String coordinateView = ViewerUtils.buildCoordinateView(coordinate);
        System.out.println(coordinateView);
    }

    public static void viewMessage(String message) {
        System.out.println(message);
    }
}
