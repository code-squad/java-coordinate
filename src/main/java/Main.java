import domain.Points;

import util.Calculator;
import view.InputView;
import view.ResultView;

public class Main {

    public static void main(String[] args) {
        Points userPoints = Points.init(InputView.inputPoints());

        ResultView.drawGraph(userPoints);
        System.out.println(Calculator.calc(userPoints));
    }

}
