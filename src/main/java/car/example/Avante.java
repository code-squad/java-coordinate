package car.example;

public class Avante extends Car{

    public Avante(int tripDistance){
        super.name = "Avante";
        super.tripDistance = tripDistance;
        super.distancePerLiter = 15;
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
