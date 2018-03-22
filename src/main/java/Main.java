import Domain.Figure;
import View.ResultView;

public class Main {
    public static void main(String[] args) {
        Figure figure = Figure.of();
        figure.initPoints();
        figure.calculate();
        ResultView.printBoard(figure);
        ResultView.printCalculationResult(figure);
    }
}