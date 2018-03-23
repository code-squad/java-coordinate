package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rectangle {

    private double area;

    static int calculate(Points points) {
        List<Integer> xCoords = new ArrayList<>();
        List<Integer> yCoords = new ArrayList<>();
        final int RECTANGLE_CONSTANT = 4;
        for (int i = 0; i < RECTANGLE_CONSTANT; i++) {
            xCoords.add(points.getX(i));
            yCoords.add(points.getY(i));
        }
        Collections.sort(xCoords);
        Collections.sort(yCoords);
        int xLength = Math.abs(xCoords.get(0) - xCoords.get(xCoords.size() - 1));
        int yLength = Math.abs(yCoords.get(0) - yCoords.get(xCoords.size() - 1));
        int area = xLength * yLength;
        return area;
    }

}
