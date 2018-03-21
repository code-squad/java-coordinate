package Controller;

import Model.Board;
import View.InputView;
import java.util.ArrayList;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Calculator {

    private static Board board = Board.of();
    private static double figureArea;

    public void initPoints() {
        ArrayList<String> coordinatePairs; // point객체에게 위임하면 제거할 수 있을 듯.
        try {
            System.out.println("Input coordinates. ex. (1,2)-(3,4)-(5,1)");
            coordinatePairs = Utils.checkReturnCoordinates(InputView.initCoordinate());
            for (String coordinatePair : coordinatePairs) {
                String[] pair = coordinatePair.split(",");
                board.setPoint(Integer.parseInt(pair[0]), Integer.parseInt(pair[1]));
            }
        } catch (RuntimeException e) {
            initPoints();
        }
    }

    public void calculateArea(){
        figureArea = lineCalculate(board);
    }

    static String drawPoint(int x, int y, Board board){
        try {
            return board.getPoint(x, y).toString();
        } catch (NullPointerException e) {
            return "  ";
        }
    }

    public static double lineCalculate(Board board) {

        double xPowers = 0;
        double yPowers = 0;

        return sqrt(xPowers + yPowers);
    }

    public Board getBoard() {
        return board;
    }

    public double getFigureArea() { return figureArea; }
}
