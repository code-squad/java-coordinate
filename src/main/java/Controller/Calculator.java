package Controller;

import Model.Board;

import java.util.ArrayList;
import java.util.Arrays;

public class Calculator {

    private Board board = Board.of();

    public void initPoints(){
        ArrayList<String> coordinatePairs;
        coordinatePairs = checkReturnCoordinates();
        for (String coordinatePair : coordinatePairs) {
            String[] pair = coordinatePair.split(",");
            board.setPoint(Integer.parseInt(pair[0]), Integer.parseInt(pair[1]));
        }
    }

    private ArrayList<String> checkReturnCoordinates() {
        return new ArrayList<>(Arrays.asList("0,0", "1,2", "2,2", "10,6"));
    }

    public void calculate(){ }

    public Board getBoard() {
        return board;
    }
}
