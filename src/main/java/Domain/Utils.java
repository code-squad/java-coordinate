package Domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Utils {

    private static final int MAX_NUMBER = 24;
    private static final int MIN_NUMBER = 0;

    public static ArrayList<String> checkReturnCoordinates(String coordinates) {
        List<String> coords = inputParser(coordinates);
        if (!isValidCoordinate(coords)){
            throw new RuntimeException();
        }
        return (ArrayList<String>) coords;
    }

    static boolean isValidCoordinate(List<String> coords){
        return coordInBoundaryCheck(coords) && duplicatedCheck(coords);
    }

    static boolean coordInBoundaryCheck(List<String> coords){
        String listString = coords.stream().map(Object::toString).collect(Collectors.joining(","));
        String[] InputOneLine = listString.split(",");
        for (String coord : InputOneLine) {
            eachCoordInBoundaryCheck(Integer.parseInt(coord));
        }
        return true;
    }

    static boolean eachCoordInBoundaryCheck(int number){
        if (number > MAX_NUMBER || number < MIN_NUMBER) {
            System.out.println("Coordinates must be lower than 24.");
            throw new RuntimeException();
        }
        return true;
    }

    static List<String> inputParser(String inputRaw){
        String[] inputs = inputRaw.split("-");
        List<String> coords = new ArrayList<>();
        for (String input : inputs) {
            coords.add(input.replaceAll("[()]", ""));
        }
        return coords;
    }

    static boolean duplicatedCheck(List<String> coords){
        Set<String> set = new HashSet<>(coords);
        if (set.size() != coords.size()){
            System.out.println("There are same coordinate pairs.");
            throw new RuntimeException();
        }
        return true;
    }

    static ArrayList<String> figureCheckReturn(ArrayList<String> coordinates) {
        Set<String> xCoords = new HashSet<>();
        Set<String> yCoords = new HashSet<>();
        for (String coordinate : coordinates) {
            String[] coordPair = coordinate.split(",");
            xCoords.add(coordPair[0]);
            yCoords.add(coordPair[1]);
        }
        if (xCoords.size() != yCoords.size()) {
            System.out.println("직사각형 또는 직선만 허용합니다.");
            throw new RuntimeException();
        }
        return coordinates;
    }


}
