package view;

import domain.Line;
import domain.Point;

import java.util.ArrayList;

public class ResultView {
    static final int MAX = 24;

    public static void printPoints(ArrayList<Point> points) {
        int pointIndex = 0;
        for (int yIndex = MAX; yIndex >= 1; yIndex--) {
            printYAxis(yIndex);
            pointIndex = printPoint(points, pointIndex, yIndex);
            System.out.println();
        }
        printXAxis();
    }

    private static int printPoint(ArrayList<Point> points, int pointIndex, int yIndex) {
        for (int xIndex = 1; xIndex < MAX; xIndex++) {
            if (points.size() <= pointIndex) {
                continue;
            }
            Point point = points.get(pointIndex);
            if (point.getY() != yIndex) {
                return pointIndex;
            }
            pointIndex = printX(point, pointIndex, xIndex);
        }
        return pointIndex;
    }

    private static int printX(Point point, int pointIndex, int xIndex) {
        if (point.getX() == xIndex) {
            System.out.print(String.format("%2s", "●"));
            return ++pointIndex;
        }
        System.out.print(String.format("%2s", "  "));
        return pointIndex;
    }

    private static Boolean printYAxis(int index) {
        if (index % 2 == 0) {
            System.out.print(String.format("%-2s" + "|", index));
            return true;
        }
        System.out.print(String.format("%-2s" + "|", "  "));
        return false;
    }

    private static void printXAxis() {
        System.out.print("  " + "+");
        for (int i = 0; i < MAX; i++) {
            System.out.print(String.format("%2s", "--")); // dash가 1개이면 x축이 짧아보여서 2개로 변경
        }
        System.out.print("\n" + String.format("%-3s", "0"));
        for (int i = 1; i < 13; i++) {
            System.out.print(String.format("%4s", i * 2));
        }
    }

    public static void printCalculation(ArrayList<Point> points) {
        if (points.size() == 2) {
            Line line = new Line(points.get(0), points.get(1));
            System.out.println("\n두 점 사이 거리는 " + line.getDistance());
        }
    }
}