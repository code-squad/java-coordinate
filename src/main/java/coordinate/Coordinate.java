package coordinate;

import java.util.ArrayList;

public class Coordinate {
    private ArrayList<MyString> coordinate;

    public Coordinate() {
        ArrayList<MyString> numCoordinate = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            numCoordinate.add(new MyString(i));
        }
        this.coordinate = numCoordinate;
    }

    public void displayYCoordinate() {
        for (int i = 24; i > 0; i--) {
            System.out.println(this.coordinate.get(i) + "l");
        }
    }

    public void displayXCoordinate() {
        System.out.println("   +-----------------------------------------------------------------------");
        for (MyString myString : this.coordinate) {
            System.out.print(myString);
        }
    }
}
