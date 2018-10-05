package coordinate;

public class CoordinateMain {
    public static void main(String[] args) {
        Coordinate coordinate = new Coordinate();
        ResultView resultView = new ResultView(coordinate.getCoordinatePanel(), coordinate.getCoordinateField());
        String yesOrNo = "y";
        while (yesOrNo.equals("y")) {
            int xPoint = InputView.inputPoint();
            int yPoint = InputView.inputPoint();
            resultView.rePlay(xPoint, yPoint);
            yesOrNo = InputView.inputString();
        }
    }
}
