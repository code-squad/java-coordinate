package saru;

import saru.domain.*;
import saru.view.*;

public class CoordinateMain {
    public static void main(String[] args) {
        // 사용자 문자열 입력 (10,10)-(14,15)
        CoordinateCalc coordinateCalc = new CoordinateCalc(Input.getUserInput());
        coordinateCalc.userInputDrawProc();

        // 결과 출력
        Output.initOutput(coordinateCalc);
    }
}