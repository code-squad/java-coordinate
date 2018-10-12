package coordinate.domain;

import coordinate.util.InputException;

import java.util.ArrayList;

public class Rectangles {
    private final ArrayList<Coordinate> coordinates;

    public Rectangles(ArrayList<Coordinate> coordinates) throws InputException{
        if (!(isSameXLine(coordinates) && isSameYLine(coordinates))) {
            throw new InputException("직사각형이 아닙니다.다시 입력해주세요.");
        }
        this.coordinates = coordinates;
    }

    public boolean isSameXLine(ArrayList<Coordinate> c) {
        return c.get(0).isSameXCoordinate(c.get(1)) && c.get(2).isSameXCoordinate(c.get(3));
    }

    public boolean isSameYLine(ArrayList<Coordinate> c) {
        return c.get(0).isSameYCoordinate(c.get(2)) && c.get(1).isSameYCoordinate(c.get(3));
    }

    public double getArea() {
        return coordinates.get(0).getDistance(coordinates.get(1)) * coordinates.get(0).getDistance(coordinates.get(2));
    }
}
