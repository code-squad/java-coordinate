package Inheritance.RentCompany;

public class Sonata extends Car{
    public Sonata(double tripDistance) {
        super(tripDistance);
    }

    @Override
    double getDistancePerLiter() {
        return 10;
    }

    @Override
    String getName() {
        return "Sonata";
    }
}
