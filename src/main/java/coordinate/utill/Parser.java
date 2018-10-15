package coordinate.utill;

import coordinate.domain.Point;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Parser {
    public static String[] deshSeparator(String text) {
        if (!text.contains("-")) {
            throw new IllegalArgumentException("'-'를 찾을 수 없습니다. (좌표는 '-'로 구분합니다.)");
        }
        return text.split("-");
    }

    public static List<String> parenthesisRemove(String[] text) {
        List<String> values = new ArrayList<>();
        for (int i = 0; i < text.length; i++) {
            values.add(text[i].replace("(", "").replace(")", ""));
        }
        return values;
    }

    public static List<Point> overlapCheck(List<Point> points) {
        Set<Point> checkPoints = new HashSet<>(points);
        if (checkPoints.size() != points.size()) {
            throw new IllegalArgumentException("위치가 같은 점(point)이 존재합니다. 세 점의 위치는 달라야 합니다.");
        }
        return points;
    }
}
