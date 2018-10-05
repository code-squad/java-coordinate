package coordinate;

import java.util.ArrayList;

public class ResultView {

    private ArrayList<MyString> coordinate;
    private ArrayList<CoordinateLine> fied;
    public ResultView(ArrayList<MyString> coordinate, ArrayList<CoordinateLine> fied) {
        this.coordinate = coordinate;
        this.fied = fied;
        displayYCoordinate();
        displayXCoordinate();
    }

    private void displayYCoordinate() {
        for (int i = 24; i > 0; i--) {
            System.out.println(this.coordinate.get(i) + "l" + this.fied.get(i));
        }
    }

    private void displayXCoordinate() {
        System.out.println("   +------------------------------------------------------------------------");
        for (MyString myString : this.coordinate) {
            System.out.print(myString);
        }
        System.out.println();
    }

    public void rePlay(int xPoint ,int yPoint) {

        fied.get(yPoint).getCoordinateLine().get(xPoint).toStar();
        displayYCoordinate();
        displayXCoordinate();
    }
}
