package domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FigureFactory {

    public static Figure create(List<String> coordinates){
        if (isLine(coordinates)) return new Line(coordinates);
        if (isTriangle(coordinates)) return new Triangle(coordinates);
        if (isRectangle(coordinates)) return new Rectangle(coordinates);
        System.out.println("제대로 된 입력값을 주세요.");
        throw new RuntimeException();
    }

    static boolean isLine(List<String> coordinates) {
        return coordinates.size() == 2;
    }

    static boolean isTriangle(List<String> coordinates) {
        return coordinates.size() == 3;
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
        System.out.println("직사각형을 입력해 주세요.");
        throw new RuntimeException();
    }

    public static Figure of(List<String> coordinates){
        return create(coordinates);
    }

}
