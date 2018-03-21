import Controller.Calculator;
import View.ResultView;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.initPoints(); // "0,0", "1,1", "1,2", "2,2"
//        calculator.calculateArea();
        ResultView.printBoard(calculator);
//        ResultView.printCalculationResult(calculator);
    }
}