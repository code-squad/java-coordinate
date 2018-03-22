package view;

import domain.Line;
import domain.figure.Rectangle;
import domain.figure.Triangle;
import domain.point.Point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static ArrayList<Point> getPoints(String printMessage) throws IllegalArgumentException {
        Viewer.viewMessage(printMessage);
        String[] coordinates = getCoordinates();
        ArrayList<Point> points = new ArrayList<>();
        for (String coordinate : coordinates) {
            List<Integer> pointNumbers = splitPointNums(coordinate);
            savePoint(points, pointNumbers);
        }
        verifyPoint(points);
        return points;
    }

    private static void verifyPoint(ArrayList<Point> points) throws IllegalArgumentException {
        if (!CoordinateNum.isValidCoordinateNum(points.size())) {
            throw new IllegalArgumentException("유효하지않은 좌표 개수입니다.");
        }

        if (!Rectangle.isInvalidPointNum(points)) {
            verifyRect(points);
        }
    }

    private static void verifyRect(ArrayList<Point> points) throws IllegalArgumentException {
        if (!Rectangle.isValidRectPoints(points)) {
            throw new IllegalArgumentException("사각형은 직사각형 좌표를 입력해야합니다.");
        }
    }

    private static String[] getCoordinates() {
        String coordinatesSource = scanner.nextLine();
        return splitCoordinates(coordinatesSource);
    }

    private static String[] splitCoordinates(String coordinatesSource) {
        return coordinatesSource.split("-");
    }

    private static List<Integer> splitPointNums(String coordinate) throws NumberFormatException {
        List<Integer> splitPointNums = new ArrayList<>();
        coordinate = coordinate.replaceAll("[()]", "");
        String[] points = coordinate.split(",");
        for (String pointMessage : points) {
            int point = convertToNum(pointMessage);
            splitPointNums.add(point);
        }
        return splitPointNums;
    }

    private static int convertToNum(String pointMessage) throws NumberFormatException {
        try {
            return Integer.parseInt(pointMessage);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("좌표 자리는 숫자만 입력해야합니다");
        }
    }

    private static void savePoint(ArrayList<Point> points, List<Integer> pointNumbers) throws IllegalArgumentException {
        final int xPosition = 0;
        final int yPosition = 1;
        Point point = new Point(pointNumbers.get(xPosition), pointNumbers.get(yPosition));
        points.add(point);
    }
}

enum CoordinateNum {
    LINE(Line.VALID_COORDINATE_NUM),
    RECT(Rectangle.VALID_COORDINATE_NUM),
    TRIANGLE(Triangle.VALID_COORDINATE_NUM);

    private int coordinateNum;

    CoordinateNum(int coordinateNum) {
        this.coordinateNum = coordinateNum;
    }

    public static boolean isValidCoordinateNum(int coordinateNum) {
        return Arrays.stream(CoordinateNum.values()).map(shape -> shape.coordinateNum).anyMatch(num -> num == coordinateNum);
    }
}