package view;

import domain.Axis;

public class ResultView {
    public static void drawAxis(Axis axis) {
        drawYaxis(axis);
        drawXaxis(axis);
    }
    private static void drawYaxis(Axis axis) {
        for (int i = Axis.MAX_SIZE - 1; i >= 0; i--) {
            printYaxisNum(axis, i);
            printYaxisBar(axis, i);
        }
    }

    private static void printYaxisNum(Axis axis, int index) {
        System.out.print(axis.getVerticalAxisNum().get(index));
    }

    private static void printYaxisBar(Axis axis, int index) {
        System.out.println(axis.getVerticalAxisBar().get(index));
    }

    private static void drawXaxis(Axis axis) {
        printXaxisBar(axis);
        printXaxisNum(axis);
    }

    private static void printXaxisNum(Axis axis) {
        StringBuilder sb = new StringBuilder();
        for (String horizontalEven : axis.getHorizontalAxisNum()) {
            sb.append(horizontalEven);
        }
        System.out.println(sb.toString());
    }

    private static void printXaxisBar(Axis axis) {
        StringBuilder sb = new StringBuilder();
        for (String bar : axis.getHorizontalAxisBar()) {
            sb.append(bar);
        }
        System.out.println(sb.toString());
    }
}
