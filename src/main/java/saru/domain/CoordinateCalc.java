package saru.domain;

import java.util.*;

// Calc?
public class CoordinateCalc {
    private static final int MAX_VALUE = 25;
    private static final int POINT_ONE = 1;
    private static final int POINT_TWO = 2;
    private static final int POINT_THREE = 3;
    private static final int POINT_FOUR = 4;


    private List<RowLine> rowLines = new ArrayList<>();

    private Set<Point> userInput;

    // TODO values()를 통해 각 enum을 순회하면서 points.size()에 해당하는 enum을 가져올 수 있다는 의미임..
    // indent 2
    public ShapeType checkShapeType(Set<Point> userInput) {
        for (ShapeType shapeType : ShapeType.values()) {
            if (shapeType.getPointNum() == userInput.size()) {
                return shapeType;
            }
        }

        throw new IllegalArgumentException();
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

    public double calcProc() {
        switch (checkShapeType(userInput)) {
            case LINE:
                return new Line(userInput).calcLineLength();
            case SQUARE:
                return new Square(userInput).area();
            case TRIANGLE:
                return new Triangle(userInput).area();
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