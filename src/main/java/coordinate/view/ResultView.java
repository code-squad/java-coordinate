package coordinate.view;

import coordinate.domain.Coordinate;

import java.util.ArrayList;

public class ResultView {
    public static final String ORIGIN = "  +";
    public static final String DASH = "---";
    public static final String NULL = "";
    public static final String VERTICAL = "|";

    public static void viewCoordinate(Coordinate c) {
        ArrayList<String> yAxis = printYAxis(c.getSize());

        for (int i = c.getSize() - 1; i > 0; i--) {
            System.out.print(yAxis.get(i));
            printPoint(c);
        }
        printXAxis(c.getSize());
    }

    private static void printPoint(Coordinate c) {
        for (int j = 1; j < c.getSize(); j++) {
            //System.out.print(String.format("%3s", "·"));
        }
        System.out.println();
    }

    public static void printXAxis(int size) {
        System.out.print(ORIGIN);
        for (int i = 0; i < size-1; i++) {
            System.out.print(String.format("%3s", DASH));
        }
        System.out.println();
        for (int i = 0; i <= size; i++) {
            initXAxisLable(i);
        }
    }

    private static void initXAxisLable(int i) {
        if(i % 2 == 0) {
            System.out.print(String.format("%3d %2s", i, NULL));
        }
    }

    public static ArrayList printYAxis(int size) {
        ArrayList<String> yAxis = new ArrayList<>();
        for (int i = 0; i <=size; i++) {
            initYAxisLable(yAxis, i);
        }
        return yAxis;
    }

    private static void initYAxisLable(ArrayList<String> yAxis, int i) {
        String tmp = String.format("%2s", NULL);
        if (i % 2 == 0) {
            tmp = String.format("%2d", i);
        }
        yAxis.add(tmp + VERTICAL);
    }
}
