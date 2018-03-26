package saru.domain;

import saru.view.Result;

import java.util.*;

// Calc?
public class CoordinateCalc {
    private static final int MAX_VALUE = 25;
    private static final int POINT_ONE = 1;
    private static final int POINT_TWO = 2;
    private static final int POINT_THREE = 3;
    private static final int POINT_FOUR = 4;

    public enum SHAPE_TYPE {
        POINT,
        LINE,
        TRIANGLE,
        SQUARE,
        NONE
    }

    private List<RowLine> rowLines = new ArrayList<>();

    private Set<Point> userInput;

    public SHAPE_TYPE checkShapeType(Set<Point> userInput) {
        switch (userInput.size()) {
            case POINT_ONE:
                return SHAPE_TYPE.POINT;
            case POINT_TWO:
                return SHAPE_TYPE.LINE;
            case POINT_THREE:
                return SHAPE_TYPE.TRIANGLE;
            case POINT_FOUR:
                return SHAPE_TYPE.SQUARE;
            default:
                throw new IllegalArgumentException();
        }
    }

    public CoordinateCalc(Set<Point> userInput) {
        this.userInput = userInput;
        initRowLines();
    }

    private void initRowLines() {
        // lines 초기화
        for (int i = 0; i < MAX_VALUE; i++) {
            this.rowLines.add(RowLine.init(MAX_VALUE, i));
        }
    }

    public Result calcProc() {
        switch (checkShapeType(userInput)) {
            case LINE:
                return new Result(SHAPE_TYPE.LINE, new Line(userInput).calcLineLength());
            case SQUARE:
                return new Result(SHAPE_TYPE.SQUARE, new Square(userInput).area());
            case TRIANGLE:
                return new Result(SHAPE_TYPE.TRIANGLE, new Triangle(userInput).area());
        }
        throw new IllegalArgumentException();
    }

    public List<RowLine> getRowLines() {
        return rowLines;
    }

    public void userInputDrawProc() {
        // userInput 돌면서 그리기
        for (Point point : userInput) {
            drawPoint(point);
        }
    }

    public void drawPoint(Point point) {
        // y에 해당하는 라인을 찾는다
        int toFindY = (int) ((MAX_VALUE - 1) - point.getY());
        RowLine foundRowLine = getYLine(toFindY);

        // 라인에서 x를 가진 Point 찾는다
        int toFindX = (int) point.getX();
        Point foundPoint = foundRowLine.getSameXPointFor(toFindX);

        // 찾은 라인의 x에 해당하는 포인터에 메시지 전달
        foundPoint.draw();
    }

    public Set<Point> getUserInput() {
        return userInput;
    }

    private RowLine getYLine(int y) {
        return rowLines.get(y);
    }
}