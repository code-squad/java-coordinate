package coordinate.view;

import coordinate.util.StringHandler;

import java.util.Scanner;

public class InputView {

    private static Scanner sc = new Scanner(System.in);

    public static String[] getCoordinate(){
        return StringHandler.splitHyphen(inputText());
    }

    public static String inputText(){
        return sc.next();
    }





}
