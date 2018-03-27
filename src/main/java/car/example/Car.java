package car.example;

public abstract class Car {

    abstract double getDistancePerLiter();
    abstract double getTripDistance();

    double getChargeQuantity(){
        return getTripDistance() / getDistancePerLiter();
    }

}
