package util;

public class Parser {

    public static String[] parsingPointString(String input) {
        return input.split("-");
    }

    public static int[] splitStrPoint(String value) {
        int[] result = new int[2];
        String[] values = value.split(",");

        result[0] = Integer.parseInt(values[0].substring(1));
        result[1] = Integer.parseInt(values[1].substring(0,values[1].length()-1));

        return result;
    }

}
