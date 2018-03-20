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

    public static void printDistance(CoordinateCalculator cc){
        String distance = String.valueOf(cc.calculateDistance());
        System.out.println("두 점 사이의 거리는: " + distance);
    }
}