package view;

import domain.point.Points;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static Points addPoints(String printMessage, int validPointNum) throws IllegalArgumentException {
        Viewer.viewMessage(printMessage);
        String[] coordinates = getCoordinates(validPointNum);
        Points pointRepo = Points.of();
        for (String coordinate : coordinates) {
            ArrayList<Integer> pointNumbers = splitPointNums(coordinate);
            savePoint(pointRepo, pointNumbers);
        }
        return pointRepo;
    }

    private static String[] getCoordinates(int validPointNum) throws IllegalArgumentException {
        String coordinatesSource = scanner.nextLine();
        String[] coordinates = splitCoordinates(coordinatesSource);
        verifyPointNum(coordinates, validPointNum);
        return coordinates;
    }

    private static void verifyPointNum(String[] coordinates, int validCoordinateNum) throws IllegalArgumentException {
        if (validCoordinateNum != coordinates.length) {
            throw new IllegalArgumentException(validCoordinateNum + "개 좌표를 입력해야합니다.");
        }
    }

    private static String[] splitCoordinates(String coordinatesSource) {
        return coordinatesSource.split("-");
    }

    private static ArrayList<Integer> splitPointNums(String coordinate) throws NumberFormatException {
        ArrayList<Integer> splitPointNums = new ArrayList<>();

        // TODO : 소스 단순화하기
        coordinate = coordinate.replace("(", "");
        coordinate = coordinate.replace(")", "");
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

    private static void savePoint(Points pointRepo, ArrayList<Integer> pointNumbers) throws IllegalArgumentException {
        final int xPosition = 0;
        final int yPosition = 1;
        pointRepo.addPoint(pointNumbers.get(xPosition), pointNumbers.get(yPosition));
    }
}
