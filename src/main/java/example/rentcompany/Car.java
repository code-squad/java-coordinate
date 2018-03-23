package example.rentcompany;

public abstract class Car {
    private int amountOfFuel;
    private int fuelEfficiency;

    Car(int amountOfFuel, int fuelEfficiency) {
        this.amountOfFuel = amountOfFuel;
        this.fuelEfficiency = fuelEfficiency;
    }

    public int fuelEfficiency() {
        return fuelEfficiency;
    }

    public abstract String getName();
}
