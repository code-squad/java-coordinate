package coordinate.domain;

import coordinate.view.Output;

import java.util.*;

public class Points {
    private static final int X_INDEX = 0;
    private static final int Y_INDEX = 1;
    private static final int DOMAIN_RANGE = 24;
    private static final int COORDINATE_LENGTH = 2;
    private List<Point> points;

    public Points(String[] coordinates) {
        this.points = initPoints(coordinates);
    }

    private static List<Point> initPoints(String[] splitInput) throws IllegalArgumentException {
        List<Point> points = new ArrayList<>();
        for (String set : splitInput) {
            int[] xySet = convertToIntegerArray(set);
            addPoints(points, xySet);
        }
        return points;
    }

    static List<Point> addPoints(List<Point> points, int[] xySet) throws IllegalArgumentException {
        Point newPoint = new Point(xySet[X_INDEX], xySet[Y_INDEX]);
        if (points.contains(newPoint)) {
            Output.printMessage("중복된 좌표가 있습니다.");
            throw new IllegalArgumentException();
        }
        points.add(newPoint);
        return points;
    }

    static int[] convertToIntegerArray(String set) throws IllegalArgumentException {
        String[] xySplit = set.replaceAll("[()]", "").split("\\s*,\\s*");
        int[] xySet;
        try {
            xySet = convertCoordinatesToIntegers(xySplit);
        } catch (IllegalArgumentException e) {
            Output.printMessage("좌표 포맷이 맞지 않습니다.");
            throw new IllegalArgumentException();
        }
        if (!isValidCoordinate(xySet)) {
            Output.printMessage("좌표 포맷이 맞지 않습니다.");
            throw new IllegalArgumentException();
        }
        return xySet;
    }

    private static int[] convertCoordinatesToIntegers(String[] set) throws IllegalArgumentException {
        int[] xySet;
        try {
            xySet = Arrays.stream(set).mapToInt(Integer::parseInt).toArray();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }
        return xySet;
    }

    private static boolean isValidCoordinate(int[] xySet) {
        if (xySet.length != COORDINATE_LENGTH) {
            return false;
        }
        if (isOutOfDomainRange(xySet[X_INDEX]) || isOutOfDomainRange(xySet[Y_INDEX])) {
            return false;
        }
        return true;
    }

    private static boolean isOutOfDomainRange(Integer number) {
        return number > DOMAIN_RANGE;
    }

    List<Integer> getXOnRowY(int y) {
        List<Integer> pointsOnRowY = new ArrayList<>();
        for (Point point : points) {
            if (point.contains(y)) {
                pointsOnRowY.add(point.getX());
            }
        }
        return pointsOnRowY;
    }

    double calculateDistance() {
        double xSquared = Math.pow(points.get(0).getX() - points.get(1).getX(), 2);
        double ySquared = Math.pow(points.get(0).getY() - points.get(1).getY(), 2);
        return Math.sqrt(xSquared + ySquared);
    }
}