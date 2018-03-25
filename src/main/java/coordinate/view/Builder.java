package coordinate.view;

import com.google.common.collect.Lists;
import coordinate.domain.Coordinate;

import java.util.List;

import static coordinate.domain.CoordinateCalculator.DOMAIN;

public class Builder {
    private static final int ROW_SIZE = 25;

    public static String startBuild(List<Coordinate> coordinates) {
        StringBuilder builder = new StringBuilder();
        for (Coordinate coordinate : Lists.reverse(coordinates)) {
            builder.append(addYLabel(coordinates, coordinate)); //add y-label
            builder.append(addCoordinate(coordinate)); //add coordinate
            builder.append(addNewLine(coordinate)); //add new line if x == 24
        }
        builder.append(addXLabel());//add x-label
        return builder.toString();
    }

    static String addYLabel(List<Coordinate> coordinates, Coordinate coordinate) {
        if (coordinate.isFirst() && coordinate.yIsEven()) { //if coordinate x == 0 and x is even, add the number before the coordinate
            return String.valueOf((coordinates.indexOf(coordinate) / ROW_SIZE));
        }
        if (coordinate.isFirst() && !coordinate.yIsEven()) { //if coordinate x == 0 and x is odd, add a space before the coordinate
            return " ";
        }
        return "";
    }

    static String addCoordinate(Coordinate coordinate) {
        String element = "  ";
        if (coordinate.isOnYAxis() && coordinate.yIsOneDigit()) {
            element = " |";
        }
        if (coordinate.isOnYAxis() && coordinate.yIsEven() && !coordinate.yIsOneDigit()) {
            element = "|";
        }
        if (coordinate.isOnYAxis() && !coordinate.yIsEven() && !coordinate.yIsOneDigit()) {
            element = " |";
        }
        if (coordinate.isOnXAxis()) {
            element = " -";
        }
        if (coordinate.isOnXAxis() && coordinate.isOnYAxis()) { //(0,0)
            element = " +";
        }
        if (coordinate.isPoint() && coordinate.yIsOneDigit()) {
            element = " *";
        }
        if (coordinate.isPoint() && !coordinate.yIsOneDigit()) {
            element = "*";
        }
        return element;
    }

    private static String addNewLine(Coordinate coordinate) {
        if (coordinate.isLast()) {
            return "\n";
        }
        return "";
    }

    private static String addXLabel() {
        StringBuilder builder = new StringBuilder();
        for (int x = 0; x <= DOMAIN; x++) {
            builder.append(addXLabelNumber(x));
        }
        return builder.toString();
    }

    static String addXLabelNumber(int x) {
        if (x == 0) {
            return "  " + x;
        }
        if (x % 2 == 0 && String.valueOf(x).length() < 2) {
            return " " + x;
        }
        if (x % 2 == 0 && String.valueOf(x).length() >= 2) {
            return String.valueOf(x);
        }
        return "  ";
    }
}