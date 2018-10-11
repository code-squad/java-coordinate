package coord.util;

import coord.domain.Point;
import coord.view.InputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Parser {
    private static final String X_Y_SEPARATOR = "\\)-\\(";

    public static List<Point> parseToPoints(String input) {
        List<Point> points = new ArrayList<>();
        List<String> seperatedInput = Arrays.asList(input.split(X_Y_SEPARATOR));

        for (String str : seperatedInput) {
            String replaced = str.replace("(", "")
                    .replace(")", "");
            points.add(Point.ofText(replaced));
        }
        duplicateCheck(points);
        return points;
    }

    private static void duplicateCheck(List<Point> points) {
        HashSet<Point> set = new HashSet<>(points);
        if (set.size() != points.size()) {
            System.out.println("위치가 같은 점이 존재합니다.");
            throw new IllegalArgumentException();
        }
    }
}
