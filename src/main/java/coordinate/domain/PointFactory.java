package coordinate.domain;

import java.util.ArrayList;
import java.util.List;

public class PointFactory {

    public static List<Point> makePointFactory(String input) {
        List<Point> points = new ArrayList<>();
        String[] divisionPoints = input.split("-");
        for (String point : divisionPoints) {
            points.add(makePoint(point));
        }
        return points;
    }

    private static String replaceString(String point) {
        String result = point.replaceAll("\\)", "");
        result = result.replaceAll("\\(", "");
        result = result.replaceAll(" ", "");
        return result;
    }

    private static Point makePoint(String point) {
        String[] pointCoordinate = replaceString(point).split(",");
        return new Point(Integer.parseInt(pointCoordinate[0]), Integer.parseInt(pointCoordinate[1]));
    }

    public static List<Point> testInput(String input) {
        return makePointFactory(input);
    }

}
