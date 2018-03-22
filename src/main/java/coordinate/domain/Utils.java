package coordinate.domain;

import coordinate.view.Output;

import java.util.Arrays;
import java.util.List;

public class Utils {
    private static final int MIN_NUMBER_OF_POINTS = 2;
    private static final int MAX_NUMBER_OF_POINTS = 4;

    public static String[] checkInputFormat(String input) throws IllegalArgumentException {
        String[] splitInput = input.split("\\s*-\\s*");
        if (splitInput.length == MIN_NUMBER_OF_POINTS || splitInput.length == MAX_NUMBER_OF_POINTS) {
            return splitInput;
        }
        Output.printMessage("좌표를 2개나 4개를 입력해주세요.");
        throw new IllegalArgumentException();
    }

    static int[] convertToIntegerArray(String set) throws IllegalArgumentException {
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
        return xySet;
    }

    static double calculateDistance(List<Point> points) {
        double xSquared = Math.pow(points.get(0).getX() - points.get(1).getX(), 2);
        double ySquared = Math.pow(points.get(0).getY() - points.get(1).getY(), 2);
        return Math.sqrt(xSquared + ySquared);
    }

    static int calculateArea(List<Point> points) {
        Integer[] xCoordinates = Points.returnXSet(points);
        Integer[] yCoordinates = Points.returnYSet(points);
        int height = Math.abs(xCoordinates[0] - xCoordinates[1]);
        int length = Math.abs(yCoordinates[0] - yCoordinates[1]);
        return height * length;
    }
}