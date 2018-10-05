import domain.Points;

import view.InputView;
import view.ResultView;

public class Main {

    public static void main(String[] args) {
        Points userPoints = Points.init(InputView.inputPoints());

        ResultView.drawGraph(userPoints);
        ResultView.printDistance(userPoints.calc());
    }

}
