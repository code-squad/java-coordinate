package saru.view;

import saru.domain.*;

import java.util.*;

// SonarLint StandOutput warning 방지용
@java.lang.SuppressWarnings("squid:S106")
public class Output {
    private static final int MAX_VALUE = 25;
    private static final int EVEN = 2;
    private static final String OUTPUT_ERROR = "계산 결과 도형이 성립되지 않습니다. 다시입력하세요.";

    private static List<RowLine> rowLines;

    private Output() {
        // empty
    }

    public static void initOutput(CoordinateCalc coordinateCalc) {
        rowLines = coordinateCalc.getRowLines();

        printVerticalAxis();
        printHorizontalAxis();

        printCalcResult(coordinateCalc);
    }

    private static void printCalcResult(CoordinateCalc coordinateCalc) {
        // TODO 출력할때 객체 리턴?
        try {
            System.out.print(coordinateCalc.calcProc());
        } catch (IllegalArgumentException e) {
            System.out.println(OUTPUT_ERROR);
            throw new IllegalArgumentException();
        }
    }

    private static void printVerticalAxis() {
        // 한줄씩 출력
        for (int i = 0; i < MAX_VALUE; i++) {
            // 수평 출력
            printRowLine(i);

            System.out.println();
        }
    }

    // 인덴트 2
    private static void printRowLine(int row) {
        RowLine rowLine = rowLines.get(row);

        // 하나씩 출력
        List<Point> points = rowLine.getPoints();
        List<String> verticalNum = generateReverse();

        for (int j = 0; j < points.size(); j++) {
            Point point = points.get(j);
            if (printDot(point)) {
                continue;
            }

            if (j == 0) {
                System.out.print(verticalNum.get(row));
            }

            printSymbol(row, j);
        }
    }

    private static boolean printDot(Point point) {
        if (point.isExist()) {
            System.out.printf("%-2s", ".");
            return true;
        }
        return false;
    }

    // 라인수
    private static void printSymbol(int row, int column) {
        if (row == (MAX_VALUE - 1) && column == 0) {
            System.out.printf("%-2s", "+");
            return;
        }

        if (column == 0) {
            System.out.printf("%-2s", "|");
            return;
        }

        if (row == (MAX_VALUE - 1)) {
            System.out.printf("%-2s", "-");
            return;
        }

        System.out.printf("%-2s", " ");
    }

    private static void printHorizontalAxis() {
        printHorizontalNum();
    }

    private static void printHorizontalNum() {
        List<Integer> genList = generate(0, MAX_VALUE);
        System.out.print("  ");
        for (int i : genList) {
            System.out.printf("%-4d", i);
        }
        System.out.println();
    }

    private static void insertNum(List<Integer> resultList, int i) {
        if (i % EVEN == 0) {
            resultList.add(i);
        }
    }

    private static List<String> generateReverse() {
        return Arrays.asList("24", "  ", "22", "  ", "20",
                "  ", "18", "  ", "16", "  ", "14", "  ", "12", "  ", "10",
                "  ", " 8", "  ", " 6", "  ", " 4", "  ", " 2", "  ", "  ");
    }

    private static List<Integer> generate(int start, int end) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            insertNum(resultList, i);
        }
        return resultList;
    }
}