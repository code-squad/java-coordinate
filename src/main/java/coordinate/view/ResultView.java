package coordinate.view;

import coordinate.controller.Point;

import java.util.ArrayList;
import java.util.Collections;

public class ResultView {

    private static final String WIDTH_LINE = "│";
    private static final String BLANK = " ";
    private static final String HEIGHT_LINE = "─";
    private static final String POINT = "ㆍ";

    private static String input = "";

    public static void height(ArrayList<Integer> y, ArrayList<Integer> x, ArrayList<Point> points) {
        Collections.reverse(y);

        for (int i = 0; i < y.size() - 1; i++) {
            input = String.format("%2s", BLANK);
            input = multiple(y.get(i), input);
            System.out.print(input);
            System.out.print(WIDTH_LINE);

            pointDisplay(y.get(i), x, points);
            System.out.println();
        }
    }

    private static String multiple(int axisNum, String input) {
        if (axisNum % 2 == 0) {
            input = String.format("%2d", axisNum);
        }
        return input;
    }

    private static void pointDisplay(int y, ArrayList<Integer> x, ArrayList<Point> point) {
        for (int j = 1; j < x.size(); j++) {
            input = BLANK;
            pointRepetition(y, point, j);
            System.out.print(input);
        }
    }

    private static void pointRepetition(int y, ArrayList<Point> point, int coordinatesX) {
        for (int k = 0; k < point.size(); k++) {
            locationCriteria(y, point.get(k).getX(), point.get(k).getY(), coordinatesX);
        }
    }

    private static void locationCriteria(int line, int pointX, int pointY, int coordinatesX) {
        if (condition(pointX, coordinatesX) && condition(pointY, line)) {
            input = POINT;
        }
    }

    private static boolean condition(int point, int index) {
        return point == index;
    }

    public static void width(ArrayList<Integer> axisNum) {
        System.out.print(String.format("%3s", "+"));
        for (int i = 0; i < axisNum.size(); i++) {
            System.out.print(HEIGHT_LINE);
        }
        System.out.println();
        widthNum(axisNum);
        System.out.println();
    }

    private static void widthNum(ArrayList<Integer> axisNum) {
        for (Integer integer : axisNum) {
            input = String.format("%2s", BLANK);
            input = multiple(integer, input);
            System.out.print(input);
        }
    }

    public static void distance(ArrayList<Point> points) {
        System.out.println("두 점 사이 거리는 : " + points.get(0).getDistance(points.get(1)));
    }
}
