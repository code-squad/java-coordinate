package view;

import domain.Point;

import java.util.List;

public class ResultView {
    public static void printCoordinate(List<Point> pl) {
        CoordinateView cv = new CoordinateView();
        cv.makeCoordinate();
        for (int i = 0; i < pl.size(); i++) {
            cv.drawDot(pl.get(i).findPointPostion());
        }
        System.out.println(cv.getCoordinateSb());
    }

    public static void printLineLength(double len) {
        System.out.println("\n");
        System.out.println("두 점 사이 거리는 " + String.format("%.6f", len));
    }

}