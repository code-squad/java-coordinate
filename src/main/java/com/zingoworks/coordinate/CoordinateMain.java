package com.zingoworks.coordinate;

import com.zingoworks.coordinate.domain.Coordinate;
import com.zingoworks.coordinate.view.InputView;
import com.zingoworks.coordinate.view.ResultView;

public class CoordinateMain {
    public static final int LENGTH_X = 24;
    public static final int LENGTH_Y = 24;

    public static void main(String[] args) {
        try {
            String[] input = InputView.inputCoordinate();
            ResultView.print(Coordinate.getRefinedPoint(input));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            main(args);
        }
    }
}