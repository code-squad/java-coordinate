package view;

import domain.*;

public class ResultView {
    private ResultView() {

    }

    public static void printDistance(Line line) {
        System.out.println("두점 사이의 거리는 : " + line.getDistance());
    }

    public static void drawAxis(Line line) {
        drawYaxis(line);
        drawXaxis();
    }
    private static void drawYaxis(Line line) {
        for (int i = Axis.MAX_SIZE -1; i >= 0; i--) {
            printYaxisNum(i);
            printYaxisBar(i);
            printPoints(i, line);
        }
    }

    private static void printYaxisNum(int index) {
        System.out.print(Axis.getVerticalAxisNum().get(index));
    }

    private static void printYaxisBar(int index) {
        System.out.print(Axis.getVerticalAxisBar().get(index));
    }

    private static void printPoints(int index, Line line) {
        StringBuilder sb = new StringBuilder();
        int prevPointIndex = 0;
        for(Point point : line.getPoints()) {
            if(point.getY() == index + 1) {
                sb.append(printDot(prevPointIndex, point.getX()));
                prevPointIndex = point.getX();
            }
        }
        System.out.println(sb.toString());

    }

    private static String printDot(int prevPointIndex, int xIndex) {
        StringBuilder sb = new StringBuilder();
        for(int i = prevPointIndex; i < xIndex - 1; i++) {
            sb.append(Axis.BLANK);
        }
        sb.append(Point.DOT_IMAGE);
        return sb.toString();
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
}
