package coordinate.view;

import com.google.common.collect.Lists;
import coordinate.domain.Coordinate;

import java.util.List;

import static coordinate.domain.CoordinateCalculator.DOMAIN;

public class Builder {

    public static String startBuild(List<Coordinate> coordinates) {
        StringBuilder builder = new StringBuilder();
        for (Coordinate coordinate : Lists.reverse(coordinates)) {
            addYLabel(coordinates, coordinate); //add y-label
            addCoordinate(coordinate); //add coordinate
            addNewLine(coordinates, coordinate); //add new line if x == 24
        }
        addXLabel();//add x-label
        return builder.toString();
    }

    static String addYLabel(List<Coordinate> coordinates, Coordinate coordinate) {
        StringBuilder builder = new StringBuilder();
        if (coordinate.yIsEven()) {
            return builder.append(coordinates.indexOf(coordinate)).toString();
        }
        return builder.append(" ").toString();
    }

    private static String addCoordinate(Coordinate coordinate) {
        StringBuilder builder = new StringBuilder();
        if (coordinate.isOnYAxis()) {
            builder.append(" |");
        }
        if (coordinate.isOnXAxis()) {
            builder.append(" -");
        }
        if (coordinate.isOnXAxis() && coordinate.isOnYAxis()) { //(0,0)
            builder.append(" +");
        }
        if (coordinate.isPoint()) {
            builder.append(" *");
        }
        builder.append("  ");
        return builder.toString();
    }

    private static String addNewLine(List<Coordinate> coordinates, Coordinate coordinate) {
        StringBuilder builder = new StringBuilder();
        if (coordinates.indexOf(coordinate) == DOMAIN) {
            builder.append("\n");
        }
        return builder.toString();
    }

    private static String addXLabel() {
        StringBuilder builder = new StringBuilder();
        for (int x = 2; x <= DOMAIN; x++) {
            builder.append(addXLabelNumber(x));
        }
        return builder.toString();
    }

    private static String addXLabelNumber(int x) {
        if (x % 2 == 0 && String.valueOf(x).length() < 2) {
            return " " + x;
        }
        if (x % 2 == 0 && String.valueOf(x).length() >= 2) {
            return String.valueOf(x);
        }
        return "  ";
    }
}