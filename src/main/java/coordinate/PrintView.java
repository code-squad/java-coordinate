package coordinate;

import java.util.*;

public class PrintView {
    private static final int AXIS_MAX = 24;
    private static final String VERTICAL = "│";
    private static final String ZERO_POINT = "┼";
    private static final String ROW = "───";
    private static final String THREE_STRING = "%3s";
    private static final String SIX_STRING = "%6s";
    private static final String BLANK = " ";

    public static void drawVertical(List<Point> points) {
        for (int i = AXIS_MAX; i > 0; i--) {
            if (i % 2 == 0)
                System.out.printf(THREE_STRING, String.valueOf(i) + VERTICAL);
            if (i % 2 == 1)
                System.out.printf(THREE_STRING, VERTICAL);
            drawDotSpace(i, points);
            System.out.println();
        }
    }

    private static void drawDotSpace(int i, List<Point> points) {
        for (int j = 0; j < AXIS_MAX * ROW.length(); j++) {
            drawDot(i, points, j);
            System.out.print(BLANK);
        }
    }

    private static void drawDot(int i, List<Point> points, int j) {
        String dot = "●";
        for (Point point : points) {
            if (point.isY(i) && point.isX(j)) {
                System.out.print(dot);
                break;
            }
        }
    }

    public static void drawRow() {
        System.out.printf(THREE_STRING, ZERO_POINT);
        for (int i = 0; i < AXIS_MAX; i++) {
            System.out.print(ROW);
        }
        System.out.println();
    }

    public static void rowNumber() {
        System.out.printf(THREE_STRING, String.valueOf(0));
        for (int i = 1; i <= AXIS_MAX; i++) {
            if (i % 2 == 0)
                System.out.printf(SIX_STRING, String.valueOf(i));
        }
        System.out.println();
    }

    public static void printLength(double lineLength) {
        System.out.print("두 점 사이 거리는 ");
        System.out.println(lineLength);
    }
}
