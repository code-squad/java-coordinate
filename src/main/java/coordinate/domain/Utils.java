package coordinate.domain;

import coordinate.CoordinateCalculatorConsole;

import java.util.*;

public class Utils {
    private static final int NUMBER_OF_POINTS = 2;

    public static String[] checkInputFormat(String input) {
        String[] splitInput = input.split("\\s*-\\s*");
        if (splitInput.length > NUMBER_OF_POINTS) {
            System.out.println("좌표는 최대 2개만 입력해주세요.");
            return CoordinateCalculatorConsole.promptUserInput();
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

    public static String[] convertToStringArray(String set) {
        String[] xySplit = set.replaceAll("[()]", "").split("\\s*,\\s*");
        if (!isValidCoordinate(xySplit)) {
            System.out.println("좌표 포맷이 맞지 않습니다.");
            return CoordinateCalculatorConsole.promptUserInput();
        }
        return xySplit;
    }

    public static boolean isValidCoordinate(String[] xySplit) {
        if(xySplit.length != 2){
            return false;
        }
        if(isOutOfDomainRange(xySplit[0]) || isOutOfDomainRange(xySplit[1])){
            return false;
        }
        return true;
    }

    public static boolean isOutOfDomainRange(String number){
        return Integer.parseInt(number) >= 24;
    }

    public static Integer[] convertToIntegerArray(String[] set) {
        return Arrays.stream(set).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
    }
}