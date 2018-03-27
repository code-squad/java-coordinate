package car.example;

public abstract class Car {

    private int tripDistance;

    Car(int tripDistance){
        this.tripDistance = tripDistance;
    }

    abstract double getDistancePerLiter();

    double getTripDistance(){
        return tripDistance;
    }

    double getChargeQuantity(){
        return getTripDistance() / getDistancePerLiter();
    }

}
