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

    public static void printCalculationResult(Figure figure) {
        String area = String.valueOf(figure.calculate());
        System.out.println(area);
    }
}