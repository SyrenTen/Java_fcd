package org.example.service;

import org.example.model.Car;
import java.util.List;


public interface ParkingService {
    boolean parkCar(Car car);
    Car getCar(String carNumber);
    void removeCar(String carNumber);
    void printParkedCars();

    List<Car> getCarsList();
}
