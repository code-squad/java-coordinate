package saru.domain;

import java.util.*;

import static saru.view.Output.MAX_VALUE;

// Calc?
public class CoordinateCalc {
    private List<Line> lines = new ArrayList<>();

    public void InitLines() {
        // TODO 입력
        int rowNum = MAX_VALUE;
        int columnNum = MAX_VALUE;

        // TODO lines 초기화
        for (int i = 0; i < rowNum; i++) {
            this.lines.add(Line.init(columnNum, i));
        }
    }

    public void drawPoint(int x, int y) {
        // TODO y에 해당하는 라인을 찾는다
        Line foundLine = getYLine((MAX_VALUE - 1) - y);

        // TODO 라인에서 x를 가진 Point 찾는다
        Point foundPoint = foundLine.getSameXPointFor(x);

        // TODO 찾은 라인의 x에 해당하는 포인터에 메시지 전달
        foundPoint.draw();
    }

    public double calcLine(Point startPoint, Point endPoint) {
        double powX = Math.pow(startPoint.getX() - endPoint.getX(), 2);
        double powY = Math.pow(startPoint.getY() - endPoint.getY(), 2);
        return Math.sqrt(powX + powY);
    }

    public List<Line> getLines() {
        return lines;
    }

    private Line getYLine(int y) {
        return lines.get(y);
    }
}