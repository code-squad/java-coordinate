package domain;

import view.InputView;

public class CoordinateMain {
    public static void main(String[] args) {
        Boolean validation = true;

        do{
            CoordinateBase coordinateBase = new CoordinateBase(InputView.getCoordinates());
            validation = coordinateBase.points.contains(null);
            if(validation) {
                System.out.println("입력 범위를 초과하였습니다. 0~24");
            }
        }while(validation);
        System.out.println("is valid");
        //        ResultView.printCoordinates(coordinateBase);
    }
}
