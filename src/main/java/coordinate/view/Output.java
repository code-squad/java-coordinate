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

    public static void printDistance(CoordinateCalculator cc) {
        String distance = String.valueOf(cc.calculateDistance());
        System.out.println("두 좌표 사이의 거리는: " + distance);
    }

    public static void printArea(CoordinateCalculator cc) {
        String area = String.valueOf(cc.calculateArea());
        System.out.println("네 좌표의 면적은: " + area);
    }
}