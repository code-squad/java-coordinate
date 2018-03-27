package coordinate.view;

import coordinate.domain.*;

import java.util.List;

public class Output {

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printErrorMessage(List<Point> points) {
        System.out.print("중복되는 좌표가 있습니다. ");
        if (Line.isLine(points)) {
            System.out.println("두 점의 위치가 선을 형성하지 않습니다.");
        }
        if (Square.isSquare(points)) {
            System.out.println("네 점의 위치가 사각형을 형성하지 않습니다.");
        }
        if (Triangle.isTriangle(points)) {
            System.out.println("세 점의 위치가 삼각형을 형성하지 않습니다.");
        }
    }

    public static void printFigure(CoordinateCalculator cc) {
        String result = cc.buildCalc();
        System.out.println(result);
    }

    public static void printCalculationResult(Figure figure) {
        String area = String.valueOf(figure.calculate());
        System.out.println(area);
    }
}