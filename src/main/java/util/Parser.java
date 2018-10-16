package util;

import java.util.ArrayList;
import java.util.List;

public class Parser {

    private static String[] splitHyphen(String input) {
        return input.split("-");
    }

    private static String[] removeBracket(String[] str) {
        String[] temp = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            temp[i] = str[i].substring(1, str[i].length() - 1);    //"a,b","c,d"
        }
        return temp;
    }

    private static String[] splitComma(String str) {
        return str.split(",");
    }

    private static Integer[] stringToInteger(String[] str) {
        Integer[] pos = new Integer[2];
        for (int i = 0; i < str.length; i++) {
            pos[i] = Integer.parseInt(str[i]);
        }
        return pos;
    }

    private static List<Integer[]> makePostionList(String[] temp) {
        List<Integer[]> pos = new ArrayList<>();
        for (String t : temp) {
            pos.add(stringToInteger(splitComma(t)));        //a,b,c,d
        }
        return pos;
    }

    public static List<Integer[]> makePosition(String input) {
        String[] str = splitHyphen(input);           //"(a,b)","(c,d)"
        String[] temp = removeBracket(str);     //"a,b","c,d"
        return makePostionList(temp);
    }
}