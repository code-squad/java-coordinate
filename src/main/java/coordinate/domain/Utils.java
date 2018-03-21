package coordinate.domain;

import coordinate.view.Output;

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
}