package Controller;

import domain.Figure;
import domain.FigureFactory;
import util.PointException;
import view.InputView;
import view.ResultView;

public class ControllerCoordinate {
    public static void main(String[] args) throws PointException {
        run();
    }

    /* 잘못입력을 했을 때, 처음부터 다시 동작 --> PointerException 클래스를 통해 잘못입력 했을 경우, run()을 실행하도록 코딩 */
    public static void run() throws PointException {
        Figure figure = FigureFactory.create(InputView.getInput());
        ResultView.drawAxis(figure);
        ResultView.printDistance(figure);
    }
}
