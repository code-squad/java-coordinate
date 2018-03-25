package saru.domain;

import java.util.*;

// Calc?
public class CoordinateCalc {
    private static final int MAX_VALUE = 25;

    public SHAPE_TYPE checkShapeType(Set<Point> userInput) {
        switch (userInput.size()) {
            case 1:
                return SHAPE_TYPE.POINT;
            case 2:
                return SHAPE_TYPE.LINE;
            default:
                break;
        }

        return SHAPE_TYPE.NONE;
    }

    public enum SHAPE_TYPE {
        POINT,
        LINE,
        NONE
    }

    private List<RowLine> rowLines = new ArrayList<>();

    private Set<Point> userInput;

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

    public Double calcProc() {
        // TODO 직선인 경우 거리계산
        return new Line(userInput).calcLineLength();
    }

    public List<RowLine> getRowLines() {
        return rowLines;
    }

    public void userInputDrawProc() {
        // userInput 돌면서 그리기

        // TODO reflection 에러?
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