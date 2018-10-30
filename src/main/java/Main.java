//import model.Line;

import model.Line;
import model.MakeLine;
import view.InputView;
import view.PrintView;


public class Main {

    public static void main(String[] args) {
        PrintView printView = new PrintView();
        String coordinateNum = InputView.inputCoordinate();
        try {
            Line line = MakeLine.makeLine(coordinateNum);
            printView.printAll(line);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            main(args);
        }
    }
}

//point (x,y)만 담고있는 클래스를 만들기.
//point를 여러개 갖고있는 클래스 만들기