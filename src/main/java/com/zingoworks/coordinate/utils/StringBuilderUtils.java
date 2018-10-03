package com.zingoworks.coordinate.utils;

public class StringBuilderUtils {

    private static final String BLANK = " ";

    public static StringBuilder convertLengthToForm(StringBuilder coordinate, int length) {
        while (coordinate.length() < length) {
            coordinate.insert(0, BLANK);
        }
        return coordinate;
    }
}