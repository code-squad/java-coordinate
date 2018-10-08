package com.zingoworks.coordinate.domain;

import static com.zingoworks.coordinate.CoordinateMain.LENGTH_X;
import static com.zingoworks.coordinate.utils.StringBuilderUtils.convertLengthToForm;

public class Axis {
    private static final String HORIZON = "──";
    private static final String PLUS_SIGN= "+";
    private static final int MAX_NUMBER_OF_DIGITS = 2;
    private static final StringBuilder BLANK = new StringBuilder (" ");

    public static StringBuilder numberOfAxis(int i) {
        StringBuilder sb = new StringBuilder();
        if (isEven(i)) {
            sb.append(i);
            return convertLengthToForm(sb, MAX_NUMBER_OF_DIGITS);
        }
        return convertLengthToForm(BLANK, MAX_NUMBER_OF_DIGITS);
    }

    public static StringBuilder lineOfAxisX() {
        StringBuilder sb = new StringBuilder();
        sb.append(convertLengthToForm(BLANK, MAX_NUMBER_OF_DIGITS));
        sb.append(PLUS_SIGN);
        for (int i = 0; i < LENGTH_X; i++) {
            sb.append(HORIZON);
        }
        return sb;
    }

    private static boolean isEven (int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
