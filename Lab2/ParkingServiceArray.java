package main;

public class ParkingServiceArray implements ParkingService {
    private final int parkSize;
    private final Car[] cars;

    public ParkingServiceArray(int parkSize){
        this.parkSize = parkSize;
        this.cars = new Car[parkSize];
    }

    public void parkCar(Car car){
        try{
            for(int i = 0; i < cars.length; i++){
                if(cars[i] == null){
                    cars[i] = car;
                    System.out.println("Array: Машина " + car.geterCarNumber() + " припаркована");
                    return;
                }
            }
            throw new RuntimeException("Парковка повна");
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Car getCar(String searchedCarNum){
        for (Car car : cars) {
            if (car != null && car.geterCarNumber().equals(searchedCarNum)) {
                return car;
            }
        }
        return null;
    }

    @Override
    public void removeCar(String searchedCarNum){
        for(int i = 0; i<cars.length; i++){
            if(cars[i] != null && cars[i].geterCarNumber().equals(searchedCarNum)){
                cars[i] = null;
                System.out.println("Array: Машина " + searchedCarNum + " прибрана");
            }
        }
    }

    @Override
    public void printParkedCars(){
        System.out.println("Array: Припарковані машини: ");
        for (Car car : cars) {
            if (car != null) {
                System.out.println(car);
            }
        }

    }
}
