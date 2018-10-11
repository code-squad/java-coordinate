package coordinate.domain;

import java.util.ArrayList;

public class PointFactory {

    public static ArrayList<Point> makePointFactory(String input) {
        ArrayList<Point> points = new ArrayList<>();
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
        return new Point(Integer.parseInt(pointCoordinate[0]),Integer.parseInt(pointCoordinate[1]));
    }

    public static ArrayList<Point> testInput(String input) {
        return makePointFactory(input);
    }

}
