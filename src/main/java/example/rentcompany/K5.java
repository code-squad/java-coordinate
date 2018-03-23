package example.rentcompany;

public class K5 extends Car {
    public K5() {
        this(0);
    }

    public K5(int amountOfFuel) {
        super(amountOfFuel, 13);
    }

    @Override
    public String getName() {
        return "K5";
    }
}
