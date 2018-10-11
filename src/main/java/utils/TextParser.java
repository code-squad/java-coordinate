package utils;

import domain.Point;

import java.util.ArrayList;
import java.util.List;

public class TextParser {
    public static final String MINUS = "-";
    public static final String COMMA = ",";

    private TextParser() {
    }

    public static List<Point> parse(String s) {
        List<Point> points = new ArrayList<>();
        String[] pointsText = s.split(MINUS);
        for (String pointText : pointsText) {
            String[] valsText = removeParenthesis(pointText).split(COMMA);
            points.add(makePoint(valsText));
        }
        return points;
    }

    public static Point makePoint(String[] valsText) {
        return new Point(Integer.parseInt(valsText[0]), Integer.parseInt(valsText[1]));
    }

    public static String removeParenthesis(String pointText) {
        return pointText.substring(1, pointText.length() - 1);
    }

}
