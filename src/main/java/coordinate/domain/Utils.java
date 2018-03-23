package coordinate.domain;

import coordinate.view.Output;

import java.util.Arrays;

public class Utils {
    private static final int COORDINATE_LENGTH = 2;
    private static final int LINE_POINTS = 2;
    private static final int SQUARE_POINTS = 4;
    static final int X_INDEX = 0;
    static final int Y_INDEX = 1;

    static String[] checkInputFormat(String input) throws IllegalArgumentException {
        String[] splitInput = input.split("\\s*-\\s*");
        if (splitInput.length == LINE_POINTS || splitInput.length == SQUARE_POINTS) {
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
        return checkCoordinateValidity(xySet);
    }

    private static int[] checkCoordinateValidity(int[] xySet) throws IllegalArgumentException {
        if (xySet.length != COORDINATE_LENGTH) {
            Output.printMessage("(x, y) 값만 입력해주세요.");
            throw new IllegalArgumentException();
        }
        return xySet;
    }
}