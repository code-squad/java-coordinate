package coordinate.controller;

import coordinate.domain.Movement;
import coordinate.view.ResultView;

public class CoordinateMain {

    public static void main(String[] args) {
        Movement m = new Movement();

        ResultView.height(m.axis());
        ResultView.width(m.axis());
    }
}
