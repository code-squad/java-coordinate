package view;

import domain.point.Points;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static Points getPoints(String printMessage) throws IllegalArgumentException {
        Viewer.viewMessage(printMessage);
        String[] coordinates = getCoordinates();
        Points pointRepo = new Points();
        for (String coordinate : coordinates) {
            List<Integer> pointNumbers = splitPointNums(coordinate);
            savePoint(pointRepo, pointNumbers);
        }
        return pointRepo;
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

    private static void savePoint(Points pointRepo, List<Integer> pointNumbers) throws IllegalArgumentException {
        final int xPosition = 0;
        final int yPosition = 1;
        pointRepo.addPoint(pointNumbers.get(xPosition), pointNumbers.get(yPosition));
    }
}
