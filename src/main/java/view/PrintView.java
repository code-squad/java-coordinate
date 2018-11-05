package view;

import model.Parser;
import model.Point;

import java.util.List;


public class PrintView {
    private static StringBuilder coordinatePrint = new StringBuilder();
    public static final int COORDINATE = 24;
    //이것도 마찬가지다.
    private static List<Point> points = Parser.makePoints();

    public void printAll(double figures) {
        printCoordinate(figures);
        System.out.println(coordinatePrint.toString());
    }

    public static void printCoordinate(double figures) {
        printBarY();
        coordinatePrint.append(String.format("%3s", "┼"));
        printBarX();
        coordinatePrint.append(String.format("value : " + "%-1.3f", figures));
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

    private static void printBarY() {
        for (int i = COORDINATE; i >= 1; i--) {
            printNumY(i);
            printHeight();
            for (int j = 0; j < COORDINATE; j++) {
                for (int a = 0; a < points.size(); a++) {
                    markingDot(i, j, a);
                }
            }
            coordinatePrint.append("\n");
        }
    }

    private static void markingDot(int i, int j, int a) {
        if (points.get(a).getY() == i && points.get(a).getX() == j) {
            coordinatePrint.append("*");
        }
        if (points.get(a).getY() != i || points.get(a).getX() != j) {
            coordinatePrint.append(String.format("%1s", " "));
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
}
