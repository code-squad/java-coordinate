package com.zingoworks.coordinate.상속예제;


public abstract class Car {
    private static final String NEWLINE = System.getProperty("line.separator");
    /**
     * 리터당 이동 거리. 즉, 연비
     */
    abstract double getDistancePerLiter();

    /**
     * 여행하려는 거리
     */
    abstract double getTripDistance();

    /**
     * 차종의 이름
     */
    abstract String getName();

    /**
     * 주입해야할 연료량을 구한다.
     */
    double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }

    @Override
    public String toString() {
        return getName() + " : " + (int)getChargeQuantity() + "리터" + NEWLINE;
    }
}
