package view;

import domain.point.Points;
import view.coordinate.Coordinate;
import view.util.ViewerUtils;

public class Viewer {

    public static void viewCoordinate(Points pointRepo) {
        Coordinate coordinate = new Coordinate(pointRepo);
        // TODO : 좌표들을 꺼내와서 좌표지에 표시하는 작업


        String coordinateView = ViewerUtils.buildCoordinateView(coordinate);
        System.out.println(coordinateView);
    }

    public static void viewMessage(String message) {
        System.out.println(message);
    }

    public static void viewDistance(double distance) {
        System.out.println("두 점 사이 거리는 " + distance + " 입니다.");
    }
}
