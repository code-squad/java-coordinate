package car.example;

public class K5 extends Car{

    public K5(int tripDistance){
        super.name = "K5";
        super.tripDistance = tripDistance;
        super.distancePerLiter = 13;
    }

    double getDistancePerLiter(){
        return distancePerLiter;
    }

    double getTripDistance(){
        return tripDistance;
    }

    String getName(){
        return name;
    }

}
