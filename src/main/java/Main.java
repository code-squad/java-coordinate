import domain.Xaxis;
import domain.Yaxis;
import view.ResultView;

public class Main {
    public static void main(String[] args) {
        ResultView.drawYaxis(new Yaxis());
        ResultView.drawXaxis(new Xaxis());
    }
}
