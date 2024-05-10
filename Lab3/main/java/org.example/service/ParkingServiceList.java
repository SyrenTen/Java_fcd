package org.example.service;

import java.util.ArrayList;
import java.util.List;

import org.example.model.Car;

public class ParkingServiceList implements ParkingService{
    private final List<Car> carList;
    private final int parkSize;

    public ParkingServiceList(){
        this.parkSize = 7;
        this.carList = new ArrayList<>();
    }

    @Override
    public boolean parkCar(Car car){
        try{
            if(carList.size() >= parkSize){
                throw new RuntimeException("Парковка повна");
            }
            else {
                carList.add(car);
                System.out.println("List: Машина з номером " + car.geterCarNumber() + " припаркована");
            }
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public Car getCar(String carNumber){
        for(Car car : carList){
            if (car != null && car.geterCarNumber().equals(carNumber)){
                return car;
            }
        }
        return null;
    }

    @Override
    public void printParkedCars(){
        System.out.println("List: Припарковані машини:");
        for(Car car : carList){
            if (car != null){
                System.out.println(car);
            }
        }
    }

    @Override
    public void removeCar(String searchedCarNum){
        carList.removeIf(car -> car != null && car.geterCarNumber().equals(searchedCarNum));
        System.out.println("List: Машина " + searchedCarNum + " прибрана");
    }

//    @Override
    public List<Car> getCarsList(){
        return carList;
    }
}

