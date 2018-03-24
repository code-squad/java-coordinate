package saru.domain;

import java.util.*;

// Calc?
public class CoordinateCalc {
    private static final int MAX_VALUE = 25;
    private static final int FIRST_INDEX = 0;
    private static final int SECOND_INDEX = 1;

    private List<RowLine> rowLines = new ArrayList<>();
    private List<Point> userInput;

    public CoordinateCalc(List<Point> userInput) {
        this.userInput = userInput;
        initRowLines();
    }

    private void initRowLines() {
        // lines 초기화
        for (int i = 0; i < MAX_VALUE; i++) {
            this.rowLines.add(RowLine.init(MAX_VALUE, i));
        }

        // 하나씩 빼서 해당 위치에 draw
//        userInputDrawProc();
    }

    public double calcProc() {
        // TODO 직선인 경우 거리계산
        return userInput.get(FIRST_INDEX).calcLengthWith(userInput.get(SECOND_INDEX));
    }

    public List<RowLine> getRowLines() {
        return rowLines;
    }

    public void userInputDrawProc() {
        // userInput 돌면서 그리기

        // TODO 에러

        for (int i = 0; i < userInput.size(); i++) {
            drawPoint(userInput.get(i));
        }

//        for (Point point : userInput) {
//            drawPoint(point);
//        }
    }

    public void drawPoint(Point point) {
        // y에 해당하는 라인을 찾는다
        int toFindY = (int)((MAX_VALUE - 1) - point.getY());
        RowLine foundRowLine = getYLine(toFindY);

        // 라인에서 x를 가진 Point 찾는다
        int toFindX = (int)point.getX();
        Point foundPoint = foundRowLine.getSameXPointFor(toFindX);

        // 찾은 라인의 x에 해당하는 포인터에 메시지 전달
        foundPoint.draw();
    }

    private RowLine getYLine(int y) {
        return rowLines.get(y);
    }
}