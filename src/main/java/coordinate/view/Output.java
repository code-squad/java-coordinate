package coordinate.view;

import coordinate.domain.Line;

public class Output {

    private static final int Y_AXIS_MAX = 24;

    static Line line;

    public static void draw() {
        for (int y = Y_AXIS_MAX; y > 0; y--) {
            odd(y);
            notOdd(y);
            System.out.print("|");
            drawX(y);
            System.out.println();
        }
    }

    private static void drawX(int y) {
        for (int x = 0; x < 25; x++) {
            printPoint1(x, y);
            printPoint2(x, y);
        }
    }

    private static void printPoint1(int x, int y) {
        if (line.getPointFirstY() == y && line.getPointFirstX() == x)
            System.out.print(" *");
        System.out.print(" ");
    }

    private static void printPoint2(int x, int y) {
        if (line.getPointSecondY() == y && line.getPointSecondX() == x)
            System.out.print(" *");
        System.out.print(" ");
    }

    private static void odd(int i) {
        if (i % 2 == 0)
            System.out.printf("%2s", i);
    }

    private static void notOdd(int i) {
        if (i % 2 != 0)
            System.out.printf("%2s", "  ");
    }

    public static void printNumber() {
        System.out.printf("%3s", "0");
        for (int i = 1; i < 25; i++) {
            checkNumber(i);
        }
    }

    private static void checkNumber(int i) {
        if (i % 2 == 0 && i != 0) {
            System.out.printf("%4s", i);
        }
    }

    public static void printResult(Line line) {
        System.out.println("x의 길이 " + line.xDistance());
        System.out.println("y의 길이 " + line.yDistance());
        System.out.println("두 점 사이의 거리는 : " + line.calculateDistance());
    }

}
