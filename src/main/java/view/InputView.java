package view;

import java.util.Scanner;

public class InputView {

    public static String getCoordinate() throws RuntimeException{
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
