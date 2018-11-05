package coordinate.domain;

import coordinate.controller.Point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Movement {

    private static final int MAX_NUM = 24;

    public static List<Integer> axis() {
        List<Integer> axisNum = new ArrayList<>();
        for (int i = 0; i <= MAX_NUM; i++) {
            axisNum.add(i);
        }
        return axisNum;
    }

    public List<Point> pointCreate(String temporaryPoint) {
        return pointObject(cutPoint(conversion(temporaryPoint)));
    }

    private String conversion(String temporaryPoint) {
        String input = temporaryPoint.
                replace("(", "").
                replace(")", "").
                replace("-", ",");
        return input;
    }

    private int[] cutPoint(String temporaryPoint) {
        String[] point = temporaryPoint.split(",");
//        String a = "1";
//        int b = Integer.parseInt(a);
        int[] input = Arrays.asList(point).stream().mapToInt(Integer::parseInt).toArray();

        return input;
    }

    private List<Point> pointObject(int[] temporaryPoint) {
        List<Point> points = new ArrayList<>();

        for (int i = 0; i < temporaryPoint.length; i = i + 2) {
            points.add(new Point(temporaryPoint[i], temporaryPoint[i + 1]));
        }
        return points;
    }
}