package domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Rectangle extends Figure {

    Rectangle(List<String> coordinates) {
        super.points = Points.initCoordinates(coordinates);
    }

    public void calculate() {
        super.area = super.points.calculateRectangle();
    }

    public static Figure createFigure(List<String> coordinates){
        if(!isRectangle(coordinates)) {
            throw new RuntimeException();
        }
        return new Rectangle(coordinates);
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

    @Override
    public String toString() {
        return "Rectangle";
    }

}
