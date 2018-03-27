package coordinate.view;

import coordinate.domain.*;

public class Output {

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printErrorMessage(Figure figure) {
        System.out.print("중복되는 좌표가 있습니다. ");
        if (Line.isLine(figure)) {
            System.out.println("두 점의 위치가 선을 형성하지 않습니다.");
        }
        if (Square.isSquare(figure)) {
            System.out.println("네 점의 위치가 사각형을 형성하지 않습니다.");
        }
        if (Triangle.isTriangle(figure)) {
            System.out.println("세 점의 위치가 삼각형을 형성하지 않습니다.");
        }
    }

    public static void printFigure(CoordinateCalculator cc) {
        String result = cc.buildCalc();
        System.out.println(result);
    }

    public static void printCalculationResult(Figure figure) {
        if (Line.isLine(figure)) {
            System.out.print("두 점 사이의 거리는: ");
        }
        if (Square.isSquare(figure)) {
            System.out.println("사각형의 면적은: ");
        }
        if (Triangle.isTriangle(figure)) {
            System.out.println("삼각형의 면적은: ");
        }
        String area = String.valueOf(figure.calculate());
        System.out.println(area);
    }
}