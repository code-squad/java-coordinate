package rentcompany.domain;

import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

public class RentCompany {
    private static final String NEWLINE = System.getProperty("line.separator");
    private static final Logger log = getLogger(RentCompany.class);

    private List<Car> cars = new ArrayList<>();

    public static RentCompany create(){
        return new RentCompany();
    }

    public void addCar(Car car){
        cars.add(CarFactory.objectCar(car.getTripDistance(), car.getName()));
    }

    public String generateReport() {
       StringBuilder st = new StringBuilder();
        for (int i = 0; i < cars.size(); i++) {
            st.append(cars.get(i).getName()+ " : " + (int) cars.get(i).getChargeQuantity()+"리터"+ NEWLINE);
        }

        String a = st.toString();

        return a;
    }
}
