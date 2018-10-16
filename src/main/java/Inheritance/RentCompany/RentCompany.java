package Inheritance.RentCompany;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    //RentCompany compnay = RentCompany.create();
    List<Car> carList;


    private RentCompany() {
        carList = new ArrayList<>();
    }

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car c) {
        carList.add(c);
    }

    public String generateReport() {
        StringBuilder sb = new StringBuilder();
        for (Car car : carList) {
            sb.append(car.getName() + " : " + (int)car.getChargeQuantity() + "리터\n");
        }
        return sb.toString();
    }
}
