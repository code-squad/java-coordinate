package view;

import domain.Coordinate;

public class Viewer {

    public static void viewCoordinate(Coordinate coordinate) {
        String coordinateView = ViewerUtils.buildCoordinateView(coordinate);
        System.out.println(coordinateView);
    }
}
