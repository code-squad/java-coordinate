package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rectangle {
    static final int FOUR = 4;
    static final int THREE = 3;
    static final int TWO = 2;
    static final int ONE = 1;
    static final int ZERO = 0;

    private List<Point> threePoints = new ArrayList<>();
    private List<Point> twoPoints = new ArrayList<>();
    private List<Point> points;
    private boolean checkPoint[] = new boolean[FOUR];
    private boolean checkPoint2[] = new boolean[THREE];
    private List<Double> threeLengths = new ArrayList<>();
    private int rightAngleNum = 0;
    private int area;

    public Rectangle(List<Point> points) {
        this.points = points;
    }

    //포인트 3개 선택
    public void chooseThreePoint(int cnt, int pointIndex) {
        if (cnt == THREE) {
            findThreePointsLength(0, 0);
            checkRightTriangle();
            threeLengths.clear();
            return;
        }
        selectOnePoint(cnt,pointIndex);
    }

    //포인트 하나씩 선택
    public void selectOnePoint(int cnt, int pointIndex){
        for (int i = pointIndex; i < FOUR; i++) {
            if (!checkPoint[i]) {
                checkPoint[i] = true;
                threePoints.add(points.get(i));
                chooseThreePoint(cnt + 1, i);
                checkPoint[i] = false;
                threePoints.remove(threePoints.size() - 1);
            }
        }
    }

    //포인트 3개의 각 길이 구하기
    public void findThreePointsLength(int cnt, int pointIndex) {
        if (cnt == TWO) {
            threeLengths.add(new Line().getSquareLength(twoPoints));
            return;
        }
        selectOnePoint2(cnt, pointIndex);
    }

    //포인트 하나씩 선택하기
    public void selectOnePoint2(int cnt, int pointIndex){
        for (int i = pointIndex; i < THREE; i++) {
            if (!checkPoint2[i]) {
                checkPoint2[i] = true;
                twoPoints.add(threePoints.get(i));
                findThreePointsLength(cnt + 1, i);
                checkPoint2[i] = false;
                twoPoints.remove(twoPoints.size() - 1);
            }
        }
    }

    //피타고라스 성립 체크
    public void checkRightTriangle() {
        Collections.sort(threeLengths);
        if (threeLengths.get(ZERO) > 0 && threeLengths.get(ZERO) + threeLengths.get(ONE) == threeLengths.get(TWO)) {
            rightAngleNum++;
        }
        area = (int) (Math.sqrt(threeLengths.get(ZERO)) * Math.sqrt(threeLengths.get(ONE)));
    }

    //직사각형 판단
    public void checkRectangle() {
        chooseThreePoint(0, 0);
        if (rightAngleNum == FOUR) {        //4개의 부분 직각삼각형이 성립되면 넓이 구하기
            System.out.println("사각형의 넓이는 " + area);
            return;
        }
        System.out.println("사각형이 아닙니다");
    }
}
