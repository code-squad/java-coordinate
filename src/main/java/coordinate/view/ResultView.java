package coordinate.view;

import coordinate.domain.Coordinate;
import coordinate.domain.CoordinatePlane;
import coordinate.domain.Rectangles;
import coordinate.domain.Triangle;
import coordinate.util.InputException;

import java.util.ArrayList;

import static coordinate.util.Constant.CRITERIA_FOR_RECTANGLE;
import static coordinate.util.Constant.CRITERIA_FOR_TRIANGLE;

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
        int preX = 0;
        for (Coordinate point : points) {
            preX = printLineAsterisk(index, sb, preX, point);
        }
        return sb;
    }

    private static int printLineAsterisk(int index, StringBuilder sb, int preX, Coordinate point) {
        if(point.getY() == index) {
            preX = printAsterisk(sb, preX, point);
        }
        return preX;
    }

    private static int printAsterisk(StringBuilder sb, int preX, Coordinate point) {
        for (int i = preX; i < point.getX() - 1; i++) {
            sb.append(String.format("%3s", " "));
        }
        sb.append(String.format("%3s", "*"));
        preX = point.getX();
        return preX;
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

    public static void showCalculation(ArrayList<Coordinate> p) throws InputException {
        if (p.size() == CRITERIA_FOR_LINE) {
            double distance = p.get(0).getDistance(p.get(1));
            System.out.println("\n두 점 사이 거리는 " + distance);
        }

        if (p.size() == CRITERIA_FOR_TRIANGLE) {
            Triangle t = new Triangle(p);
            double result = t.getArea();
            System.out.println("\n삼각형의 넓이는 " + result);
        }

        if (p.size() == CRITERIA_FOR_RECTANGLE) {
            Rectangles r = new Rectangles(p);
            double result = r.getArea();
            System.out.println("\n사각형의 넓이는 " + result);
        }
    }
}
