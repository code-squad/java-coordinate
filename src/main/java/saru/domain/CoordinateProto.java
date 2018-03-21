package saru.domain;

import java.util.ArrayList;
import java.util.List;

public class CoordinateProto {
    private static final int LIMIT = 25;

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
            System.out.printf("%3s\n", "|");
        }
    }

    private static void printHorizontalAxis(int limit) {
        printHorizontalLine(limit);
        printHorizontalNum(limit);
    }

    private static void printHorizontalNum(int limit) {
        System.out.printf("%2d  ", 0);

        List<Integer> genList = generate(0, limit - 1);
        for (int i : genList) {
            System.out.printf("%4d", i);
        }
    }

    private static void printHorizontalLine(int limit) {
        System.out.printf("%3s", "+");
        for (int i = 0; i < limit; i++) {
            System.out.print("--");
        }
        System.out.println();
    }

    private static void insertNum(List<Integer> resultList, int i) {
        if (i % 2 == 0) {
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
