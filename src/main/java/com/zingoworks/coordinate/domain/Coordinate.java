package com.zingoworks.coordinate.domain;

import java.util.ArrayList;

import static com.zingoworks.coordinate.CoordinateMain.LENGTH_X;
import static com.zingoworks.coordinate.CoordinateMain.LENGTH_Y;

public class Coordinate {
    private Point x;
    private Point y;
    public ArrayList<StringBuilder> line = new ArrayList<>();

    public Coordinate(String[] input) {
        this.x = Point.ofCommaSeparator(extractRequiredString(input[0]));
        this.y = Point.ofCommaSeparator(extractRequiredString(input[1]));
        setLine();
        updateLine();
    }

    public double getDistanceOfPoints() {
        return x.getDistance(y);
    }

    private void setLine() {
        for (int i = 0; i < 24; i++) {
            line.add(new StringBuilder());
            for (int j = 0; j < 48; j++) {
                line.get(i).append(" ");
            }
        }
    }

    private void updateLine() {
        line.get(x.getY() - 1).setCharAt(x.getX() * 2 - 1,'·');
        line.get(y.getY() - 1).setCharAt(y.getX() * 2 - 1,'·');
    }

    private String extractRequiredString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.substring(1, sb.length() -1);
    }
}
