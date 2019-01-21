package connrdinates.view;

import java.util.Scanner;

public class InputView {

    private static Scanner s = new Scanner(System.in);

    public static String pointInput(){
        System.out.println("좌표를 입력하세요.");
        return s.next();
    }
}
