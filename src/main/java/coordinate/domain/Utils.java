package coordinate.domain;

import coordinate.view.Output;

import java.util.*;

public class Utils {
    private static final int COORDINATE_LENGTH = 2;
    private static final int LINE = 2;
    private static final int SQUARE = 4;
    private static final int TRIANGLE = 3;
    private static final int X_INDEX = 0;
    private static final int Y_INDEX = 1;

    static String[] checkInputFormat(String input) throws IllegalArgumentException {
        String[] splitInput = input.split("\\s*-\\s*");
        if (splitInput.length == LINE || splitInput.length == SQUARE || splitInput.length == TRIANGLE) {
            return splitInput;
        }
        Output.printMessage("좌표를 2개, 3개나 4개를 입력해주세요.");
        throw new IllegalArgumentException();
    }

    public static List<Point> processCoordinates(String input) {
        List<Point> points = new ArrayList<>();
        String[] splitInput = checkInputFormat(input);
        for (String set : splitInput) {
            int[] xySet = convertToIntegerArray(set);
            points = addPoint(points, xySet);
        }
        return points;
    }

    private static List<Point> addPoint(List<Point> points, int[] xySet) {
        Point newPoint = new Point(xySet[X_INDEX], xySet[Y_INDEX]);
        points.add(newPoint);
        return points;
    }

    static int[] convertToIntegerArray(String set) {
        String[] xySplit = set.replaceAll("[()]", "").split("\\s*,\\s*");
        return convertCoordinatesToIntegers(xySplit);
    }

    private static int[] convertCoordinatesToIntegers(String[] set) throws IllegalArgumentException {
        int[] xySet;
        try {
            xySet = Arrays.stream(set).mapToInt(Integer::parseInt).toArray();
        } catch (IllegalArgumentException e) {
            Output.printMessage("좌표가 숫자가 아닙니다.");
            throw e;
        }
        return checkCoordinateValidity(xySet);
    }

    private static int[] checkCoordinateValidity(int[] xySet) throws IllegalArgumentException {
        if (xySet.length != COORDINATE_LENGTH) {
            Output.printMessage("(x, y) 값만 입력해주세요.");
            throw new IllegalArgumentException();
        }
        return xySet;
    }

    static boolean isDuplicate(List<Point> points) {
        Set<Point> unique = new HashSet<>();
        for (Point point : points) {
            if (!unique.add(point)) return true;
        }
        return false;
    }
}