package view;

import domain.CoordinateBase;
import domain.CoordinateCalculator;
import domain.Line;
import domain.Point;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class ResultView {
    static final int MAX = 24;

    public static void printPoints(HashMap<Integer, LinkedList<Integer>> pointsList) {
        for (int i = MAX; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(String.format("%-2s" + "|", i));
            }
            if ( i % 2 == 1) {
                System.out.print(String.format("%-2s" + "|", "  "));
            }
            if (pointsList.get(i) != null) {
                printX(pointsList.get(i));
            }
            System.out.println();
        }
        printXAxis();
    }

    public static void printX(LinkedList<Integer> xList) {
        int index = 0;
        for (int i = 1; i < MAX; i++) {  // 0부터 돌면 x축의 좌표들이 한 칸씩 밀려난다. (0,0)은 찍히지 않음
            if (i == xList.get(index)) {
                System.out.print(String.format("%2s", "●"));
                continue;
            }
            System.out.print(String.format("%2s", "  "));
        }
    }

    private static void printXAxis() {
        System.out.print("  " + "+");
        for (int i = 0; i < MAX; i++) {
            System.out.print(String.format("%2s", "--")); // dash가 1개이면 x축이 짧아보여서 2개로 변경
        }
        System.out.print("\n" + String.format("%-3s", "0"));
        for (int i = 1; i < 13; i++) {
            System.out.print(String.format("%4s", i * 2));
        }
    }


//    public static void printCoordinates(CoordinateBase coordinateBase) {
//        ArrayList<Line> lines = coordinateBase.getLines();
//        for (int i = MAX; i > 0; i--) {
//            printYAxis(lines, i);
//            System.out.println();
//        }
//        printXAxis();
//    }
//
//    private static void printXAxis() {
//        System.out.print("  " + "+");
//        for (int i = 0; i < MAX; i++) {
//            System.out.print(String.format("%2s", "--")); // dash가 1개이면 x축이 짧아보여서 2개로 변경
//        }
//        System.out.print("\n" + String.format("%-3s", "0"));
//        for (int i = 1; i < 13; i++) {
//            System.out.print(String.format("%4s", i * 2));
//        }
//    }
//
//    private static int printYAxis(ArrayList<Line> lines, int index) {
//        if (index % 2 == 0) {
//            System.out.print(String.format("%-2s" + "|", index));
//            printLine(lines, index);
//            return index;
//        }
//        System.out.print(String.format("%-2s" + "|", "  "));
//        printLine(lines, index);
//        return index;
//    }
//
//    private static void printLine(ArrayList<Line> lines, int index) {
//        index = index - 1;
//        Line line = lines.get(index);
//        if(line != null) {
//            printMark(line);
//        }
//    }
//
//    private static void printMark(Line line) {
//        ArrayList<Boolean> marks = line.getMarks();
//        for (Boolean mark : marks) {  // todo 2depth
//            if(mark) {
//                System.out.print(String.format("%2s", "●"));
//                continue;
//            }
//            System.out.print(String.format("%2s", "  "));
//        }
//    }
//
//    public static void printCalculate(ArrayList<Point> points) {
//        if(points.size() == 2) {
//            Double result = CoordinateCalculator.calculateLength(points);
//            System.out.println("\n두 점 사이의 거리는? \n" + result);
//        }
//    }
}