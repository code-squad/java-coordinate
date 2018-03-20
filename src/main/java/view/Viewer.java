package view;

import domain.point.Points;
import view.coordinate.Coordinate;
import view.util.ViewerUtils;

public class Viewer {

    public static void viewCoordinate(Points pointRepo) {
        Coordinate coordinate = new Coordinate();
        for (int pos = 0; pos < pointRepo.getSavedSize(); pos++) {
            coordinate.drawPosition(pointRepo.getPointXPosition(pos), pointRepo.getPointYPosition(pos));
        }
        String coordinateView = ViewerUtils.buildCoordinateView(coordinate);
        System.out.println(coordinateView);
    }

    public static void viewMessage(String message) {
        System.out.println(message);
    }

    public static void viewDistance(double distance) {
        System.out.println("두 점 사이 거리는 " + ViewerUtils.formatDistance(distance) + " 입니다.");
    }
}
