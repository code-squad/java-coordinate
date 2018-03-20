package coordinate.view;

import coordinate.domain.CoordinateCalculator;

public class Output {
    public static void printGraph(CoordinateCalculator cc) {
        String result = cc.buildCalc();
        System.out.println(result);
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}