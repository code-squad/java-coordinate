package coordinate.view;

import coordinate.util.StringHandler;

import java.util.Scanner;

public class InputView {

    private static Scanner sc = new Scanner(System.in);

    public static String[] getCoordinate(){
        String text = StringHandler.trimString(inputText());
        return StringHandler.splitHyphen(text);
    }

    public static String inputText(){
        return sc.next();
    }





}
