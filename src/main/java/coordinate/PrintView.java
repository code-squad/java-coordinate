package coordinate;

import java.util.*;

public class PrintView {
    private static final int AXIS_MAX = 24;
    private static final String VERTICAL = "│";
    private static final String ZERO_POINT = "┼";
    private static final String ROW = "───";
    private static final String THREE_STRING = "%3s";
    private static final String SIX_STRING = "%6s";

    public static void drawVertical(List<Point> points) {
        for (int y = AXIS_MAX; y > 0; y--) {
            if (y % 2 == 0)
                System.out.printf(THREE_STRING, String.valueOf(y) + VERTICAL);
            if (y % 2 == 1)
                System.out.printf(THREE_STRING, VERTICAL);
            drawDotSpace(y, points);
            System.out.println();
        }
    }

    private static void drawDotSpace(int y, List<Point> points) {
        String blank = " ";
        for (int x = 1; x <= AXIS_MAX * ROW.length(); x++) {
            if (isDot(y, points, x))
                System.out.print(blank);
        }
    }

    private static Boolean isDot(int y, List<Point> points, int x) {
        String dot = "●";
        for (Point point : points) {
            if (point.matchPoint(x, y)) {
                System.out.print(dot);
                return false;
            }
        }
        return true;
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
}
