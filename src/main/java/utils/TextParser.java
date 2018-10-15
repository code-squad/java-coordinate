package utils;

import domain.Point;

import java.util.*;

public class TextParser {
    public static final String MINUS = "-";
    public static final String COMMA = ",";

    private TextParser() {
    }

    public static List<Point> parse(String s) {
        List<Point> points = parseDetail(s);
        isValid(points);
        return points;
    }

    private static List<Point> parseDetail(String s) {
        try {
            List<Point> points = new ArrayList<>();
            String[] pointsText = s.split(MINUS);
            for (String pointText : pointsText) {
                String[] valsText = removeParenthesis(pointText).split(COMMA);
                points.add(makePoint(valsText));
            }
            return points;
        } catch(Exception e) {
            throw new IllegalArgumentException("잘못된 값이 입력되었습니다.");
        }

    }

    static void isValid(List<Point> points) {
        Set<Point> validPoint = new HashSet<>();
        for (Point point : points) {
            validPoint.add(point);
        }

        if(validPoint.size() != points.size()) {
            throw new IllegalArgumentException("위치가 같은 점(point)이 존재합니다. 세 점의 위치는 달라야 합니다.");
        }
    }

    public static Point makePoint(String[] valsText) {
        return new Point(Integer.parseInt(valsText[0]), Integer.parseInt(valsText[1]));
    }

    public static String removeParenthesis(String pointText) {
        return pointText.substring(1, pointText.length() - 1);
    }

}
