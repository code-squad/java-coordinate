package util;

import Controller.ControllerCoordinate;

public class PointException extends Exception {
    public PointException(String message) throws PointException {
        System.out.println(message);
        ControllerCoordinate.run();
    }
}
