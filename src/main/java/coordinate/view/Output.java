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

    public static void printCalculationResult(Calculable figure) {
        if (figure.getType().equals("Line")) {
            System.out.print("두 점 사이의 거리는: ");
        }
        if (figure.getType().equals("Square")) {
            System.out.print("사각형의 면적은: ");
        }
        if (figure.getType().equals("Triangle")) {
            System.out.print("삼각형의 면적은: ");
        }
        String area = String.valueOf(figure.calculate());
        System.out.println(area);
    }
}