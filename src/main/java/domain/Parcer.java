package domain;

import java.util.ArrayList;
import java.util.List;

public class Parcer {
    private String input;

    public Parcer(String input) {
        this.input = input;
    }

    public String[] splitHyphen() {
        return input.split("-");
    }

    public String[] removeBracket(String[] str) {
        String[] temp = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            temp[i] = str[i].substring(1, str[i].length() - 1);    //"a,b","c,d"
        }
        return temp;
    }

    public String[] splitComma(String str) {
        return str.split(",");
    }

    public Integer[] stringToInteger(String[] str) {
        Integer[] pos = new Integer[2];
        for (int i = 0; i < str.length; i++) {
            pos[i] = Integer.parseInt(str[i]);
        }
        return pos;
    }

    public List<Integer[]> makePostionList(String[] temp) {
        List<Integer[]> pos = new ArrayList<>();
        for (int i = 0; i < temp.length; i++) {
            pos.add(stringToInteger(splitComma(temp[i])));       //a,b,c,d
        }
        return pos;
    }

    public List<Integer[]> makePostion() {
        String[] str = splitHyphen();           //"(a,b)","(c,d)"
        String[] temp = removeBracket(str);     //"a,b","c,d"
        return makePostionList(temp);
    }
}