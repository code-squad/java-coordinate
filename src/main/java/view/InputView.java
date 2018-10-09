package view;

import java.util.Scanner;

public class InputView {
    private static Scanner scan = new Scanner(System.in);

    private InputView() {
    }

    public static String getUserInput() {
        System.out.println("좌표를 입력하세요.");
        return scan.next();
    }
}
