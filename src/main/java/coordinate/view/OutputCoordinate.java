package coordinate.view;

import coordinate.domain.Line;
import coordinate.domain.Point;

import java.util.ArrayList;

public class OutputCoordinate {

    private static final int Y_AXIS_MAX = 24;
    private static ArrayList<Point> pointList = new ArrayList<>();

    public static void printCoordinate(ArrayList<String> points, int numOfPoints) {
        for (int i = 0; i < points.size(); i++) {
            pointList.add(new Point(points.get(i)));
        }
        draw(numOfPoints);
    }

    public static void draw(int numOfPoints) {
        for (int y = Y_AXIS_MAX; y > 0; y--) {
            oddCheck(y);
            System.out.print("|");
            drawX(y, numOfPoints);
            System.out.println();
        }
        System.out.printf("%3s", "+");
        System.out.println("------------------------------------------------");
        OutputCoordinate.printNumber();
    }

    private static void drawX(int y, int numOfPoints) {
        for (int x = 0; x < 25; x++) {
            printPoint(x, y, numOfPoints);
        }
    }

    private static void printPoint(int x, int y, int numOfPoints) {
        for (int i = 0; i < numOfPoints; i++) {
            printStar(x, y, i);
        }
        System.out.print("  ");
    }

    private static void printStar(int x, int y, int i) {
        if (checkPoint(x, y, pointList.get(i)))
            System.out.print("*");
    }

    private static boolean checkPoint(int x, int y, Point point) {
        return point.getPointX() == x && point.getPointY() == y;
    }

    private static void oddCheck(int i) {
        if (i % 2 == 0) {
            System.out.printf("%2s", i);
        }

        if (i % 2 != 0) {
            System.out.printf("%2s", "  ");
        }
    }

    private static void printNumber() {
        System.out.printf("%3s", "0");
        for (int i = 1; i < 25; i++) {
            checkNumber(i);
        }
        System.out.println();
    }

    private static void checkNumber(int i) {
        if (i % 2 == 0 && i != 0) {
            System.out.printf("%4s", i);
        }
    }
}
