package com.zingoworks.coordinate.domain;

import java.util.ArrayList;
import java.util.List;

import static com.zingoworks.coordinate.CoordinateMain.LENGTH_X;
import static com.zingoworks.coordinate.CoordinateMain.LENGTH_Y;

public class CoordinatePlane {
    private static final char MARKER = '·';
    private List<StringBuilder> plane;

    public CoordinatePlane(List<Point> point) {
        this.plane = pointMark(blankPlane(), point);
    }

    public List<StringBuilder> getPlane() {
        return plane;
    }

    private List<StringBuilder> blankPlane() {
        List<StringBuilder> sb = new ArrayList<>();
        for (int i = 0; i < LENGTH_Y; i++) {
            makeBlankPlaneByLengthOfX(sb, i);
        }
        return sb;
    }

    private void makeBlankPlaneByLengthOfX(List<StringBuilder> sb, int i) {
        for (int j = 0; j < LENGTH_X * 2; j++) {
            sb.add(new StringBuilder());
            sb.get(i).append(" ");
        }
    }

    private List<StringBuilder> pointMark(List<StringBuilder> blankPlane, List<Point> point) {
        for (int i = 0; i < point.size(); i++) {
            blankPlane.get(point.get(i).getY() - 1).setCharAt(point.get(i).getX() * 2 - 1, MARKER);
        }
        return blankPlane;
    }
}
