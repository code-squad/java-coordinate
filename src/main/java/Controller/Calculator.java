package Controller;

import Model.Board;
import Model.Figure;
import View.InputView;
import java.util.ArrayList;

public class Calculator {

    private static Board board = Board.of();
    private static Figure figure = new Figure();

    public void initPoints() {
        ArrayList<String> coordinates;
        try {
            System.out.println("Input coordinates. ex. (1,2)-(3,4)-(5,1)");
            coordinates = Utils.checkReturnCoordinates(InputView.initCoordinate());
            figure.setCoordinates(coordinates);
            board.setFigure(figure);
        } catch (RuntimeException e) {
            initPoints();
        }
    }

    public void calculate(){
        figure.calculateArea();
    }

    public Board getBoard() {
        return board;
    }
}
