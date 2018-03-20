package coordinate.domain;

import coordinate.Main;
import coordinate.view.Output;

import java.util.*;

public class Utils {
    private static final int NUMBER_OF_POINTS = 2;

    public static String[] checkInputFormat(String input) {
        String[] splitInput = input.split("\\s*-\\s*");
        if (splitInput.length != NUMBER_OF_POINTS) {
            Output.printMessage("좌표를 2개 입력해주세요.");
            return Main.promptUserInput();
        }
        return splitInput;
    }

    public static List<Integer[]> toIntegerCoordinates(String[] splitInput) { //also check for redundant coordinate!!
        List<Integer[]> xySets = new ArrayList<>();
        for (String set : splitInput) {
            xySets.add(convertToIntegerArray(convertToStringArray(set)));
        }
        return xySets;
    }

    static String[] convertToStringArray(String set) {
        String[] xySplit = set.replaceAll("[()]", "").split("\\s*,\\s*");
        if (!isValidCoordinate(xySplit)) {
            System.out.println("좌표 포맷이 맞지 않습니다.");
            return Main.promptUserInput();
        }
        return xySplit;
    }

    static boolean isValidCoordinate(String[] xySplit) {
        if (xySplit.length != 2) {
            return false;
        }
        if (isOutOfDomainRange(xySplit[0]) || isOutOfDomainRange(xySplit[1])) {
            return false;
        }
        return true;
    }

    private static boolean isOutOfDomainRange(String number) {
        return Integer.parseInt(number) > 24;
    }

    static Integer[] convertToIntegerArray(String[] set) {
        return Arrays.stream(set).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
    }
}