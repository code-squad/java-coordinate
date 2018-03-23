package saru.domain;

import java.util.*;

import static saru.view.Output.MAX_VALUE;

// Calc?
public class CoordinateCalc {
    public CoordinateCalc(List<Point> userInput) {
        this.userInput = userInput;
        initLines();
    }

    private List<Line> lines = new ArrayList<>();
    private List<Point> userInput;

    private void initLines() {
        // lines 초기화
        for (int i = 0; i < MAX_VALUE; i++) {
            this.lines.add(Line.init(MAX_VALUE, i));
        }

        // 하나씩 빼서 해당 위치에 draw
        userInputDrawProc();
    }

    public double calcProc() {
        // TODO 직선인 경우 거리계산
        return calcLine(userInput.get(0), userInput.get(1));
    }

    public List<Line> getLines() {
        return lines;
    }

    private void userInputDrawProc() {
        // userInput 돌면서 그리기
        for (Point point : userInput) {
            drawPoint((int) point.getX(), (int) point.getY());
        }
    }

    private void drawPoint(int x, int y) {
        // y에 해당하는 라인을 찾는다
        Line foundLine = getYLine((MAX_VALUE - 1) - y);

        // 라인에서 x를 가진 Point 찾는다
        Point foundPoint = foundLine.getSameXPointFor(x);

        // 찾은 라인의 x에 해당하는 포인터에 메시지 전달
        foundPoint.draw();
    }

    private double calcLine(Point startPoint, Point endPoint) {
        double powX = Math.pow(startPoint.getX() - endPoint.getX(), 2);
        double powY = Math.pow(startPoint.getY() - endPoint.getY(), 2);
        return Math.sqrt(powX + powY);
    }

    private Line getYLine(int y) {
        return lines.get(y);
    }
}