package coordinate.util;

import java.util.ArrayList;
import java.util.List;

public class StringHandler {
    private static final String HYPHEN = "-";
    private static final String COMMA = ",";
    private static final int FIRST = 1;

    public static String[] splitHyphen(String original){
        return original.split(HYPHEN);
    }

    public static String[] splitComma(String original){
        return original.split(COMMA);
    }

    public static String cutBracket(String original){
        return original.substring(FIRST, original.length() - FIRST);
    }

    public static List<Integer> parseIntegers(String[] originals){
        List<Integer> targets = new ArrayList<>();
        for (String original : originals) {
            targets.add(Integer.parseInt(original));
        }
        return targets;
    }
}
