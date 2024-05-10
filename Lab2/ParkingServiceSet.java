package main;

import java.util.HashSet;
import java.util.Set;


public class ParkingServiceSet implements ParkingService {
    private final int parkSize;
    private final Set<Car> carSet;

    public ParkingServiceSet(int parkSize) {
        this.parkSize = parkSize;
        this.carSet = new HashSet<>();
    }


    @Override
    public void parkCar(Car car) {
        try {
            if (carSet.size() >= parkSize) {
                throw new RuntimeException("Парковка повна!");
            } else {
                carSet.add(car);
                System.out.println("Set: Машина " + car.geterCarNumber() + " припаркована");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Car getCar(String carNumber) {
        for (Car car : carSet) {
            if (car != null && car.geterCarNumber().equals(carNumber)) {
                return car;
            }
        }
        return null;
    }

    @Override
    public void removeCar(String searchedCarNum) {
        carSet.removeIf(car -> car != null && car.geterCarNumber().equals(searchedCarNum));
        System.out.println("Set: Машина " + searchedCarNum + " прибрана");
    }

    @Override
    public void printParkedCars() {
        System.out.println("Set: Припарковані машини:");
        for (Car car : carSet) {
            if (car != null) {
                System.out.println(car);
            }

        }
    }
}
