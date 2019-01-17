package rentcompany.domain;

import org.slf4j.Logger;

import java.util.HashMap;

import static org.slf4j.LoggerFactory.getLogger;

public class CarFactory {

    private static final Logger log = getLogger(CarFactory.class);

    public static Car objectCar(double input, String name){
        return newInstance(input).get(name);
    }

    public static HashMap<String, Car> newInstance(double input){
        HashMap<String, Car> car = new HashMap<>();
        car.put("Avante", new Avante(input));
        car.put("K5", new K5(input));
        car.put("Sonata", new Sonata(input));
        return car;
    }
}
