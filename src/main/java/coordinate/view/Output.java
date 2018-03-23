package coordinate.view;

import coordinate.domain.*;

import java.util.List;

public class Output {

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printFigure(CoordinateCalculator cc) {
        String result = cc.buildCalc();
        System.out.println(result);
    }

    public static void printDistance(List<Point> points) {
        System.out.println("두 좌표 사이의 거리는: " + Line.calculateDistance(points));
    }

    public static void printArea(Shape shape) {
        String area = String.valueOf(shape.calculateArea());
        System.out.println("네 개의 좌표의 면적은: " + area);
    }
}