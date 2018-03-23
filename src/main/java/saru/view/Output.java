package saru.view;

import saru.domain.*;

import java.util.*;

public class Output {

    public static final String LENGTH_TWO_POINT = "두 점 사이 거리는 ";
    public static final int MAX_VALUE = 25;
    private static final int EVEN = 2;

    private List<RowLine> rowLines;

    public Output(List<RowLine> rowLines) {
        this.rowLines = rowLines;
    }

    public void printVerticalAxis() {
        // 한줄씩 출력
        for (int i = 0; i < MAX_VALUE; i++) {
            // 수평 출력
            printRowLine(i);
            System.out.println();
        }
    }

    // 인덴트 2
    private void printRowLine(int row) {
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

    private boolean printDot(Point point) {
        if (point.isExist()) {
            System.out.printf("%-2s", ".");
            return true;
        }
        return false;
    }

    // 라인수
    private void printSymbol(int row, int column) {
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

    public void printHorizontalAxis() {
        printHorizontalNum();
    }

    private void printHorizontalNum() {
        List<Integer> genList = generate(0, MAX_VALUE);
        System.out.print("  ");
        for (int i : genList) {
            System.out.printf("%-4d", i);
        }
        System.out.println();
    }

    private void insertNum(List<Integer> resultList, int i) {
        if (i % EVEN == 0) {
            resultList.add(i);
        }
    }

    public List<String> generateReverse() {
        List<String> resultList = Arrays.asList("24", "  ", "22", "  ", "20",
                "  ", "18", "  ", "16", "  ", "14", "  ", "12", "  ", "10",
                "  ", " 8", "  ", " 6", "  ", " 4", "  ", " 2", "  ", "  ");
        return resultList;
    }

    public List<Integer> generate(int start, int end) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            insertNum(resultList, i);
        }
        return resultList;
    }
}