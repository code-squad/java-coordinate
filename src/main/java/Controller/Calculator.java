package Controller;

import Model.Board;
import Model.Figure;
import Model.Point;
import View.InputView;
import java.util.ArrayList;

public class Calculator {

    // 실제 포인트 정보는 figure에 있고, board는 빈껍데기처럼 print할때만 빌려 쓴다..?

    private static Board board = Board.of();
    private static Figure figure;

    public void initPoints() {
        ArrayList<String> coordinatePairs;
        try {
            System.out.println("Input coordinates. ex. (1,2)-(3,4)-(5,1)");
            coordinatePairs = Utils.checkReturnCoordinates(InputView.initCoordinate());
            figure.setPoint(coordinatePairs);
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

    public ArrayList<Point> getPoints() {
        return figure.getPoints();
    }
}
