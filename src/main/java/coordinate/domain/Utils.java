package coordinate.domain;

import coordinate.view.Output;

import java.util.Arrays;
import java.util.List;

public class Utils {
    private static final int NUMBER_OF_POINTS = 2;

    public static String[] checkInputFormat(String input) throws IllegalArgumentException {
        String[] splitInput = input.split("\\s*-\\s*");
        if (splitInput.length != NUMBER_OF_POINTS) {
            Output.printMessage("좌표를 2개 입력해주세요.");
            throw new IllegalArgumentException();
        }
        return splitInput;
    }

    static int[] convertToIntegerArray(String set) throws IllegalArgumentException {
        String[] xySplit = set.replaceAll("[()]", "").split("\\s*,\\s*");
        int[] xySet;
        try {
            xySet = convertCoordinatesToIntegers(xySplit);
        } catch (IllegalArgumentException e) {
            Output.printMessage("좌표 포맷이 맞지 않습니다.");
            throw e;
        }
        return xySet;
    }

    private static int[] convertCoordinatesToIntegers(String[] set) throws IllegalArgumentException {
        int[] xySet;
        try {
            xySet = Arrays.stream(set).mapToInt(Integer::parseInt).toArray();
        } catch (IllegalArgumentException e) {
            throw e;
        }
        return xySet;
    }

    static double calculateDistance(List<Point> points) {
        double xSquared = Math.pow(points.get(0).getX() - points.get(1).getX(), 2);
        double ySquared = Math.pow(points.get(0).getY() - points.get(1).getY(), 2);
        return Math.sqrt(xSquared + ySquared);
    }
}