package view;

import domain.Val;
import dto.PointDto;

import java.util.List;

public class ResultView {
    public static final String Y_AXIS = "|";
    public static final String X_AXIS = "---";
    public static final String Y_SPACE = "2";
    public static final String X_SPACE = "3";
    public static final String POINT_MARK = "●";
    public static final String BLANCK = "";


    private ResultView() {
    }

    public static void printCoord(List<PointDto> points) {
        System.out.println();
        for (int y = Val.VAL_MAX; y > Val.VAL_MIN; y--) {
            printAxisY(y);
            printPoints(y, points);
            System.out.println();
        }
        printAxisX();
    }

    private static void printPoints(int y, List<PointDto> points) {
        for (int x = Val.VAL_MIN + 1; x <= Val.VAL_MAX; x++) {
            String pointMark = checkPoint(x, y, points);
            System.out.printf("%" + X_SPACE + "s", pointMark);
        }
    }

    private static String checkPoint(int x, int y, List<PointDto> points) {
        for (PointDto point : points) {
            if(point.getX() == x && point.getY() == y) {
                 return POINT_MARK;
            }
        }
        return BLANCK;
    }

    private static void printAxisY(int i) {
        System.out.printf("%" + Y_SPACE + "s" + Y_AXIS, getEvenNum(i));
    }

    private static void printAxisX() {
        System.out.printf("%" + X_SPACE + "s", "+");
        for (int j = Val.VAL_MIN; j <= Val.VAL_MAX; j++) {
            System.out.printf("%" + X_SPACE + "s", X_AXIS);
        }
        System.out.println();
        for (int j = Val.VAL_MIN; j <= Val.VAL_MAX; j++) {
            System.out.printf("%" + X_SPACE + "s", getEvenNum(j));
        }
        System.out.println();
    }

    private static String getEvenNum(int i) {
        if (i % 2 == 0) {
            return String.valueOf(i);
        }
        return BLANCK;
    }

    public static void printResult(double lineDistance) {
        System.out.println();
        System.out.printf("두 점 사이 거리는 %f\n", lineDistance);
    }

}
