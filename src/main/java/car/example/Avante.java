package car.example;

public class Avante extends Car {

    static final int distancePerLiter = 15;

    private Avante(int tripDistance) {
        super(tripDistance);
    }

    public static Car of(int tripDistance) {
        return new Avante(tripDistance);
    }

    double getDistancePerLiter() {
        return distancePerLiter;
    }
    
    @Override
    public String toString() {
        return "Avante";
    }

}
