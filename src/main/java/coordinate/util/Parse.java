package coordinate.util;

import coordinate.domain.Coordinate;

import java.util.ArrayList;
import java.util.Arrays;

public class Parse {
    private static final String BAR = "-";

    public static ArrayList<String> splitInput(String input) {
        return new ArrayList<>(Arrays.asList(input.split(BAR)));
    }

    public static ArrayList<String> removeBracket(ArrayList<String> input) {
        ArrayList<String> result = new ArrayList<>();
        for (String i : input) {
            result.add(i.substring(Coordinate.ONE, i.length() - Coordinate.ONE));
        }
        return result;
    }
}
