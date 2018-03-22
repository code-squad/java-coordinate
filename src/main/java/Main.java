import Domain.Figure;
import View.ResultView;

public class Main {
    public static void main(String[] args) {
        Figure figure = Figure.of();
        figure.initPoints();
        figure.calculateLine();
        ResultView.printBoard(figure);
        ResultView.printCalculationResult(figure);
    }
}