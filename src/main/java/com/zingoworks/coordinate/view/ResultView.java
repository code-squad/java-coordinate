package com.zingoworks.coordinate.view;

import com.zingoworks.coordinate.domain.Coordinate;
import com.zingoworks.coordinate.domain.Line;
import com.zingoworks.coordinate.domain.Square;

import static com.zingoworks.coordinate.CoordinateMain.LENGTH_X;
import static com.zingoworks.coordinate.CoordinateMain.LENGTH_Y;
import static com.zingoworks.coordinate.utils.StringBuilderUtils.convertLengthToForm;

public class ResultView {
    private static final String VERTICAL = "│";
    private static final String HORIZON = "──";
    private static final String PLUS_SIGN= "+";
    private static final int MAX_NUMBER_OF_DIGITS = 2;
    private static final StringBuilder BLANK = new StringBuilder (" ");

    public static void print(Coordinate coordinate) {
        printYandCoordinate(coordinate);
        printX();
        if (coordinate.getPoint().size() == 2) {
            printDistance(new Line(coordinate.getPoint()));
        }
        if (coordinate.getPoint().size() == 4) {
            printArea(new Square(coordinate.getPoint()));
        }
    }

    private static void printDistance(Line line) {
        System.out.println("두 점 사이의 거리는 " + line.getDistanceOfLine() + "입니다.");
    }

    private static void printArea(Square square) {
        System.out.println("사각형의 넓이는 " + square.getAreaOfSquare() + "입니다.");
    }

    private static void printYandCoordinate(Coordinate coord) {
        for (int i = LENGTH_Y; i > 0 ; i--) {
            printEvenNumberOfY(i);
            System.out.print(VERTICAL);
            System.out.print(coord.getMarkingPoint().get(i - 1).toString());
            System.out.println("");
        }
    }

    private static void printEvenNumberOfY(int i) {
        if (isEven(i)) {
            StringBuilder yCoordinate = new StringBuilder(String.valueOf(i));
            System.out.print(convertLengthToForm(yCoordinate, MAX_NUMBER_OF_DIGITS));
            return;
        }
        System.out.print(convertLengthToForm(BLANK, MAX_NUMBER_OF_DIGITS));
    }

    private static void printX() {
        printLineOfX();
        System.out.println("");
        System.out.print(" ");
        printNumberLineOfX();
        System.out.println("");
    }

    private static void printLineOfX() {
        System.out.print(convertLengthToForm(BLANK, MAX_NUMBER_OF_DIGITS) + PLUS_SIGN);
        for (int i = 1; i <= LENGTH_X; i++) {
            System.out.print(HORIZON);
        }
    }

    private static void printNumberLineOfX() {
        for (int i = 0; i <= LENGTH_X; i++) {
            printEvenNumberOfX(i);
        }
    }

    private static void printEvenNumberOfX(int i) {
        if (isEven(i)) {
            StringBuilder xCoordinate = new StringBuilder(String.valueOf(i));
            System.out.print(convertLengthToForm(xCoordinate, MAX_NUMBER_OF_DIGITS));
            return;
        }
        System.out.print("  ");
    }

    private static boolean isEven (int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}