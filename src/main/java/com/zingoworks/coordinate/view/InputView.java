package com.zingoworks.coordinate.view;

import java.util.Scanner;

public class InputView {
    private static final String HYPHEN = "-";

    public static String[] inputCoordinate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("좌표를 입력하세요.");
        return sc.nextLine().split(HYPHEN);
    }
}