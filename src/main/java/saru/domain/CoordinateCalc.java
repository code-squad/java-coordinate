package saru.domain;

import java.util.*;

import static saru.view.Output.MAX_VALUE;

// Calc?
public class CoordinateCalc {
    private static final int FIRST_INDEX = 0;
    private static final int SECOND_INDEX = 1;

    public CoordinateCalc(List<Point> userInput) {
        this.userInput = userInput;
        initRowLines();
    }

    private List<RowLine> rowLines = new ArrayList<>();
    private List<Point> userInput;

    private void initRowLines() {
        // lines 초기화
        for (int i = 0; i < MAX_VALUE; i++) {
            this.rowLines.add(RowLine.init(MAX_VALUE, i));
        }

        // 하나씩 빼서 해당 위치에 draw
        userInputDrawProc();
    }

    public double calcProc() {
        // TODO 직선인 경우 거리계산
        return userInput.get(FIRST_INDEX).calcRowLine(userInput.get(SECOND_INDEX));
    }

    public List<RowLine> getRowLines() {
        return rowLines;
    }

    private void userInputDrawProc() {
        // userInput 돌면서 그리기
        for (Point point : userInput) {
            drawPoint((int) point.getX(), (int) point.getY());
        }
    }

    private void drawPoint(int x, int y) {
        // y에 해당하는 라인을 찾는다
        RowLine foundRowLine = getYLine((MAX_VALUE - 1) - y);

        // 라인에서 x를 가진 Point 찾는다
        Point foundPoint = foundRowLine.getSameXPointFor(x);

        // 찾은 라인의 x에 해당하는 포인터에 메시지 전달
        foundPoint.draw();
    }

    private RowLine getYLine(int y) {
        return rowLines.get(y);
    }
}