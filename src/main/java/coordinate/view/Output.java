package coordinate.view;

import coordinate.domain.*;

public class Output {

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printFigure(CoordinateCalculator cc) {
        String result = cc.buildCalc();
        System.out.println(result);
    }

    public static void printLength(Shape line) {
        System.out.println("두 좌표 사이의 거리는: " + line.calculate());
    }

    public static void printArea(Shape shape) {
        String area = String.valueOf(shape.calculate());
        System.out.println("네 개의 좌표의 면적은: " + area);
    }
}