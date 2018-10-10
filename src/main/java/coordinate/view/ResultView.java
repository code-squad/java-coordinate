package coordinate.view;

import coordinate.domain.Coordinate;
import coordinate.domain.CoordinatePlane;
import coordinate.domain.LineSegment;

import java.util.ArrayList;

public class ResultView {
    public static final String ORIGIN_OF_COORDINATES = "  +";
    public static final String DASH = "---";
    public static final String NULL = "";
    public static final String VERTICAL = "|";
    public static final int CRITERIA_FOR_LINE = 2;

    public static void drawCoordinatePlane(CoordinatePlane c, ArrayList<Coordinate> p) {
        for (int i = c.getSize() - 1; i > 0; i--) {
            System.out.print(initYAxisLable(i));
            System.out.println(printCoordinate(p, i));
        }
        printXAxis(c.getSize());
    }

    private static String initYAxisLable(int i) {
        String tmp = String.format("%2s", NULL);
        if (i % 2 == 0) {
            tmp = String.format("%2d", i);
        }
        return tmp + VERTICAL;
    }

    private static StringBuilder printCoordinate(ArrayList<Coordinate> points, int index) {
        StringBuilder sb = new StringBuilder();
        for (Coordinate point : points) {
            isExistCoordinate(index, sb, point);
        }
        return sb;
    }

    private static void isExistCoordinate(int index, StringBuilder sb, Coordinate point) {
        if (point.getY() == index) {
            printAsterisk(sb, point);
        }
    }

    private static void printAsterisk(StringBuilder sb, Coordinate point) {
        for (int i = 0; i < point.getX() - 1; i++) {
            sb.append(String.format("%3s", " "));
        }
        sb.append(String.format("%3s", "*"));
    }

    private static void printXAxis(int size) {
        System.out.print(ORIGIN_OF_COORDINATES);
        for (int i = 0; i < size - 1; i++) {
            System.out.print(String.format("%3s", DASH));
        }
        System.out.println();
        for (int i = 0; i <= size; i++) {
            initXAxisLable(i);
        }
        System.out.println();
    }

    private static void initXAxisLable(int i) {
        if(i % 2 == 0) {
            System.out.print(String.format("%3d %2s", i, NULL));
        }
    }

    public static void showDistanceCalculation(ArrayList<Coordinate> p) {
        if(p.size() == CRITERIA_FOR_LINE) {
            LineSegment line = new LineSegment(p.get(0), p.get(1));
            System.out.println("\n두 점 사이 거리는 " + line.getDistance());
        }
    }
}
