package saru.domain;

import java.util.ArrayList;
import java.util.List;

public class CoordinateProto {
    private static final int LIMIT = 25;
    public static final String VERTICAL_SYMBOL = "|";
    public static final String ANCHOR_POINT = "+";
    public static final String HORIZONTAL_SYMBOL = "--";
    public static final int EVEN = 2;
    public static final String BLANK = "  ";

    public CoordinateProto() {
        // empty
    }

    public static void main(String[] args) {
        printVerticalAxis(LIMIT);
        printHorizontalAxis(LIMIT);
    }

    private static void printVerticalAxis(int limit) {
        List<Integer> genList = generateReverse(0, limit - 1);
        for (int i : genList) {
            System.out.printf("%2d|\n", i);
            System.out.printf("%3s\n", VERTICAL_SYMBOL);
        }
    }

    private static void printHorizontalAxis(int limit) {
        printHorizontalLine(limit);
        printHorizontalNum(limit);
    }

    private static void printHorizontalNum(int limit) {
        System.out.printf("%2d" + BLANK, 0);

        List<Integer> genList = generate(0, limit - 1);
        for (int i : genList) {
            System.out.printf("%4d", i);
        }
    }

    private static void printHorizontalLine(int limit) {
        System.out.printf("%3s", ANCHOR_POINT);
        for (int i = 0; i < limit; i++) {
            System.out.print(HORIZONTAL_SYMBOL);
        }
        System.out.println();
    }

    private static void insertNum(List<Integer> resultList, int i) {
        if (i % EVEN == 0) {
            resultList.add(i);
        }
    }

    public static List<Integer> generateReverse(int start, int end) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = end; i > start; i--) {
            insertNum(resultList, i);
        }

        return resultList;
    }

    public static List<Integer> generate(int start, int end) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = start + 2; i <= end; i++) {
            insertNum(resultList, i);
        }

        return resultList;
    }
}
