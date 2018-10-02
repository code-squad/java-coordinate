package com.zingoworks.coordinate.view;

import static com.zingoworks.coordinate.utils.StringBuilderUtils.convertLengthToForm;

public class ResultView {

    private static final String VERTICAL = "│";
    private static final String HORIZON = "──";
    private static final String PLUS_SIGN= "+";
    private static final StringBuilder BLANK = new StringBuilder (" ");
    private static final int MAX_NUMBER_OF_DIGITS = 2;



    public static void print(int lengthOfX, int lengthOfY) {
        printY(lengthOfY);
        printX(lengthOfX);
    }

    private static void printX(int lengthOfX) {
        printLineOfX(lengthOfX);
        System.out.print(" ");
        printNumberOfX(lengthOfX);
    }

    private static void printLineOfX(int lengthOfX) {
        System.out.print(convertLengthToForm(BLANK, MAX_NUMBER_OF_DIGITS) + PLUS_SIGN);
        for (int i = 1; i <= lengthOfX; i++) {
            System.out.print(HORIZON);
        }
        System.out.println("");
    }

    private static void printNumberOfX(int lengthOfX) {
        for (int i = 0; i <= lengthOfX; i++) {
            if (isEven(i)) {
                StringBuilder xCoordinate = new StringBuilder(String.valueOf(i));
                System.out.print(convertLengthToForm(xCoordinate, MAX_NUMBER_OF_DIGITS));
                continue;
            }
            System.out.print("  ");
        }
    }
    private static void printY(int lengthOfY) {
        for (int i = lengthOfY; i > 0 ; i--) {
            if (isEven(i)) {
                StringBuilder yCoordinate = new StringBuilder(String.valueOf(i));
                System.out.println(convertLengthToForm(yCoordinate, MAX_NUMBER_OF_DIGITS) + VERTICAL);
                continue;
            }
            System.out.println(convertLengthToForm(BLANK, MAX_NUMBER_OF_DIGITS) + VERTICAL);
        }
    }

    private static boolean isEven (int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}








