package car.example;

public abstract class Car {

    double distancePerLiter;
    String name;
    double tripDistance;

    abstract double getDistancePerLiter();

    abstract double getTripDistance();

    abstract String getName();

    double getChargeQuantity(){
        return getTripDistance() / getDistancePerLiter();
    }

}
