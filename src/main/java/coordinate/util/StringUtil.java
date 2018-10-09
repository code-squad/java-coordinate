package coordinate.util;

public class StringUtil {
    public static String[] splitStringByDash(String input) {
        return input.split("-");
    }

    public static String[] splitStringByComma(String input) {
        return input.split(",");
    }

    public static String removeParentheses(String input) {
        return input.substring(1, input.length() - 1);
    }
}
