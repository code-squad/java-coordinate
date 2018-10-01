package view;

import domain.Axis;
import domain.Xaxis;
import domain.Yaxis;

public class ResultView {
    public static void drawYaxis(Yaxis yaxis) {
        for (int i = Axis.MAX_SIZE - 1; i >= 0; i--) {
            printYaxisNum(yaxis, i);
            printYaxisBar(yaxis, i);
        }
    }

    private static void printYaxisNum(Yaxis yaxis, int index) {
        System.out.print(yaxis.getVerticalAxisNum().get(index));
    }

    private static void printYaxisBar(Yaxis yaxis, int index) {
        System.out.println(yaxis.getVerticalAxisBar().get(index));
    }

    public static void drawXaxis(Xaxis xaxis) {
        printXaxisBar(xaxis);
        printXaxisNum(xaxis);
    }

    private static void printXaxisNum(Xaxis xaxis) {
        StringBuilder sb = new StringBuilder();
        for (String horizontalEven : xaxis.getHorizontalAxisNum()) {
            sb.append(horizontalEven);
        }
        System.out.println(sb.toString());
    }

    private static void printXaxisBar(Xaxis xaxis) {
        StringBuilder sb = new StringBuilder();
        for (String bar : xaxis.getHorizontalAxisBar()) {
            sb.append(bar);
        }
        System.out.println(sb.toString());
    }
}
