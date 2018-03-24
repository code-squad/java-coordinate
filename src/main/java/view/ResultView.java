package view;

import domain.Line;
import domain.Point;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class ResultView {
    static final int MAX = 24;

    public static void printPoints(HashMap<Integer, LinkedList<Integer>> pointsList) {
        for (int i = MAX; i >= 1; i--) {
            printYAxis(i);
            marks(pointsList, i);
            System.out.println();
        }
        printXAxis();
    }

    private static void marks(HashMap<Integer, LinkedList<Integer>> pointsList, int index) {
        if (pointsList.get(index) != null) {
            printXAxisValues(pointsList.get(index));
        }
    }

    private static void printYAxis(int index) {
        // return 값이 있으면 굳이 다음 if문을 안 써도 되는데, 이런 경우는 어떻게 처리해야?
        if (index % 2 == 0) {
            System.out.print(String.format("%-2s" + "|", index));
        }
        if (index % 2 == 1) {
            System.out.print(String.format("%-2s" + "|", "  "));
        }
    }

    public static void printXAxisValues(LinkedList<Integer> xList) {
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

    public static void printCalculation(ArrayList<Point> points) {
        if(points.size() == 2) {
            Line line = new Line(points.get(0), points.get(1));
            System.out.println("\n두 점 사이 거리는 " + line.getDistance());
        }
    }
}