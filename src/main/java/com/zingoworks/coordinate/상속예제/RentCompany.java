package com.zingoworks.coordinate.상속예제;

import java.util.ArrayList;

public class RentCompany {
    private static ArrayList<Car> cars = new ArrayList<>();

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public String generateReport() {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car);
        }
        return sb.toString();
    }
}
