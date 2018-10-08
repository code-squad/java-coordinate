import domain.Figure;
import view.InputView;
import view.ResultView;

public class Main {

    public static void main(String[] args) {
        Figure userPoints = Figure.init(InputView.inputPoints());

        System.out.println(ResultView.drawGraph(userPoints));
        System.out.println(ResultView.getFigureArea(userPoints));
    }

}
