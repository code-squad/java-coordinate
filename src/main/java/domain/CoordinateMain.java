package domain;

import view.InputView;
import view.ResultView;

public class CoordinateMain {
    public static void main(String[] args) {
        CoordinateBase coordinateBase;
        Boolean validation = true;
        // todo validation 부분을 따로 빼서 불러오자. 라인 줄이기
        do {
            coordinateBase = new CoordinateBase(InputView.getCoordinates());
            validation = coordinateBase.points.contains(null);
            if (validation) { // todo 2depth
                System.out.println("입력 범위를 초과하였습니다. 0~24");
            }
        } while (validation);
//        ResultView.printCoordinates(coordinateBase.getPoints());
        ResultView.printPoints(coordinateBase.getPointsList(coordinateBase.getPoints()));
    }
}
