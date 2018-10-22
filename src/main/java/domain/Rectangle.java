package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rectangle {
    static final int ZERO = 0;
    static final int ONE = 1;
    static final int FOUR = 4;

    private List<Point> points;

    public Rectangle(List<Point> points) {
        this.points = points;
    }

    public void area() {
        int xCnt = 0;
        int yCnt = 0;
        int check = 0;
        for (int i = 0; i < points.size(); i++) {
            check += cntPointCoordinateValue(xCnt, yCnt, i);
        }
        checkRectangle(check);
    }

    public int cntPointCoordinateValue(int xCnt, int yCnt, int i) {
        for (int j = 0; j < points.size(); j++) {
            if (points.get(i).subtractXPoint(points.get(j)) == ZERO) {
                xCnt++;
            }
            if (points.get(i).subtractYPoint(points.get(j)) == ZERO) {
                yCnt++;
            }
        }
        if (xCnt == 2 && yCnt == 2) {
            return ONE;
        }
        return ZERO;
    }

    public void checkRectangle(int check) {
        if (check == FOUR) {
            System.out.println("사각형의 넓이는 " + calculateArea());
            return;
        }
        System.out.println("사각형이 아닙니다");
    }

    public int calculateArea() {
        List<Double> length = new ArrayList<>();
        for (int i = 0; i < points.size() - 1; i++) {
            length.add(points.get(i).calculateLength(points.get(i + 1)));
        }
        Collections.sort(length);
        return (int) (length.get(ZERO) * length.get(ONE));
    }


//    static final int FOUR = 4;
//    static final int THREE = 3;
//    static final int TWO = 2;
//    static final int ONE = 1;
//    static final int ZERO = 0;
//
//    private List<Point> threePoints = new ArrayList<>();
//    private List<Point> twoPoints = new ArrayList<>();
//    private List<Point> points;
//    private int rightAngleNum = 0;
//    private int area;
//
//    public Rectangle(List<Point> points) {
//        this.points = points;
//    }
//
//    //포인트 3개 선택
//    public void chooseThreePoint(int cnt, int pointIndex, boolean checkPoint[]) {
//        if (cnt == THREE) {
//            boolean checkPoint2[] = new boolean[THREE];
//            List<Double> threeLengths = new ArrayList<>();
//            findThreePointsLength(0, 0, checkPoint2, threeLengths);   //3개의 포인트 길이 구하기
//            checkRightTriangle(threeLengths);   //하나의 삼각형에 대해 직각삼각형이 맞는지 체크
//            threeLengths.clear();   //
//            return;
//        }
//        selectOnePoint(cnt, pointIndex, checkPoint);
//    }
//
//    //포인트 하나씩 선택
//    public void selectOnePoint(int cnt, int pointIndex, boolean checkPoint[]) {
//        for (int i = pointIndex; i < FOUR; i++) {
//            if (!checkPoint[i]) {
//                checkPoint[i] = true;
//                threePoints.add(points.get(i));
//                chooseThreePoint(cnt + 1, i, checkPoint);
//                checkPoint[i] = false;
//                threePoints.remove(threePoints.size() - 1);
//            }
//        }
//    }
//
//    //포인트 3개의 각 길이 구하기
//    public void findThreePointsLength(int cnt, int pointIndex, boolean checkPoint2[], List<Double> threeLengths) {
//        if (cnt == TWO) {
//            threeLengths.add(new Line().getSquareLength(twoPoints));
//            return;
//        }
//        selectOnePoint2(cnt, pointIndex, checkPoint2, threeLengths);
//    }
//
//    //포인트 하나씩 선택하기
//    public void selectOnePoint2(int cnt, int pointIndex, boolean checkPoint2[], List<Double> threeLengths) {
//        for (int i = pointIndex; i < THREE; i++) {
//            if (!checkPoint2[i]) {
//                checkPoint2[i] = true;
//                twoPoints.add(threePoints.get(i));
//                findThreePointsLength(cnt + 1, i, checkPoint2, threeLengths);
//                checkPoint2[i] = false;
//                twoPoints.remove(twoPoints.size() - 1);
//            }
//        }
//    }
//
//    //피타고라스 성립 체크
//    public void checkRightTriangle(List<Double> threeLengths) {
//        Collections.sort(threeLengths);
//        if (threeLengths.get(ZERO) > 0 && threeLengths.get(ZERO) + threeLengths.get(ONE) == threeLengths.get(TWO)) {
//            rightAngleNum++;
//        }
//        area = (int) (Math.sqrt(threeLengths.get(ZERO)) * Math.sqrt(threeLengths.get(ONE)));
//    }
//
//    //직사각형 판단
//    public void checkRectangle() {
//        boolean checkPoint[] = new boolean[FOUR];
//        chooseThreePoint(0, 0, checkPoint);
//        if (rightAngleNum == FOUR) {        //4개의 부분 직각삼각형이 성립되면 넓이 구하기
//            System.out.println("사각형의 넓이는 " + area);
//            return;
//        }
//        System.out.println("사각형이 아닙니다");
//    }
}