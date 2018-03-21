package coordinate.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Coordinates {
    private static final int X_INDEX = 0;
    private static final int Y_INDEX = 1;
    private static final int RANGE = 1;
    private static final int COORDINATE_LENGTH = 2;
    private List<Integer> xCoord = new ArrayList<>();
    private List<Integer> yCoord = new ArrayList<>();

    Coordinates(String[] coordinates) {
        List<Integer[]> xyCoordinates = toIntegerCoordinates(coordinates);
        for (Integer[] coordinate : xyCoordinates) {
            this.xCoord.add(coordinate[X_INDEX]);
            this.yCoord.add(coordinate[Y_INDEX]);
        }
    }

    public static List<Integer[]> toIntegerCoordinates(String[] splitInput) { //also check for redundant coordinate!!
        List<Integer[]> xyCoordinates = new ArrayList<>();
        for (String set : splitInput) {
            xyCoordinates.add(convertToIntegerArray(formatArray(set)));
        }
        return xyCoordinates;
    }

    static String[] formatArray(String set) throws IllegalArgumentException {
        String[] xySplit = set.replaceAll("[()]", "").split("\\s*,\\s*");
        Integer[] xySet = convertToIntegerArray(xySplit);
        if (!isValidCoordinate(xySet)) {
            throw new IllegalArgumentException();
        }
        return xySplit;
    }


    static boolean isValidCoordinate(Integer[] xySet) {
        if (xySet.length != COORDINATE_LENGTH) {
            return false;
        }
        if (isOutOfDomainRange(xySet[X_INDEX]) || isOutOfDomainRange(xySet[Y_INDEX])) {
            return false;
        }
        return true;
    }

    private static boolean isOutOfDomainRange(Integer number) {
        return number > RANGE;
    }

    private static Integer[] convertToIntegerArray(String[] set) throws IllegalArgumentException {
        Integer[] xySet;
        try {
            xySet = Arrays.stream(set).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }
        return xySet;
    }

    public boolean containsY(int y) {
        return yCoord.contains(y);
    }

    public int getXIndex(int y) {
        return xCoord.get(yCoord.indexOf(y));
    }

    public double calculateDistance() {
        double xSquared = Math.pow(xCoord.get(0) - xCoord.get(1), 2);
        double ySquared = Math.pow(yCoord.get(0) - yCoord.get(1), 2);
        return Math.sqrt(xSquared + ySquared);
    }
}