package rentcar.domain;


import rentcar.dto.ResultDto;

public abstract class Car {
    private int tripDistance;
    private String name;
    private int distancePerLiter;

    public Car(String name, int tripDistance, int distancePerLiter) {
        this.tripDistance = tripDistance;
        this.name = name;
        this.distancePerLiter = distancePerLiter;
    }

    /**
     * 리터당 이동 거리. 즉, 연비
     */
    protected double getDistancePerLiter() {
        return distancePerLiter;
    }

    /**
     * 여행하려는 거리
     */
    protected double getTripDistance() {
        return tripDistance;
    }

    /**
     * 차종의 이름
     */
    protected String getName(){
        return name;
    }

    /**
     * 주입해야할 연료량을 구한다.
     */
    protected double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
}


