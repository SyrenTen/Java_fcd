package main;

import java.util.HashMap;
import java.util.Map;


public class ParkingServiceMap implements ParkingService{
    private final int parkSize;
    private final Map<String, Car> carMap;

    public ParkingServiceMap(int parkSize){
        this.parkSize = parkSize;
        this.carMap = new HashMap<>();
    }

    @Override
    public void parkCar(Car car){
        try{
            if(carMap.size() >= parkSize){
                throw  new RuntimeException("Парковка повна");
            }
            else
            {
                carMap.put(car.geterCarNumber(), car);
                System.out.println("Map: Машина " + car.geterCarNumber() + " припаркована");
            }
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Car getCar(String searchedCarNum)
    {
        return carMap.get(searchedCarNum);
    }

    @Override
    public void removeCar(String searchedCarNum)
    {
        carMap.remove(searchedCarNum);
        System.out.println("Map: Машина " + searchedCarNum + " була прибрана");
    }


    @Override
    public void printParkedCars(){
        System.out.println("Map: Припарковані машини: ");
        for(Car car: carMap.values()){
            System.out.println(car);
        }
    }

}
