package car.example;

public class Sonata extends Car{

    public Sonata (int tripDistance){
        super.name = "Sonata";
        super.tripDistance = tripDistance;
        super.distancePerLiter = 10;
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
