package main;

public interface ParkingService {
    void parkCar(Car car);
    Car getCar(String carNumber);
    void removeCar(String carNumber);
    void printParkedCars();
}
