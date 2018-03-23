package saru;

import saru.domain.*;
import saru.view.*;

import static saru.view.Output.LENGTH_TWO_POINT;

public class CoordinateMain {
    public static void main(String[] args) {
        // 사용자 문자열 입력 (10,10)-(14,15)
        Input userInput = new Input();

        // Calc에 input을 생성자로 넘긴다
        CoordinateCalc coordinateCalc = new CoordinateCalc(userInput.getUserInput());

        Output output = new Output(coordinateCalc.getRowLines());
        output.printVerticalAxis();
        output.printHorizontalAxis();

        System.out.print(LENGTH_TWO_POINT);
        System.out.println(coordinateCalc.calcProc());
    }
}