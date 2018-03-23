package example.rentcompany;

public class Sonata extends Car {

    public Sonata() {
        this(0);
    }

    public Sonata(int amountOfFuel) {
        super(amountOfFuel, 10);
    }

    @Override
    public String getName() {
        return "Sonata";
    }
}
