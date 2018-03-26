package coordinate.view;

import coordinate.domain.Line;

public class Output {

    private static final int Y_AXIS_MAX = 24;

    public static void draw(Line line) {
        for (int y = Y_AXIS_MAX; y > 0; y--) {
            oddCheck(y);
            System.out.print("|");
            drawX(y, line);
            System.out.println();
        }
        System.out.printf("%3s", "+");
        System.out.println("------------------------------------------------");
        Output.printNumber();
    }

    private static void drawX(int y, Line line) {
        for (int x = 0; x < 25; x++) {
            printPoint1(x, y, line);
            printPoint2(x, y, line);
        }
    }

    private static void printPoint1(int x, int y, Line line) {
        if (line.getPointFirstY() == y && line.getPointFirstX() == x)
            System.out.print(" *");
        System.out.print(" ");
    }

    private static void printPoint2(int x, int y, Line line) {
        if (line.getPointSecondY() == y && line.getPointSecondX() == x)
            System.out.print(" *");
        System.out.print(" ");
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

    public static void printResult(Line line) {
        System.out.println("x의 길이 " + line.xDistance());
        System.out.println("y의 길이 " + line.yDistance());
        System.out.println("두 점 사이의 거리는 : " + line.calculateDistance());
    }

}
