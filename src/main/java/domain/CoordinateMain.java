package domain;

import view.InputView;
import view.ResultView;

public class CoordinateMain {
    public static void main(String[] args) {
        Boolean validation = true;
        while(validation) {
            PointList.makePoints(InputView.getCoordinates());
            validation = PointList.hasNull();
            if (validation) {
                System.out.println("입력 범위를 초과하였습니다. 0~24");
            }
        }
        ResultView.printPoints(PointList.getPoints());
        ResultView.printCalculation(PointList.getPoints());
    }
}
