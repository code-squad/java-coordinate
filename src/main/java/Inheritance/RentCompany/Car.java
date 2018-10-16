package Inheritance.RentCompany;

public abstract class Car {
    private double tripDistance;

    public Car(double tripDistance) {
        this.tripDistance = tripDistance;
    }

    /**
     * 리터당 이동거리. 즉, 연비
     */
    abstract double getDistancePerLiter();

    /**
     * 여행 하려는 거리
     */
    protected double getTripDistance() {
        return tripDistance;
    };

    /**
     * 차종의 이름
     */
    abstract String getName();

    /**
     * 주입해야 할 연료량을 구한다.
     */
    double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    };
}
