package view.util;

import domain.point.Point;
import view.coordinate.Coordinate;

public class ViewerUtils {

    public static String formatDistance(double distance) {
        return String.format("%.3f", distance);
    }

    public static String buildCoordinateView(Coordinate coordinate) {
        StringBuilder builder = new StringBuilder();
        for (int yPosition = Point.Y_POSITION_LIMIT; yPosition >= 0; yPosition--) {
            builder.append(getYNumber(yPosition));
            builder.append(getXPositionView(coordinate, yPosition));
            builder.append("\n");
        }
        builder.append(getXNumberLine());
        return builder.toString();
    }

    private static String getXNumberLine() {
        StringBuilder builder = new StringBuilder();
        for (int xPosition = 0; xPosition <= Point.X_POSITION_LIMIT; xPosition++) {
            builder.append(buildXNumberLine(xPosition));
        }
        return builder.toString();
    }

    private static String buildXNumberLine(int xPosition) {
        if (xPosition % 2 == 0) {
            return String.format("%3s", xPosition);
        }
        return String.format("%3s", " ");
    }

    private static String getYNumber(int lineNumber) {
        if (lineNumber % 2 == 0 && lineNumber > 0) {
            return String.format("%2s", lineNumber);
        }
        return String.format("%2s", " ");
    }

    private static String getXPositionView(Coordinate coordinate, int yPosition) {
        StringBuilder builder = new StringBuilder();
        for (int xPosition = 0; xPosition <= Point.X_POSITION_LIMIT; xPosition++) {
            builder.append(buildXPositionView(coordinate, xPosition, yPosition));
        }
        return builder.toString();
    }

    private static String buildXPositionView(Coordinate coordinate, int xPosition, int yPosition) {
        if (coordinate.isYAxisPosition(xPosition, yPosition)) {
            return buildYAxisView(coordinate, yPosition);
        }

        if (coordinate.isXAxisPosition(yPosition)) {
            return String.format("%s", getPositionLetter(PositionLetter.XAXIS));
        }
        return buildXDrawPositionView(coordinate, xPosition, yPosition);
    }

    private static String buildXDrawPositionView(Coordinate coordinate, int xPosition, int yPosition) {
        if (coordinate.isDrawPosition(xPosition, yPosition)) {
            return String.format("%3s", getPositionLetter(PositionLetter.MARK));
        }
        return String.format("%3s", getPositionLetter(PositionLetter.NORMAL));
    }

    private static String buildYAxisView(Coordinate coordinate, int yPosition) {
        if (coordinate.isXAxisPosition(yPosition)) {
            return getPositionLetter(PositionLetter.AXIS);
        }
        return getPositionLetter(PositionLetter.YAXIS);
    }

    private static String getPositionLetter(PositionLetter position) {
        return position.getLetter();
    }
}

enum PositionLetter {
    AXIS("+"),
    XAXIS("---"),
    YAXIS("|"),
    NORMAL(" "),
    MARK("*");

    private String letter;

    PositionLetter(String letter) {
        this.letter = letter;
    }

    public String getLetter() {
        return letter;
    }
}
