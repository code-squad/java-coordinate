package view;

import domain.Figure;
import domain.Point;

import java.util.List;

public class ResultView {
    public static void printCoordinate(List<Point> pl) {
        CoordinateView.makeCoordinate();
        for (Point point : pl) {
            CoordinateView.drawDot(point.findPointPosition());
        }
        System.out.println(CoordinateView.getCoordinateSb());
    }

    public static void printArea(Figure figure) {
        System.out.println(figure.name() + figure.area());
    }
}