package com.zingoworks.coordinate.domain;

import java.util.ArrayList;

import static com.zingoworks.coordinate.CoordinateMain.LENGTH_X;
import static com.zingoworks.coordinate.CoordinateMain.LENGTH_Y;

public class CoordinatePlane {
    private static final char MARKER = '·';

    private ArrayList<StringBuilder> plane;

    public CoordinatePlane(ArrayList<Point> point) {
        this.plane = pointMark(blankPlane(), point);
    }

    public ArrayList<StringBuilder> getPlane() {
        return plane;
    }

    private ArrayList<StringBuilder> blankPlane() {
        ArrayList<StringBuilder> sb = new ArrayList<>();
        for (int i = 0; i < LENGTH_Y; i++) {
            makeBlankPlaneByLengthOfX(sb, i);
        }
        return sb;
    }

    private void makeBlankPlaneByLengthOfX(ArrayList<StringBuilder> sb, int i) {
        for (int j = 0; j < LENGTH_X * 2; j++) {
            sb.add(new StringBuilder());
            sb.get(i).append(" ");
        }
    }

    private ArrayList<StringBuilder> pointMark(ArrayList<StringBuilder> blankPlane, ArrayList<Point> point) {
        for (int i = 0; i < point.size(); i++) {
            blankPlane.get(point.get(i).getY() - 1).setCharAt(point.get(i).getX() * 2 - 1, MARKER);
        }
        return blankPlane;
    }
}
