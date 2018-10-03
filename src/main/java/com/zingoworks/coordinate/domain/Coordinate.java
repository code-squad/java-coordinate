package com.zingoworks.coordinate.domain;

import com.zingoworks.coordinate.view.InputView;

import java.util.ArrayList;

public class Coordinate {

    private ArrayList<StringBuilder> coordinate = new ArrayList<>();

    public Coordinate(String[] str) {
        setDefaultSize(str);
        deleteUnnecessaryChar(str);
    }

    public ArrayList<StringBuilder> getVerifiedCoordinates(Coordinate cg) {
        return verifyCoordinatesLimit(cg).coordinate;
    }

    private Coordinate verifyCoordinatesLimit(Coordinate cg) {
        for (int i = 0; i < coordinate.size(); i++) {
            Point eachCoord = new Point(coordinate.get(i));
            if (eachCoord.alertMaxLimit(eachCoord)) {
                return new Coordinate(InputView.inputCoordinate());
            }
        }
        return cg;
    }

    private void setDefaultSize(String[] str) {
        for (int i = 0; i < str.length; i++) {
            coordinate.add(new StringBuilder().append(str[i]));
        }
    }

    private void deleteUnnecessaryChar(String[] str) {
        for (int i = 0; i < str.length; i++) {
            coordinate.get(i).deleteCharAt(0);
            coordinate.get(i).deleteCharAt(coordinate.get(i).length() - 1);
        }
    }
}