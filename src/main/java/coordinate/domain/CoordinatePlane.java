package coordinate.domain;

import coordinate.util.Constant;
import coordinate.util.InputException;
import coordinate.util.StringUtil;

import java.util.ArrayList;
import java.util.Collections;

public class CoordinatePlane {
    private static final int MAX = 25;
    private final int size;

    public CoordinatePlane() {
        this.size = MAX;
    }

    public int getSize() {
        return size;
    }

    public static ArrayList<Coordinate> enterCoordinates(String input) throws IllegalArgumentException{
        ArrayList<Coordinate> coordinates = createCoordinates(input);
        Collections.sort(coordinates);
        return coordinates;
    }

    private static ArrayList<Coordinate> createCoordinates(String input) throws IllegalArgumentException{
        ArrayList<Coordinate> coordinates = new ArrayList<>();
        String[] inputs = StringUtil.splitStringByDash(input);
        for (String s : inputs) {
            String[] coordinate = StringUtil.splitStringByComma
                    (StringUtil.removeParentheses(s));
            coordinates.add(Coordinate.of(coordinate[0], coordinate[1]));
        }
        return coordinates;
    }

    public void checkFigure(ArrayList<Coordinate> c) throws InputException {
        if (c.size() == Constant.CRITERIA_FOR_RECTANGLE) {
           new Rectangles(c);
        }
    }
}
