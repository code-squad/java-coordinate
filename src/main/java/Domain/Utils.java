package Domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Utils {

    public static ArrayList<String> checkReturnCoordinates(String coordinates) {
        List<String> coords = inputParser(coordinates);
        if (!isValidCoordinate(coords)){
            throw new RuntimeException();
        }
        return (ArrayList<String>) coords;
    }

    private static boolean isValidCoordinate(List<String> coords){
        return coorMaxCheck(coords) && duplicatedCheck(coords);
    }

    private static boolean coorMaxCheck(List<String> coords){
        String listString = coords.stream().map(Object::toString).collect(Collectors.joining(","));
        String[] InputOneLine = listString.split(",");
        for (String coord : InputOneLine) {
            return eachCoorMaxCheck(Integer.parseInt(coord));
        }
        return true;
    }

    private static boolean eachCoorMaxCheck(int number){
        if (number > 24) {
            System.out.println("Coordinates must be lower than 24.");
            throw new RuntimeException();
        }
        return true;
    }

    private static List<String> inputParser(String inputRaw){
        String[] inputs = inputRaw.split("-");
        List<String> coords = new ArrayList<>();
        for (String input : inputs) {
            coords.add(input.replaceAll("[()]", ""));
        }
        return coords;
    }

    private static boolean duplicatedCheck(List<String> coords){
        Set<String> set = new HashSet<>(coords);
        if (set.size() != coords.size()){
            System.out.println("There are same coordinate pairs.");
            throw new RuntimeException();
        }
        return true;
    }
}
