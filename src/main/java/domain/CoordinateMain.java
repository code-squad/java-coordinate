package domain;

import view.InputView;
import view.ResultView;

public class CoordinateMain {
    public static void main(String[] args) {
        CoordinateBase coordinateBase;
        Boolean validation = true;
        do {
            coordinateBase = new CoordinateBase(InputView.getCoordinates());
            validation = coordinateBase.hasNull();
            if (validation) { // todo 2depth
                System.out.println("입력 범위를 초과하였습니다. 0~24");
            }
        } while (validation);
        ResultView.printPoints(coordinateBase.getPointsList(coordinateBase.getPoints()));
        ResultView.printCalculation(coordinateBase.getPoints());
    }
}
