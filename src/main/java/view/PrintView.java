package view;

import model.Line;
import model.MakeLine;
import model.Point;

public class PrintView {
    private static StringBuilder coordinatePrint = new StringBuilder();
    public static final int COORDINATE = 24;


    public void printAll(Line line, MakeLine parser) {
        Point a = parser.getaPoints();
        Point b = parser.getbPoints();
        printCoordinate(a, b);
        printDistance(line.lineDistance());
        System.out.println(String.valueOf(coordinatePrint));
    }

    public static void printCoordinate(Point a, Point b) {
        printBarY(a, b);
        coordinatePrint.append(String.format("%3s", "┼"));
        printBarX();
    }

    private static void printBarX() {
        for (int i = 0; i < COORDINATE; i++) {
            printRow();
        }
        coordinatePrint.append("\n");
        coordinatePrint.append("    ");
        for (int j = 0; j <= COORDINATE; j += 2) {
            coordinatePrint.append(String.format("%2d", j));
            coordinatePrint.append(String.format("%6s", " "));
        }
        coordinatePrint.append("\n");
    }

    private static void printBarY(Point a, Point b) {
        for (int i = COORDINATE; i >= 1; i--) {
            printNumY(i);
            printHeight();
            if (i == a.getY()) {
                skipDot(a);
            }
            if (i == b.getY()) {
                sameYBar(a, b);
                diffrentYBar(a, b);
            }
            coordinatePrint.append("\n");
        }
    }

    private static void skipDot(Point a) {
        for (int j = 0; j < a.getX(); j++) {
            coordinatePrint.append(String.format("%4s", " "));
        }
        coordinatePrint.append("*");
    }

    private static void sameYBar(Point a, Point b) {
        if (a.getY() == b.getY()) {
            for (int j = 0; j < Math.abs(b.getX() - a.getX()); j++) {
                coordinatePrint.append(String.format("%4s", " "));
            }
            coordinatePrint.append("*");
        }
    }

    private static void diffrentYBar(Point a, Point b) {
        if (a.getY() != b.getY()) {
            skipDot(b);
        }
    }

    private static void printNumY(int i) {
        if (i % 2 == 0) {
            coordinatePrint.append(String.format("%2d", i));
        }
        if (i % 2 == 1) {
            coordinatePrint.append(String.format("%2s", " "));
        }
    }

    public static void printRow() {
        for (int i = 0; i < 2; i++) {
            coordinatePrint.append("─");
        }
    }

    public static void printHeight() {
        coordinatePrint.append("┃");
    }

    private static void printDistance(double lineDistance) {
        coordinatePrint.append("점과 점사이의 간격 : ");
        coordinatePrint.append(String.format("%-10.3f", lineDistance));
    }
}
