package view;

import domain.*;

import java.util.List;

public class ResultView {
    private ResultView() {

    }

    public static void drawAxis(Space space) {
        drawYaxis(space);
        drawXaxis();
    }
    private static void drawYaxis(Space space) {
        for (int i = Axis.MAX_SIZE - 1; i >= 0; i--) {
            printYaxisNum(i);
            printYaxisBar(i);
            printPoints(i, space);
        }
    }

    private static void printYaxisNum(int index) {
        System.out.print(Axis.getVerticalAxisNum().get(index));
    }

    private static void printYaxisBar(int index) {
        System.out.print(Axis.getVerticalAxisBar().get(index));
    }

    private static void printPoints(int index, Space space) {
        for(String str : space.getLines().get(index).getLine()) {
            System.out.print(str);
        }
        System.out.println();

    }

    private static void drawXaxis() {
        printXaxisBar();
        printXaxisNum();
    }

    private static void printXaxisNum() {
        StringBuilder sb = new StringBuilder();
        for (String horizontalEven : Axis.getHorizontalAxisNum()) {
            sb.append(horizontalEven);
        }
        System.out.println(sb.toString());
    }

    private static void printXaxisBar() {
        StringBuilder sb = new StringBuilder();
        for (String bar : Axis.getHorizontalAxisBar()) {
            sb.append(bar);
        }
        System.out.println(sb.toString());
    }

    public static void printDistance(List<Point> points) {
        System.out.println("두 점 사이의 거리는 : " + Distance.getDistance(points));
    }
}
