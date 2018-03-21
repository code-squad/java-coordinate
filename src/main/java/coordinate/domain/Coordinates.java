package coordinate.domain;

import coordinate.view.Output;

import java.util.*;

public class Coordinates {
    private static final int X_INDEX = 0;
    private static final int Y_INDEX = 1;
    private static final int DOMAIN_RANGE = 24;
    private static final int COORDINATE_LENGTH = 2;
    private List<Integer> xCoord = new ArrayList<>();
    private List<Integer> yCoord = new ArrayList<>();

    public Coordinates(String[] coordinates) {
        Set<Integer[]> xyCoordinates = toIntegerCoordinates(coordinates);
        for (Integer[] coordinate : xyCoordinates) {
            this.xCoord.add(coordinate[X_INDEX]);
            this.yCoord.add(coordinate[Y_INDEX]);
        }
    }

    private static Set<Integer[]> toIntegerCoordinates(String[] splitInput) throws IllegalArgumentException {
        Set<Integer[]> xyCoordinates = new HashSet<>();
        for (String set : splitInput) {
            Integer[] xySet = convertToIntegerArray(set);
            xyCoordinates = addToSet(xyCoordinates, xySet);
        }
        return xyCoordinates;
    }

    static Set<Integer[]> addToSet(Set<Integer[]> xyCoordinates, Integer[] xySet) throws IllegalArgumentException {
        boolean duplicateFlag = xyCoordinates.add(xySet);
        if (!duplicateFlag) {
            Output.printMessage("중복된 좌표가 있습니다.");
            throw new IllegalArgumentException();
        }
        return xyCoordinates;
    }

    static Integer[] convertToIntegerArray(String set) throws IllegalArgumentException {
        String[] xySplit = set.replaceAll("[()]", "").split("\\s*,\\s*");
        Integer[] xySet;
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

    private static Integer[] convertCoordinatesToIntegers(String[] set) throws IllegalArgumentException {
        Integer[] xySet;
        try {
            xySet = Arrays.stream(set).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }
        return xySet;
    }

    private static boolean isValidCoordinate(Integer[] xySet) {
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