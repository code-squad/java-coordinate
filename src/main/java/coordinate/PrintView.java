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
        for (int x = 1; x <= AXIS_MAX * ROW.length(); x++) {
            if (drawDot(y, points, x))
                System.out.print(BLANK);
        }
    }

    private static Boolean drawDot(int y, List<Point> points, int x) {
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

    public static void printLength() {
        System.out.print("두 점 사이 거리는 ");
    }

    public static void printCube() {
        System.out.print("사각형의 넓이는 ");
    }

    public static void printTriangle(){
        System.out.print("삼각형의 넓이는 ");
    }

    public static void dotCountReWrite() {
        System.out.print("직사각형이 아니거나 점의 개수는 2개혹은 4개 이어야 합니다.");
    }

    public static void printWhatIs(int count){
        if(count==2)
            printLength();
        if(count==3)
            printTriangle();
        if (count==4)
            printCube();
    }
}
