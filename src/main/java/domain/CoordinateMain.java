package domain;

import view.InputView;
import view.ResultView;

import java.util.ArrayList;

public class CoordinateMain {
    public static void main(String[] args) {
        Boolean validation = true;
        while(validation) {
            PointList.makePoints(InputView.getCoordinates());
            validation = Validation.checkValidation(LineList.lines);
            if (validation) {
                System.out.println("입력 범위를 초과하였습니다. 0~24");
            }
        }
        Shape shape = ShapeFactory.getInstance(PointList.getPoints());
        ResultView.printPoints(PointList.getPoints());
        ResultView.printCalculation(shape);
    }
}
