package domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FigureUtil {

    static boolean isLine(List<String> coordinates) {
        return coordinates.size() == 2;
    }

    static boolean isRectangle(List<String> coordinates) {
        Set<String> xCoords = new HashSet<>();
        Set<String> yCoords = new HashSet<>();
        for (String coordinate : coordinates) {
            String[] coordPair = coordinate.split(",");
            xCoords.add(coordPair[0]);
            yCoords.add(coordPair[1]);
        }
        if (coordinates.size() == 4 && xCoords.size() == yCoords.size()) {
            return true;
        }
        return false;
    }

    static boolean isTriangle(List<String> coordinates) {
        return coordinates.size() == 3;
    }
}
