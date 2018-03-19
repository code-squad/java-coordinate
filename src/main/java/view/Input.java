package view;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static String getCoordinate(String printMessage) {
        Viewer.viewMessage(printMessage);
        String coordinateSources = scanner.nextLine();

        /*
        파싱해서 어디에 저장하고 리턴하기
        1) 일단 "-"로 쪼갬
        2) X,Y를 잘라서 어디에 저장함
        3) Points에 저장해서 리턴하기

        String target = "(10,10)-(14,15)";
        String[] targetSplit1 = target.split("-");
        for(String str : targetSplit1) {
            str = str.replace("(", "");
            str = str.replace(")", "");
            String[] targetSplit = str.split(",");
            for(String str2 : targetSplit) {
                System.out.println(str2);
            }
        }
         */

        return null;
    }
}
