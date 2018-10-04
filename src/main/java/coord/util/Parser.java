package coord.util;

import coord.domain.Point;
import coord.view.InputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parser {
    private static final String X_Y_SEPARATOR = "\\)-\\(";

    public static List<Point> parseToPoints(String input) {
        List<Point> points = new ArrayList<>();
        List<String> seperatedInput = Arrays.asList(input.split(X_Y_SEPARATOR));

        for (String str : seperatedInput) {
            String replaced = str.replace("(", "")
                    .replace(")", "");
            try {
                points.add(Point.ofText(replaced));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println("다시 입력하세요");
                return parseToPoints(InputView.getCoord());
            }
        }
        return points;
    }
}
