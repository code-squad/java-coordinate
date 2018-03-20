package coordinate.view;

import coordinate.domain.Row;

import java.util.List;

public class Builder {
    private static final int GRAPH_LOCATION = 100;

    public static String startBuild(List<Row> rows) {
        StringBuilder builder = new StringBuilder();
        for (int y = rows.size() - 1; y >= 0; y--) {
            builder.append(addRow(rows, y));
            builder.append("\n");
        }
        String xLabel = addXLabel(rows.get(rows.size() - 1));
        builder.append(formatRow(xLabel));//add format spaces before x-label
        builder.append(xLabel);

        return builder.toString();
    }

    private static String addRow(List<Row> rows, int y) {
        StringBuilder builder = new StringBuilder();
        builder.append(addYLabel(y)); //append y-label
        builder.append(addCoordinates(rows.get(y), y)); //append row
        builder.insert(0, formatRow(builder.toString())); //format to align y-axis

        return builder.toString();
    }

    static String addYLabel(int y) {
        StringBuilder builder = new StringBuilder();
        if (y % 2 == 0) {
            return builder.append(y).toString();
        }
        return builder.append(" ").toString();
    }

    static String formatRow(String row) {
        StringBuilder builder = new StringBuilder();
        int diff = GRAPH_LOCATION - row.length();
        for (int i = 0; i < diff; i++) {
            builder.append(" ");
        }
        return builder.toString();
    }

    private static String addCoordinates(Row row, int y) {
        StringBuilder builder = new StringBuilder();
        for (int x = 0; x <= row.getRowSize() - 1; x++) {
            builder.append(addPoint(row.dotAtPoint(x), x, y));
        }
        return builder.toString();
    }

    static String addPoint(boolean isDot, int x, int y) {
        if (!isDot && x == 0 && y == 0) { //(0,0) and no dot
            return " +";
        }
        if (!isDot && x == 0) { //(0,y) and no dot
            return " |";
        }
        if (!isDot && y == 0) { //(x,0) and no dot
            return " -";
        }
        if (isDot) {
            return " *";
        }
        return "  "; //no dot
    }

    private static String addXLabel(Row row) {
        StringBuilder builder = new StringBuilder();
        for (int x = 2; x <= row.getRowSize() - 1; x++) {
            builder.append(addXLabelNumber(x));
        }
        return builder.toString();
    }

    static String addXLabelNumber(int x) {
        if (x % 2 == 0 && String.valueOf(x).length() < 2) {
            return " " + x;
        }
        if (x % 2 == 0 && String.valueOf(x).length() >= 2) {
            return String.valueOf(x);
        }
        return "  ";
    }
}