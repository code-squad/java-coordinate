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

    public static void printLength(Figure line) {
        System.out.println("두 좌표 사이의 거리는: " + line.calculate());
    }

    public static void printSquareArea(Figure figure) {
        String area = String.valueOf(figure.calculate());
        System.out.println("사각형의 면적은: " + area);
    }

    public static void printTriangleArea(Figure figure) {
        String area = String.valueOf(figure.calculate());
        System.out.println("삼각형의 면적은: " + area);
    }
}